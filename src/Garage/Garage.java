package garage;

import java.util.ArrayList;

public class Garage {

	
	private ArrayList<Vehicle> Garage = new ArrayList<Vehicle>();
	
	public void addVehicle(Vehicle a) {
		Garage.add(a);
	}
	
	public void removeVehicle(Vehicle b) {
		Garage.remove(b);
	}

	public String toString() {
		return Garage.toString();
		
	}
	
	public double fixVehicle(Vehicle a, boolean yes) {
		
		double chargeForFix = 50.00; 
		double noCharge = 0.0;
		
		if( yes) {
			return chargeForFix;
		}
		
		return noCharge;
	}
	
	
	public double paintJob(Vehicle b, boolean yes) {
		double paintJobCharge;
		double noCharge = 0.0;
		
		if(b.getColour().equals("Yellow")) {
			paintJobCharge = 60.00;
			return paintJobCharge;
		}
		else if( b.getColour().equals("Red")){
			paintJobCharge = 80.00;
			return paintJobCharge;
		}
		
		return noCharge;
		
	}
	

 	public void paintJobBill(ArrayList<Vehicle> a) {
	
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
	
	
	public double getBill() {
		return 0.0;
	}
	
}
