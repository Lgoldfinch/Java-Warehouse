package level1;

public class HelloWorld {
	public static void main(String[] args) {

		q2 q21 = new q2(); // created an instance of that class. Prevents having to use static.
		String welcome = "Hello louis!";

		System.out.println("Hello World!");
		System.out.println(welcome);
		System.out.println(q21.hello("Hello"));
		System.out.println(q21.party("dollop"));
		System.out.println(q21.tissue(3, 7));
		System.out.println(q21.tissue(3, 9));
		System.out.println(q21.retuurn("Hello World"));
		System.out.println(q21.tissue2(2, 2, false));
		System.out.println(q21.tissue3(4, 3, true));
		System.out.println(q21.mug(1, 0, true));
		int [] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		System.out.println(q21.mug(array[1], array[8], false));
	}
}
