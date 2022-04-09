/** Second Thread generate 20 genome */

public class SecondThread implements Runnable {
  @Override
  public void run() {
    String letters = new String("ATGC");
    for (int i = 0; i < 20; i++) {
      String temp = "";
      for (int k = 0; k < 10; k++) {
        char symbol = letters.charAt((int) (Math.random() * 4));
        temp = temp + symbol;
      }
      System.out.println("Second Thread generate 20 genome " + temp);
    }
  }
}
