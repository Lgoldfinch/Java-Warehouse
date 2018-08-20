package moveTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import move.AdminUser;
import move.Comment;

public class CommentTest {
	Comment c = new Comment(1,"Wowaweewa"); 
	AdminUser au = new AdminUser("johnboy@gmail.com",5, 1);

	@Test
public void testLeaveComment () {
	assertEquals("No comment left", c.leaveComment(1,"wow"), "__");	
	c.deleteOwnComment(1,5);
	}
	
    @Test
    public void testDeleteComment () {
    	c.leaveComment(1,"wow");
    assertEquals("Comment not deleted.", c.deleteOwnComment(1, 5),"__");// If any new comments are inserted these tests will not work.
    }
    
    @Test
    public void testAdminDeleteComment() {
    	c.leaveComment(1, "wow");
    	assertEquals("Comment not deleted.", c.adminDeleteComment(1,5, au), "__");
    }
    
    public void testEditComment() {
    	c.leaveComment(1, "wow");
    	assertEquals("Comment not updated", c.editComment(1, 5, "wow3"), "__"); // would this be better if I did a SQL query within the tests? 
    	c.deleteOwnComment(1,5); // I could search up to see if the new comment matches the input.
    }
    
}