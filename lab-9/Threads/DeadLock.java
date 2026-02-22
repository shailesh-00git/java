package Threads;

class A {
  synchronized void foo(B b) {
    System.out.println("Thread 1: Locked A");
    try {
      Thread.sleep(100);
    } catch (InterruptedException e) {
    }

    System.out.println("Thread 1: Waiting for B");
    b.last();
  }

  synchronized void last() {
    System.out.println("Inside A last");
  }
}

class B {
  synchronized void bar(A a) {
    System.out.println("Thread 2: Locked B");
    try {
      Thread.sleep(100);
    } catch (InterruptedException e) {
    }

    System.out.println("Thread 2: Waiting for A");
    a.last();
  }

  synchronized void last() {
    System.out.println("Inside B last");
  }
}

public class DeadLock implements Runnable {

  A a = new A();
  B b = new B();

  DeadLock() {
    Thread t = new Thread(this);
    t.start();

    b.bar(a); // Main thread locks B
  }

  public void run() {
    a.foo(b); // New thread locks A
  }

  public static void main(String[] args) {
    new DeadLock();
  }
}