/**
 * Player class is an example of the inheritance. It extends Gorillagame abstract calss and inherits
 * its properties and methods. Define own attributes likely pid(playerid),name,score.
 */

public class Player extends GorillaGame {

	private int pid;
	private String name;
	private int score;

	Player() {
	}

	/**
	 * When player makes score their score and player id added to the player
	 * 
	 * @param pid   int
	 * @param name  String
	 * @param score int
	 */

	public Player(int pid, String name, int score) {
		this.pid = pid;
		this.name = name;
		this.score = score;
	}

	// setter and getter for the Player id,name and score
	public int getPlayerId() {
		return pid;
	}

	public void setPlayerId(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Banana tThrow(double angle, double velocity) {
		Banana banana = new Banana(angle, velocity);
		return banana;
	}

}
