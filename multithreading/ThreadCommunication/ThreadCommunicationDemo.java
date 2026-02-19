package ThreadCommunication;

class Shared {
  private int data;
  private boolean isData = false;

  // produce function
  public synchronized void produce(int value) {
    while (isData) {
      try {
        wait();
      } catch (Exception e) {
        System.out.println(e);
      }
    }

    data = value;
    isData = true;
    System.out.println("Produced: " + value);
    notify();
  }

  // consume function
  public synchronized void consume() {
    while (!isData) {
      try {
        wait();
      } catch (Exception e) {
        System.out.println(e);
      }
    }

    System.out.println("Consumed: " + data);
    isData = false;
    notify();
  }
}

class Producer extends Thread {
  Shared shared;

  Producer(Shared shared) {
    this.shared = shared;
  }

  public void run() {
    for (int i = 0; i < 10; i++) {
      shared.produce(i);
    }
  }
}

class Consumer extends Thread {
  Shared shared;

  Consumer(Shared shared) {
    this.shared = shared;
  }

  public void run() {
    for (int i = 0; i < 10; i++) {
      shared.consume();
    }
  }
}

public class ThreadCommunicationDemo {
  public static void main(String[] args) {
    Shared shared = new Shared();
    Producer p = new Producer(shared);
    Consumer c = new Consumer(shared);
    p.start();
    c.start();
  }
}
