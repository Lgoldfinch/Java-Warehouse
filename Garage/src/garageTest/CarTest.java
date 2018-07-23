package garageTest;

import static org.junit.Assert.*;

import org.junit.Test;

import garage.Car;

public class CarTest {
	@Test 
	public void testMakingCar() {
		Car c = new Car("4x4","Ford",true,"Banger", 5 , 6 , 4);
		assertNotNull(c);
	}
	@Test
	public void testCarHasType() {
		Car c = new Car("4x4","Ford",true,"Banger", 5 , 6 , 4);
		assertEquals("Car has no type",c.getCarType(),"4x4");
	}
	@Test
	public void testCarHasBrand() {
		Car c = new Car("4x4","Ford",true,"Banger", 5 , 6 , 4);
		assertEquals("Car has no brand",c.getBrand(),"Ford");
	}
	@Test
	public void testSetCarType() {
	Car c = new Car("4x4","Ford",true,"Banger", 5 , 6 , 4);
    c.setCarType("4x4");
	assertEquals("Car has no type",c.getCarType(),"4x4"); 
}
	@Test 
	public void testSetBrand() {
		Car c = new Car("4x4","Ford",true,"Banger", 5 , 6 , 4);
	    c.setBrand("Ford");
		assertEquals("Car has no brand",c.getBrand(),"Ford"); 
}
}

