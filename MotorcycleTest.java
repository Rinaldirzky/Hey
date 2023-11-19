package tests;
import vehicles.*;
import org.junit.*;
import static org.junit.Assert.*;
public class MotorcycleTest {
	@Test
	public void test_applyBrake() {
		System.out.println("Test applyBrake method ...");
		Bicycle Bike = new Bicycle(10, 20, 1);
		assertEquals(Bike.getGear(), 1);
		assertEquals(Bike.getSpeed(), 20);
		Bike.setGear(2);
		Bike.setSpeed(30);
		assertEquals(Bike.getGear(), 2);
		assertEquals(Bike.getSpeed(), 30);
		Bike.applyBrake(10);
		assertEquals(Bike.getSpeed(), 20);
	}
	@Test
	public void test_speedUp() {
		System.out.println("Test speedUp method ...") ;
		Bicycle Bike = new Bicycle(10, 20, 1);
		assertEquals(Bike.getGear(), 1);
		assertEquals(Bike.getSpeed(), 20);
		Bike.setGear(2);
		Bike.setSpeed(30);
		assertEquals(Bike.getGear(), 2);
		assertEquals(Bike.getSpeed(), 30);
		Bike.speedUp(5);
		assertEquals(Bike.getSpeed(), 35);
	}
}
