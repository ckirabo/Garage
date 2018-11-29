package gTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


import org.junit.Test;

import garage.Car;

public class CarTest {
	
	@Test
	public void testMakeCar() {
		Car newCar = new Car("Mercedes","Magic",200.00,19,"Silver");
		assertNotNull("A new car was not made",newCar);
	}
	
	@Test
	public void testSpeed() {
		Car newCar = new Car("Mercedes","Magic",200.00,10,"Silver");
		assertEquals("The car speed is not 10",newCar.getSpeed());
	}
	


}
