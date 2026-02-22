package Threads;

public class JoinAlive {
  public static void main(String[] args) {
    NewThreadExtend t1 = new NewThreadExtend();
    NewThreadExtend t2 = new NewThreadExtend();
    NewThreadExtend t3 = new NewThreadExtend();
    t1.setName("Thread-1");
    t2.setName("Thread-2");
    t3.setName("Thread-3");
    t1.start();
    t2.start();
    t3.start();
    System.out.println("Thread one is alive: " + t1.isAlive());
    System.out.println("Thread one is alive: " + t2.isAlive());
    System.out.println("Thread one is alive: " + t3.isAlive());
    try {
      t1.join();
      t2.join();
      t3.join();
    } catch (Exception e) {
      System.out.println(e);
    }
    System.out.println("Thread one is alive: " + t1.isAlive());
    System.out.println("Thread one is alive: " + t2.isAlive());
    System.out.println("Thread one is alive: " + t3.isAlive());
  }
}
