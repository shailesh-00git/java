class MyThread implements Runnable {
  @Override
  public void run() {
    System.out.println("Thread is running...");
  }
}

public class Test {
  public static void main(String[] args) {
    MyThread m1 = new MyThread();
    Thread t1 = new Thread(m1);
    t1.start();
  }
}
