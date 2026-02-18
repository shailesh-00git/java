package IsAlive;

class IsAliveDemo extends Thread {
  public void run() {

    try {
      for (int i = 0; i < 10; i++) {
        System.out.println(i);
        Thread.sleep(500);

      }
    } catch (Exception e) {
      System.out.println(e);
    }
    System.out.println("Thread is exiting....");
  }

  public static void main(String[] args) {
    IsAliveDemo t1 = new IsAliveDemo();
    t1.start();
    System.out.println(t1.isAlive());
    try {
      t1.join();
    } catch (Exception e) {
      System.out.println(e);
    }
    System.out.println(t1.isAlive());
  }
}
