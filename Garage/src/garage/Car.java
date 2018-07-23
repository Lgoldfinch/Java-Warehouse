package garage;

public class Car extends Vehicle {
	private String carType; 
	private String brand; // All vehicles have brands but you get different brands between vehicles. Does this mean I should define it in here or in the vehicle class? 

	public Car(String carType, String brand, boolean engine, String name, int door, int peopleCapacity, int numberOfWheels) {
		super(engine, name, door, peopleCapacity, numberOfWheels);
		this.carType = carType;
		this.brand = brand; 
	}

	public String getCarType() {
		return this.carType; 
	}
	public void setCarType(String carType) {
		this.carType = carType; 
	}
	public String getBrand() {
		return this.brand; 
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String calculateCarBill() {
		String cCB = ("£" + "200"); 
		return cCB;
	}

}
