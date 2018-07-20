package people;

import java.util.ArrayList;

public class Person {

	/////////////////////////Attributes///////////////////////////////////////////////
	private String name;
	private int age; 
	private String jobTitle; 
	////////////////////////Constructors//////////////////////////////////////////////
public Person(String name, int age, String jobTitle) {
		this.name = name; 
		this.age = age;
		this.jobTitle = jobTitle;
	}
	///////////////////////////Methods////////////////////////////////////////////////
	public String getName() { 
		return this.name;
	}
	public int getAge() { 
		return this.age; 
	}
	public String getJobTitle() {
		return this.jobTitle; 
	}

public String toString() {
		String fd =  (this.name + " " + Integer.toString(this.age) + " " + this.jobTitle);
		return fd; 

	}
}



