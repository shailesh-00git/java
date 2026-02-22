package Threads;

class CallMe {
  synchronized void call(String msg) {
    System.out.print("[");
    System.out.print(msg);
    try {
      Thread.sleep(1000);
    } catch (Exception e) {
      System.out.println(e);
    }
    System.out.print("]");
  }
}

class Caller extends Thread {
  private CallMe callme;
  private String msg;

  public Caller(CallMe callme, String msg) {
    this.callme = callme;
    this.msg = msg;
  }

  public void run() {
    callme.call(msg);

  }

}

class Syncronization {
  public static void main(String[] args) {
    CallMe callme = new CallMe();
    Caller c1 = new Caller(callme, "Hello");
    Caller c2 = new Caller(callme, "Syncronized");
    Caller c3 = new Caller(callme, "World");
    c1.start();
    c2.start();
    c3.start();

  }
}
