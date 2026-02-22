package Threads;

public class MultipleThread {
  public static void main(String[] args) {
    NewThreadExtend t1 = new NewThreadExtend();
    NewThreadExtend t2 = new NewThreadExtend();
    NewThreadExtend t3 = new NewThreadExtend();
    t1.setName("Thread-one");
    t2.setName("Thread-two");
    t3.setName("Thread-three");
    t1.start();
    t2.start();
    t3.start();

  }
}
