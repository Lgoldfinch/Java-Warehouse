package people;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
        Person p1 = new Person("Josh", 29, "Doctor"); 
		Person p2 = new Person("Iqbal", 45, "Librarian");
		Person p3 = new Person("Josia", 20, "Student");
	    Person p4 = new Person("Hannah", 22, "Film Maker");
		
	    ArrayList<Person> P = new ArrayList <>();
	    P.add(p1);
	    P.add(p2);
	    P.add(p3);
	    P.add(p4);
	    
	    	for (Person fd : P )
	    		System.out.println(fd);
	    }
	    {
	    	
	    }
	}
