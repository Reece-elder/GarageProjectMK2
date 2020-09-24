package Main;

public class Runner {

	public static void main(String[] args) {
		
		Vehicle car = new Car("Ford","Red","B",45080, true, false, 5);
		Vehicle motorcycle = new Motorcycle("Kawasaki", "Blue", "C",13000, false, false, 12.3f);
		Vehicle tank = new Tank("Chrysler Defence", "Camo", "A", 56970, true, true, 5f);
		
		Vehicle car2 = new Car("Honda","Purple","C",14050, false, false, 3);
		Vehicle motorcycle2 = new Motorcycle("Ducati", "Yellow", "A",27410, true, true, 10.5f);
		Vehicle tank2 = new Tank("Land Defense Limited", "Dark Green", "C", 39450, false, true, 8f);
		
		Garage garage = new Garage();
		
		garage.addVehicle(car);
		garage.addVehicle(motorcycle);
		garage.addVehicle(tank);
		garage.listGarage();
		garage.fixVehicle("Car");
		garage.fixVehicle("Motorcycle");
		garage.fixVehicle("Tank");
		garage.addVehicle(car2);
		garage.addVehicle(motorcycle2);
		garage.addVehicle(tank2);
		garage.listGarage();
		garage.removeVehicle("Car");
		garage.listGarage();
		garage.emptyGarage();
		//garage.addVehicle(motorcycle);
		//garage.fixVehicle("Motorcycle");
		//garage.removeVehicle("Car");
		//garage.emptyGarage();


	}

}
