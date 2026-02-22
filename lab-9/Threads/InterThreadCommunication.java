package Threads;

class Shared {
  int val;
  boolean hasVal = false;

  synchronized void get() {
    while (!hasVal) {
      try {
        wait();
      } catch (Exception e) {
        System.out.println(e);
      }

    }
    hasVal = false;
    System.out.println("Get: " + val);
    notify();

  }

  synchronized void put(int val) {
    while (hasVal) {
      try {
        wait();
      } catch (Exception e) {
        System.out.println(e);
      }
    }
    this.val = val;
    hasVal = true;
    System.out.println("Put: " + val);
    notify();
  }
}

class Producer extends Thread {
  Shared shared;

  public Producer(Shared shared) {
    this.shared = shared;
  }

  public void run() {
    try {
      for (int i = 0; i < 5; i++) {
        shared.put(i);
        Thread.sleep(1000);
      }
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}

class Consumer extends Thread {
  Shared shared;

  public Consumer(Shared shared) {
    this.shared = shared;
  }

  public void run() {
    try {
      for (int i = 0; i < 5; i++) {
        shared.get();
        Thread.sleep(1000);
      }
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}

public class InterThreadCommunication {
  public static void main(String[] args) {
    Shared shared = new Shared();
    Producer p = new Producer(shared);
    Consumer c = new Consumer(shared);
    p.start();
    c.start();
  }
}
