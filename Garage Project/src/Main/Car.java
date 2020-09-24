package Main;

public class Car extends Vehicle {
	
	public boolean fourWD;
	public boolean quadSuspen;
	public int noOfDoors;
	
	public Car() {
		super();
	}
	
	public Car(String model, String colour, String condition, float value, boolean fourWD, boolean quadSuspen, int noOfDoors) {
		super(model, colour, condition, value);
		this.fourWD = fourWD;
		this.quadSuspen = quadSuspen;
		this.noOfDoors = noOfDoors;
	}
	

}
