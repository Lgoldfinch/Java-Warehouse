package calculator;

public class Calculator {
	private String returnSentence = "";
	
	public Calculator() {
		
	}
	
	public String addNumbers(int[] numbers) {//(int a, int b, int c) {
		for (int i = 0; i < numbers.length; i++) {
			for(int j = i+1; j < numbers.length; j++) {
				for(int k = j+1; k < numbers.length; k++) {
					if (numbers[i] + numbers[j] == numbers[k]) {
						returnSentence += numbers[i] + " + " + numbers[j] + " = " + numbers[k] + "\n";
					}
				}
			}				
		}
	//	System.out.println(returnSentence);
		return returnSentence;
	}
	
	public String subtractNumbers(int[] numbers) {
		/*if (a - b == c)
			returnSentence += a + " - " + b + " = " + c + "\n";
		if (a - c == b)
			returnSentence += a + " - " + c + " = " + b + "\n";
		if (b - c == a)
			returnSentence += b + " - " + c + " = " + a + "\n";
		if (b - a == c)
			returnSentence += a + " - " + b + " = " + c + "\n";
		if (c - a == b)
			returnSentence += a + " - " + c + " = " + b + "\n";
		if (c - b == a)
			returnSentence += b + " - " + c + " = " + a + "\n";*/
		
		
		for (int i = 0; i < numbers.length; i++) {
			for(int j = i+1; j < numbers.length; j++) {
				for(int k = j+1; k < numbers.length; k++) {					
					if (numbers[i] - numbers[j] == numbers[k]) {
						returnSentence += numbers[i] + " - " + numbers[j] + " = " + numbers[k] + "\n";
					}
				}
			}				
		}
		
		for (int i = numbers.length-1; i >= 0; i--) {
			for(int j = i; j >= 0; j--) {
				if (j != i) {
				for(int k = j; k >= 0; k--) {				
					if (k!=j) {
						if (numbers[i] - numbers[j] == numbers[k]) {
							returnSentence += numbers[i] + " - " + numbers[j] + " = " + numbers[k] + "\n";
						}
					}
				}
				}
			}				
		}
		System.out.println(returnSentence);
		return returnSentence;
	} 
	
	public String multiplyNumbers(int[] numbers) {
		
//		if (a * b == c)
//			returnSentence += a + " * " + b + " = " + c + "\n";
//		if (a * c == b)
//			returnSentence += a + " * " + c + " = " + b + "\n";
//		if (b * c == a)
//			returnSentence += b + " * " + c + " = " + a + "\n";
		
		for (int i = 0; i < numbers.length; i++) {
			for(int j = i+1; j < numbers.length; j++) {
				for(int k = j+1; k < numbers.length; k++) {
					if (numbers[i] + numbers[j] == numbers[k]) {
						returnSentence += numbers[i] + " + " + numbers[j] + " = " + numbers[k] + "\n";
		
		
	//	System.out.println(returnSentence);
		return returnSentence;
	}
	
	public String divideNumbers(int a, int b, int c) {
		if (a / b == c)
			returnSentence += a + " / " + b + " = " + c + "\n";
		if (a / c == b)
			returnSentence += a + " / " + c + " = " + b + "\n";
		if (b / c == a)
			returnSentence += b + " / " + c + " = " + a + "\n";
		if (b / a == c)
			returnSentence += a + " / " + b + " = " + c + "\n";
		if (c / a == b)
			returnSentence += a + " / " + c + " = " + b + "\n";
		if (c / b == a)
			returnSentence += b + " / " + c + " = " + a + "\n";
		
		//System.out.println(returnSentence);
		return returnSentence;
	} 
	
	public String getNumberSeries(int a, int b, int c) {
		addNumbers(numbers);
		subtractNumbers(a, b, c);
		multiplyNumbers(a, b, c);
		divideNumbers(a, b, c);
		
		return returnSentence;
	}

}
