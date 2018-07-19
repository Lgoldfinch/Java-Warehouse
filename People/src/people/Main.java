package people;

public class Main {

	public static void main(String[] args) {

		Person p = new Person("Josh", 29, "Doctor"); 
		Person p2 = new Person("Iqbal", 45, "Librarian");
		Person p3 = new Person("Josia", 20, "Student");
		Person p4 = new Person("Hannah", 22, "Film Maker");
		System.out.println(p.fullDetails());
		System.out.println(p2.fullDetails());
		System.out.println(p3.fullDetails());
		System.out.println(p4.fullDetails());
	}

}
