package calculatorTest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import calculator.Calculator;

public class calculatorTest {

	Calculator calc = new Calculator();
	int[] numbers = {2, 4, 6, 8};
	
	@Test
	public void existanceCheck() {
		assertNotNull(calc);
	}
	
	@Test 
	public void addMethod() { 
		assertEquals("Result for addition does not match", "2 + 4 = 6\n2 + 6 = 8\n", calc.addNumbers(numbers));
	}
	
	@Test
	public void subMethod() {
		assertEquals("Result for subtraction does not match", "8 - 6 = 2\n6 - 4 = 2\n", calc.subtractNumbers(numbers));
	}
	
	@Test
	public void mulMethod() {
		assertEquals("Result for multiplication does not match", "4 * 3 = 12\n", calc.multiplyNumbers(4, 3, 12));
	}
	
	@Test
	public void divMethod() {
		assertEquals("Result for division does not match", "12 / 3 = 4\n12 / 4 = 3\n", calc.divideNumbers(12, 3, 4));
	}
	
	@Test 
	public void checkAllMethods() {
		assertEquals("Total result is not correct", "5 * 3 = 15\n15 / 5 = 3\n15 / 3 = 5\n", calc.getNumberSeries(15, 5, 3));
	}
		
}
