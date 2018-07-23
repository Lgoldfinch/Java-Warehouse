package garage;

public class Motorcycle extends Vehicle {
private String motorcycleType;

public Motorcycle(String motorcycleType, boolean engine, String name, int door, int peopleCapacity, int numberOfWheels) {
	super(engine, name, door, peopleCapacity, numberOfWheels); // What does super do? 
	this.motorcycleType = motorcycleType; 
}

public String getMotorcycleType() {
	return motorcycleType;
}

public void setMotorcycleType(String motorcycleType) {
	this.motorcycleType = motorcycleType;
}
}
