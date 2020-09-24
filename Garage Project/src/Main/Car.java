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
		
		if (this.fourWD == true) {
			repairMod += 2f;
		}
		if (this.quadSuspen == true) {
			repairMod += 2.5f;
		}
		
		bill = (repairMod * this.value) / 20;
		System.out.println("Car repaired!");
		System.out.println("Vehicle Repair Cost : " + "Condition - " + this.condition + "  " + "   Final Repair cost modifier - " + repairMod);
		System.out.println("Vehicle Repair Cost : " + bill);
		return bill;
	}
	

}
