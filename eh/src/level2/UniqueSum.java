package level2;

public class UniqueSum {

	public int uniqueSum(int a, int b, int c) {
		if  ( a==b && c != a) {
			return c;}
		else if ( a==c && b != a)
			return b;
		else if (b==a && c != a)
			return c;
		else if (b==c && a != b)
			return a; 
		else if ( a != b && c != a && c != b) 
			return (a + b + c);
		else if ( a == b && b==c)
			return 0;
		else return 0;
	}
}


