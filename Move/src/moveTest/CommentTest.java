package moveTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import move.Comment;

public class CommentTest {
	Comment c = new Comment(1,"Got to get down on Friday."); 
//	@Test
//	public void testIntialiseComment() {
//	assetNotNull(c);
	
	@Test
public void testLeaveComment () { 
	assertTrue("No comment left", c.leaveComment(2, "Got to get down on friday."));	
	}
    
}