package Garage;

public abstract class Vehicle {

	///////////////////// Attributes/////////////////////////////
	protected String name;
	protected double price;
	protected int speed;
	protected String colour;

	/////////////////// Constructors/////////////////////////////

	public Vehicle(String Vname, double Vprice, int Vspeed) {
		this.name = Vname;
		this.price = Vprice;
		this.speed = Vspeed;
		this.colour = null;

	}

	public Vehicle(String Vname, double Vprice, int Vspeed, String Vcolour) {
		this.name = Vname;
		this.price = Vprice;
		this.speed = Vspeed;
		this.colour = Vcolour;
	}

	////////////////// Methods///////////////////////////////
	
	public int getSpeed() {
		return this.speed;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public String getColour() {
		return this.colour;
	}


	public void accelerate(int Vspeed) {
		this.speed = Vspeed++;
	};

	public void deccelerate(int Vspeed) {
		this.speed = Vspeed--;
	};

}
