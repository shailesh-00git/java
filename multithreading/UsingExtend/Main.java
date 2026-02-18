class MyThread extends Thread {
  @Override
  public void run() {
    System.out.println("Thread is running...");
    System.out.println(Thread.currentThread().getName());
  }
}

public class Main {
  public static void main(String[] args) {
    MyThread t1 = new MyThread();
    t1.start();
    System.out.println(Thread.currentThread().getName());
  }
}
