/** Generate 100 genome seq */

public class SingleThread implements Runnable {
  @Override
  public void run() {
    long startTime = 0, endTime = 0, elapseTime = 0; // for response time
    startTime = System.currentTimeMillis();

    String letters = new String("ATGC");
    for (int k = 0; k < 100; k++) {
      String temp = "";
      for (int i = 0; i < 10; i++) {
        char symbol = letters.charAt((int) (Math.random() * 4));
        temp = temp + symbol;
      }
      System.out.println("Generate 100 genome seq " + temp);
    }
    endTime = System.currentTimeMillis();
    elapseTime = endTime - startTime;
    System.out.println("Single Thread execution time: " + elapseTime + " miliseconds");
    System.out.println();
  }
}
