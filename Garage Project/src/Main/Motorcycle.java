package Main;

public class Motorcycle extends Vehicle {
	
	public boolean hasSideCar;
	public boolean liquidCooling;
	public float tankCapacity;
	

	public Motorcycle() {
		super();
	}


	public Motorcycle(String model, String colour, String condition, float value, boolean hasSideCar,
			boolean liquidCooling, float tankCapacity) {
		super(model, colour, condition, value);
		this.hasSideCar = hasSideCar;
		this.liquidCooling = liquidCooling;
		this.tankCapacity = tankCapacity;
	}
	
	
	
	

}
