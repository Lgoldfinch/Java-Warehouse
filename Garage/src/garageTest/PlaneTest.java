package garageTest;

import static org.junit.Assert.*;

import org.junit.Test;

import garage.Plane;

public class PlaneTest {
	@Test
	public void testMakingPlane() {
		Plane p = new Plane(true, true, true, "Boeing", 4, 100, 6);
		assertNotNull(p);		
	}
	@Test
	public void testPlaneHasWings() {
		Plane p = new Plane(true, true, true, "Boeing", 4, 100, 6);
		assertEquals("Plane does not have wings", p.getWings(),true);
	}
	@Test
	public void testPlaneHasWindows() { 
		Plane p = new Plane(true, true, true, "Boeing", 4, 100, 6);
		assertEquals("Plane does not have windows", p.getWindows(),true);
	}
	@Test 
	public void testSetWings() {
		Plane p = new Plane(true, true, true, "Boeing", 4, 100, 6);
		p.setWings(true);
		assertEquals("Plane does not have wings", p.getWings(),true);
	}
	@Test 
	public void testSetWindows() {
		Plane p = new Plane(true, true, true, "Boeing", 4, 100, 6);
		p.setWindows(true);
		assertEquals("Plane does not have windows", p.getWindows(),true);
	}
}
