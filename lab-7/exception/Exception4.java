// example of throws keyword

class Test {
  public static void methodA() throws Exception {
    System.out.println("Inside methodA");
    throw new Exception("Exception thrown from methodA");
  }
}

public class Exception4 {
  public static void main(String[] args) {
    try {
      Test.methodA();
    } catch (Exception e) {
      System.out.println("Caught in main: " + e);
    }
  }
}