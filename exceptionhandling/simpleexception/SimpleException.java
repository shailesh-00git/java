package exceptionhandling.simpleexception;

public class SimpleException {
  public static void main(String[] args) {
    int n = 2, d = 0;
    try {
      System.out.println("Division: " + n / d);
    } catch (Exception e) {
      System.out.println("Something is wrong!");
    }
  }

}
