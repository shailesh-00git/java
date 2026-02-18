package UserVsDaemon;

class Main extends Thread {
  public void run() {
    while (true) {
      System.out.println("Hello world! ");
    }
  }

  public static void main(String[] args) {
    Main t1 = new Main();
    t1.setDaemon(true);
    t1.start();
    for (int i = 0; i < 10; i++) {
      System.out.println("main");
    }
    System.out.println("Main Done");
  }
}