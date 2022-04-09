/** Execute single and multiple thread and check response time **/

public class TestfiveThread {

  public static void main(String[] args) throws InterruptedException {
    // start single thread.
    SingleThread s = new SingleThread();
    Thread t = new Thread(s);
    t.start(); // Start the thread
    t.join();

    // logic for start multi thread and calculate the multi thread execution time
    long startTime = 0, endTime = 0, elapseTime = 0;
    startTime = System.currentTimeMillis();

    FirstThread firstT = new FirstThread();
    Thread a = new Thread(firstT);
    SecondThread secondT = new SecondThread();
    Thread b = new Thread(secondT);
    ThirdThread thirdT = new ThirdThread();
    Thread c = new Thread(thirdT);
    FourthThread fourthT = new FourthThread();
    Thread d = new Thread(fourthT);
    FifthThread fifthT = new FifthThread();
    Thread e = new Thread(fifthT);

    a.start();
    a.join(); // The join method allows one thread to wait until another thread gets accepted.
    b.start();
    b.join();
    c.start();
    c.join();
    d.start();
    d.join();
    e.start();
    e.join();

    endTime = System.currentTimeMillis();
    elapseTime = endTime - startTime;
    System.out.println("Total five Thread execution time: " + elapseTime + " miliseconds");
  }
}
