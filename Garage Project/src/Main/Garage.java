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
			if (obj.getClass().getSimpleName().equalsIgnoreCase(type)) {
				removalList.add(obj);
			}
		}
		System.out.println("Vehicles for removal : " + removalList);
		this.garage.removeAll(removalList);
	}
	
	public void emptyGarage() {
		//Empties out the garage
		garage.removeAll(garage);
		System.out.println("Garage Empty: " + garage);
	}
	
	public float calcBill(String type) {
		//Calculates a bill for the vehicle repaired of class type
		float bill = 0;
		for (Vehicle obj : garage) {
			if (obj.getClass().getSimpleName().equalsIgnoreCase(type)) {
			bill += obj.calcRepair();
			}

		}
		System.out.println(type + " repair cost: " + bill);
		return bill;
	}

}
