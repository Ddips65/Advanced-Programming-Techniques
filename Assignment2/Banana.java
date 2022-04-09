/**
* class Banana describes the properties of the banana like angel, velocity.
* Every banana’s angel and velocity is set by the player. 
* Here banana used as weapon to throw it each other.
*/

public class Banana {

	private double angle;
	private double velocity;
	
	public Banana(double angle, double velocity) { 
		this.angle = angle;
		this.velocity = velocity;
	}

// getters and setters for angle and velocity.Player set the angle and velocity
	public double getAngle() {
		return angle;
	}

	public void setAngle(double angle) {
		this.angle = angle;
	}

	public double getVelocity() {
		return velocity;
	}

	public void setVelocity(double velocity) {
		this.velocity = velocity;
	}

}
