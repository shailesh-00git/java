package Threads;

public class NewThreadExtend extends Thread {

  public void run() {
    try {
      System.out.println(currentThread().getName());
      for (int i = 0; i <= 3; i++) {
        System.out.println(currentThread().getName() + " " + "Value: " + i);
        Thread.sleep(1000);
      }
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
