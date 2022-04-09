/* GorillaGame is an abstract class which describes general attributes of a gorilla game.
Like it's position here we set the position by x and y cooridnates.Other attributes likely 
sunmouth, win, dancetime */

public abstract class GorillaGame {
	private double X;
	private double Y;
	String weather = "sunny";
	boolean sunmouth = true;
	boolean dancing;
	boolean win = true;
	long dancetime;

	public double getX() {
		return X;
	}

	public double getY() {
		return Y;
	}

	public void setX(double X) {
		this.X = X;
	}

	public void setY(double Y) {
		this.Y = Y;
	}

	/**
	 * By default, draw the sun with smiley face.(if sunmouth == true) In the game
	 * when gorilla throw the banana and hits the sun at that time draw the sun with
	 * open mouth face and when banana fall down then sets the default sun picture
	 * with smiley face. (it's animation)
	 */

	public void drawSun() {

		if (sunmouth == true) {
			System.out.println("Draw the sun with smiley face.");
		} else {
			System.out.println("Draw the sun without smile and open mouth face.");
		}
	}

	/**
	 * Darw the gorilla use above x and y parameter.If required pass other
	 * additional parameter to draw the gorilla.
	 */
	public void drawGorilla() {
	}

	/**
	 * tThrow() invoked when player's turn will come.
	 *
	 * @param angle    double
	 * @param velocity double
	 * @return banana
	 */
	public Banana tThrow(double angle, double velocity) {
		Banana banana = new Banana(angle, velocity);
		return banana;
	}

	/**
	 * This method determine on which case gorilla is destroy 1)When one gorilla hit
	 * another gorilla opponent gorilla is destroy. 2)When gorilla hit the banana on
	 * his self at that time also gorilla destroy.
	 */
	public void destroy() {

	}

	/**
	 * When enemy is used banana as a weapon to throw each other but instead of
	 * hitting each other,banana fall down on the building and some part of the
	 * building is damaged or broken.
	 */
	public void damegeBuliding() {

	}

	/**
	 * This method is used to determine the position of the gorilla when it moves on
	 * the building.
	 */
	public void gorillaMove() {

	}

	/**
	 * If gorilla hit another gorilla then perform dance activity and hands will
	 * move
	 *
	 * @param dancing boolean
	 */

	public void dance(boolean dancing) { 

		if (dancing == true) {
			dancetime = System.currentTimeMillis(); 
			System.out.println("When gorila hit another gorila then oponent gorila perform dance activity.");
		} else {
			System.out.println("Gorila does not hit another gorila.");
		}
	}

	/**
	 * First write some code for win the game and check player win or not If player
	 * can not win then set win=false after that check below if condition But here
	 * we just create the blueprint of the game.
	 */
	public void dance() {

		if (win == true) {
			dancetime = System.currentTimeMillis();
			System.out.println("Player won the game and perform the dance activity.");
		} else {
			System.out.println("Player can't perform the dance activity.");
		}
	}
}