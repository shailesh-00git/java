package Priority;

public class Main extends Thread {
  public Main(String name) {
    super(name);

  }

  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println(Thread.currentThread().getName() + " - " + i);
    }
  }

  public static void main(String[] args) {
    Main t1 = new Main("LOW PRIORITY");
    Main t2 = new Main("NOR PRIORITY");
    Main t3 = new Main("MAX PRIORITY");
    t1.setPriority(MIN_PRIORITY);
    t2.setPriority(NORM_PRIORITY);
    t3.setPriority(MAX_PRIORITY);
    t1.start();
    t2.start();
    t3.start();
  }

}
