/** Third Thread generate 20 genome */

public class ThirdThread implements Runnable {
	
	// The Thread class implements Runnable interface	
	@Override
	public void run() {
		// generate 20 genome sequence which include the char ATGC
		String letters = new String("ATGC");
		for (int i = 0; i < 20; i++) {
			String temp = "";
			for (int k = 0; k < 10; k++) {
				char symbol = letters.charAt((int) (Math.random() * 4));
				temp = temp + symbol;
			}
			System.out.println("Third Thread generate 20 genome " + temp);
		}
	}
}