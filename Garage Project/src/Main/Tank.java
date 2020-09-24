package Main;

public class Tank extends Vehicle{
	
	public boolean hasTurret;
	public boolean fullTracks;
	public float shellCapacity;
	
	public Tank() {
		super();
	}

	public Tank(String model, String colour, String condition, float value, boolean hasTurret, boolean fullTracks, float shellCapacity) {
		super(model, colour, condition, value);
		this.hasTurret = hasTurret;
		this.fullTracks = fullTracks;
		this.shellCapacity = shellCapacity;
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
		
		if (this.hasTurret == true) {
			repairMod += 2f;
		}
		if (this.fullTracks == true) {
			repairMod += 2.5f;
		}
		
		bill = (repairMod * this.value) / 20;
		System.out.println("Tank repaired!");
		System.out.println("Vehicle Repair Cost : " + "Condition - " + this.condition + "  " + "   Final Repair cost modifier - " + repairMod);
		System.out.println("Vehicle Repair Cost : " + bill);
		return bill;
	}
	
	

}
