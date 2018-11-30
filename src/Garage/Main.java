package garage;

import java.util.ArrayList;

public class Main {

	public static void main (String args[]) {
		

		
		 Car car1 = new Car("Toyota", "Pan", 250.00, 100, "Red");
		 Car car2 = new Car("Mercedes", "Guil", 400.00, 70, "Black");
		// Car car3 = new Car("Volvo", "Stein", 300.00, 120, "Yellow");
		
		 Garage firstGarage = new Garage();
		
		
		 firstGarage.addVehicle(car1);
		 firstGarage.addVehicle(car2);

		 System.out.println(firstGarage.toString());
	
		 firstGarage.removeVehicle(car1);
		
		 System.out.println(firstGarage.toString());

		 
		
		
	}
}
