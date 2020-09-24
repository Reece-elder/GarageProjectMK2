package Main;

import java.util.ArrayList;

public class Garage {

	ArrayList<Vehicle> garage = new ArrayList<Vehicle>();

	public void addVehicle(Vehicle vehicle) {
		// Adds a vehicle to the specific garage
		garage.add(vehicle);
		System.out.println(vehicle + " added to Garage");
	}

	public void listGarage() {
		// Lists the vehicles in the current garage
		System.out.println("Vehicles currently in Garage " + garage);

	}

	public void removeVehicle(String type) {
		// Removes a specific vehicle from the garage
		ArrayList<Vehicle> removalList = new ArrayList<>();

		for (Vehicle obj : garage) {
			if (obj.getClass().getName().endsWith(type)) {
				removalList.add(obj);
			}
		}
		System.out.println("Vehicles for removal : " + removalList);
		this.garage.removeAll(removalList);
	}
	
	public void emptyGarage() {
		garage.removeAll(garage);
		System.out.println("Garage Empty: " + garage);
	}
	
	public float fixVehicle(String type) {
		
		float repairCost =0;
		float repairMod =0;
		Boolean repairIssue1 = false;
		Boolean repairIssue2 = false;
		String repair1Name = "0";
		String repair2Name = "0";
		System.out.println(type);
		
		for (Vehicle obj : garage) {
			if (obj.getClass().getName().endsWith(type)) {
				if (obj.condition == "A"){
					repairMod = 1f;
				} else if (obj.condition == "B") {
					repairMod = 1.5f;
				} else if (obj.condition == "C") {
					repairMod = 3f;
				}
				if (obj instanceof Car) {
					repair1Name = "Four Wheel Drive";
					repair2Name = "Quad Suspension";
					if (((Car) obj).fourWD == true ) {
						repairIssue1 = true;
					} 
					if (((Car) obj).quadSuspen == true ) {
						repairIssue2 = true;
					}
				} 
				
				if (obj instanceof Motorcycle) {
					repair1Name = "Liquid Cooling";
					repair2Name = "Side Car Attachment";
					if (((Motorcycle) obj).liquidCooling == true) {
						repairIssue1 = true;
					} 
					if (((Motorcycle) obj).hasSideCar == true) {
						repairIssue2 = true;
					}
				} 
				
				if (obj instanceof Tank) {
					repair1Name = "Turret Attachment";
					repair2Name = "Full Tracks";
					if (((Tank) obj).hasTurret == true) {
						repairIssue1 = true;
					} 
					if (((Tank) obj).fullTracks == true) {
						repairIssue2 = true;
					}
				} 
				repairCost = (obj.value / 20) * repairMod;
				System.out.println(obj.value);
				System.out.println("Vehicle Repair Cost : " + "Condition : " + obj.condition + "    " + repair1Name + " : " + repairIssue1 + "    " +  repair2Name + " : " + repairIssue2 + "   Final Repair cost modifier : " + repairMod);
				System.out.println("Vehicle Repair Cost : " + repairCost);
			}
			if (repairIssue1 == true) {
				repairMod = repairMod * 3f;
			} 
			if (repairIssue2 == true) {
				repairMod = repairMod * 4f;
			} 
		}
		return repairCost;
	}

}
