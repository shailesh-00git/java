package Threads;

class ExtendThread {
  public static void main(String[] args) {
    NewThreadExtend t1 = new NewThreadExtend();
    t1.setName("Extend Demo thread");
    t1.start();

  }
}