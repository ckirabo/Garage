package garage;

import java.util.ArrayList;

public class Garage {

	public static void main(String args[]) {
		
	Car car1 = new Car("Toyota", "Pan", 250.00, 100, "Red");
	Car car2 = new Car("Mercedes", "Guil", 400.00, 70, "Black");
	Car car3 = new Car("Volvo", "Stein", 300.00, 120, "Yellow");
	
	ArrayList<Vehicle> newGarage = new ArrayList<Vehicle>();
	
	newGarage.add(car1);
	newGarage.add(car2);
	newGarage.add(car3);
	

	paintJobBill(newGarage);
	
	}
	
	// method to find the price and calculate the price for repairs depending on its type
	
	public static void paintJobBill(ArrayList<Vehicle> a) {
		//give ID??
		double originalPrice;
		double paintJobBill;
		double total;
		
		for(int i = 0; i < a.size(); i++) {
			originalPrice = a.get(i).getPrice();
			
			
		
			if(a.get(i).getColour().contentEquals("Yellow")) {
				total = originalPrice + 50.00;
				System.out.println(a.get(i).getName()+ " " + total);
			}
			
			else if (a.get(i).getColour().contentEquals("Red")) {
				total = originalPrice + 80.00; 
				System.out.println(a.get(i).getName()+ " " + total);
			}
			
		
		}
		
		
	}
	
	
	
	
	public static double getBill() {
		return 0.0;
	}
	
}
