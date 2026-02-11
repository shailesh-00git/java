package exceptionhandling.customexception;

public class CustomExceptionDemo {
  public static void main(String[] args) {
    int num = 23;
    int d = 0;

    try {
      System.out.println(num / d);
    } catch (Exception e) {
      System.out.println("Something is wrong");
      System.out.println(e);
    }
  }

}
