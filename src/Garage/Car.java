package garage;

public class Car extends Vehicle {
///////////////////////////////Attributes///////////////////////////
	
	String brand;
	


////////////////////////////Constructors////////////////////////////
	
	
	public Car (String Vbrand, String Vname, double Vprice, int Vspeed, String Vcolour) {
		super(Vname, Vprice, Vspeed, Vcolour);
		this.brand = Vbrand;
		
	}
	
	
//////////////////////////methods//////////////////////////////////

	public String getBrand() {
		return this.brand;
	}
	
	
	public void startIgnition() {
		System.out.print("Ignition on");
	}
	
	public void endingIgnition() {
		System.out.print("Ignition off");
	}
	
	
	
	public String toString() {
		return    "Brand: "    + this.getBrand()     + " " 
		       + " Name: "     + this.getName()     + " " 
		       + " Price: £"   + this.getPrice()    + " " 
		       + " Speed: "     + this.getSpeed()    + " " 
		       + " Colour: "    + this.getColour();
	}
	
	public int speedingUp() {
		accelerate(getSpeed());
		return getSpeed();
	}
	

	public int speedingDown() {
		deccelerate(getSpeed());
		return getSpeed();
	}
	
	
}
