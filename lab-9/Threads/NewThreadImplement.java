package Threads;

public class NewThreadImplement implements Runnable {
  Thread t1;

  public NewThreadImplement() {
    t1 = new Thread(this, "Thread-1");
    System.out.println("Child thread: " + t1);
  }

  public void run() {
    try {
      for (int i = 0; i < 5; i++) {
        System.out.print(i + " ");
        Thread.sleep(1000);
      }
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}