package level2;

public class Blackjack {

	public int numbers(int a, int b) {
		if (a == b && a < 22) {
		if (a > b && a < 22)
			return a;
		
			else if (a == b && a > 22)
				 if (a > 21 || b > 21 )
				return 0;
			
			else if (a < b && b < 22)
				return b;	
}
		return 0;
}
}
