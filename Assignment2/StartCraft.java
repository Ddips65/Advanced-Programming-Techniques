/**
 * StartCraft is a class where main method is define and calling other class function has to start
 * the game.
 */

public class StartCraft {

	public static void main(String[] args) {

		System.out.println("This is only a blueprint of a Gorilla game.");

		Building b1 = new Building("Rectangle", 100, 200, "red");
		System.out.println("The height of the building is " + b1.getHeight());
		System.out.println("The width of the building is " + b1.getWidth());
		System.out.println("The color of the building is " + b1.getColor());
		System.out.println();

		Banana ban = new Banana(100, 32);
		ban.getVelocity();
		System.out.println("Angel is " + ban.getAngle());
		System.out.println("Velocity is " + ban.getVelocity());
		System.out.println();

		Player p1 = new Player(); // this is also valid statements Gorillagame g1 = new Player(); g1.tThrow();
		p1.drawSun();
		p1.drawGorilla();
		p1.tThrow(100, 35);
		p1.destroy();
		p1.damegeBuliding();
		p1.dance(false); // first parameterized dance method is invoked from the gorillagame class
		// if user want user can pass true value in dance method
		p1.dance(); // second non argument dance() is called from the Gorillagame class
		p1.gorillaMove();
		p1.getPlayerId();
		p1.getScore();

		Player p2 = new Player(1, "abc", 200);
	}
}

