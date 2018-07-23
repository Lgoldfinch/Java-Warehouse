package garage;

public class Plane extends Vehicle{
	private boolean wings;
	private boolean windows; 

	public Plane(boolean wings, boolean windows, boolean engine, String name, int door, int peopleCapacity, int numberOfWheels) {
		super(engine, name, door, peopleCapacity, numberOfWheels);
		this.wings = wings;
		this.windows = windows; 
	}
	public boolean getWings() {
		return this.wings;
	}
	public void setWings(Boolean wings) {
		this.wings = wings; 
	}
	public boolean getWindows() {
		return this.windows; 
	}
	public void setWindows(boolean windows) {
		this.windows = windows; 
	}
	}
