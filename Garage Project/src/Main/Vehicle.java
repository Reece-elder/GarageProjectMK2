package Main;

public class Vehicle {
	
	protected String model;
	protected String colour;
	protected String condition;
	protected float value;
	
	public Vehicle() {
		this("!!EMPTY!!","!!EMPTY!!","!!EMPTY!!", 0);
	}
	
	public Vehicle(String model, String colour, String condition, float value) {
		this.model = model;
		this.colour = colour;
		this.condition = condition;
		this.value = value;
		
	}

	@Override
	public String toString() {
		return "Vehicle [model=" + model + ", colour=" + colour + ", condition=" + condition
				+ ", value=" + value + "]";
	}

}
