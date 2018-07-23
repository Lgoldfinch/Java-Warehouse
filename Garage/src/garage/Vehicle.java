package garage;

public abstract class Vehicle extends Garage { // Am I making this abstract.
	protected boolean engine;
	private int numberOfWheels; 
	private String name;
	private int peopleCapacity;
	private int door; 
	private int speed; 

	public Vehicle(boolean engine, String name, int door, int peopleCapacity, int numberOfWheels) { 
		this.engine = engine;
		this.numberOfWheels = numberOfWheels;
		this.name = name; 
		this.door = door;
		this.peopleCapacity = peopleCapacity; 
	}
	public boolean getEngine() {
		return this.engine; 
	}
	public void setEngine(boolean engine) {
		this.engine = engine;
	}
	public int getNumberOfWheel() { 
		return this.numberOfWheels;
	}
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	public String getName() {
		return this.name; 
	}
	public void setName(String name) {
		this.name = name; 
	}
	public int getPeopleCapacity() {
        return this.peopleCapacity;
	}
	public void setPeopleCapacity(int peopleCapacity) {
		this.peopleCapacity = peopleCapacity; 
	}
	public int getDoor() {
    return this.door; 		
	}
	public void setDoor(int door) {
		this.door = door; 
	}
	public int getSpeed() {
		return this.speed; 
	}
	public void setSpeed(int speed) {
		this.speed = speed; 
	}
	
//	public int createVehicleID(int ID, ) {
//		
//	}
	
	
}
