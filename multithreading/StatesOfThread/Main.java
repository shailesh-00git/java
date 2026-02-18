package StatesOfThread;

class MyThread extends Thread {
  @Override
  public void run() {
    System.out.println("Thread is Running.."); // RUNNING
    try {
      Thread.sleep(2000);
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}

class Main {
  public static void main(String[] args) throws InterruptedException {
    MyThread t1 = new MyThread();
    System.out.println(t1.getState()); // NEW
    t1.start();
    System.out.println(t1.getState()); // RUNNABLE
    Thread.sleep(200);
    System.out.println(t1.getState()); // TIME WAITING
    t1.join();
    System.out.println(t1.getState()); // TERMINATED
  }

}
