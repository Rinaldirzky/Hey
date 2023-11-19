package vehicles;
public class Motorcycle {
	public int gear;
	public int speed;
	public Motorcycle(int startSpeed, int startGear) {
		gear = startGear;
		speed = startSpeed;
	}
	public void setGear(int newValue) {
		gear = newValue;
	}
	public void setSpeed(int newValue) {
		speed = newValue;
	}
	public int getGear() {
		return gear;
	}
	public int getSpeed() {
		return speed;
	}
	public void applyBrake(int decrement) {
		speed -= decrement;
	}
	public void speedUp(int increment) {
		speed += increment;
	}
}
