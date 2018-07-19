package peopleTest;

import static org.junit.Assert.*;

import org.junit.Test;

import people.Person;

public class personTest {
	@Test
	public void testMakingPerson() {
		Person p = new Person("Jim", 4, "Doctor");
		assertNotNull(p);
		}
	
	@Test 
	public void testPersonHasAge() {
	Person p = new Person("Jim", 4, "Doctor");
	assertEquals("Person has no age",p.getAge(), 4 );
	}
	@Test 
	public void testPersonHasName() {
		Person p = new Person("Jim", 4, "Doctor");
		assertEquals("Person has no name",p.getName(),"Jim");
	}
	@Test
	public void testPersonHasJobTitle() {
		Person p = new Person("Jim", 4, "Doctor");
		assertEquals("Person has no Job Title",p.getJobTitle(),"Doctor");
	}
	@Test 
	public void testCompilationOfDetails() {
		Person p = new Person("Jim", 4, "Doctor");
		assertEquals("Name is compiled in the wrong order", p.fullDetails(), "Jim 4 Doctor");
	}
}
