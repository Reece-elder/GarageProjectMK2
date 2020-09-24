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
	
	@Override
	public float calcRepair() {
		
		float repairMod =0f;
		float bill;
		
		if (this.condition == "A"){
			repairMod = 1f;
		} else if (this.condition == "B") {
			repairMod = 1.5f;
		} else if (this.condition == "C") {
			repairMod = 3f;
		}
		
		if (this.hasSideCar == true) {
			repairMod += 2f;
		}
		if (this.liquidCooling == true) {
			repairMod += 2.5f;
		}
		
		bill = (repairMod * this.value) / 20;
		System.out.println("Motorcycle repaired!");
		System.out.println("Vehicle Repair Cost : " + "Condition - " + this.condition + "  " + "   Final Repair cost modifier - " + repairMod);
		System.out.println("Vehicle Repair Cost : " + bill);
		return bill;
		
	}
	

}
