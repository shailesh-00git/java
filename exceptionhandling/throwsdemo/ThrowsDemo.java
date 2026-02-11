package exceptionhandling.throwsdemo;

class Parent {
  static int result() throws Exception {
    int n = 20, d = 0;
    return n / d;

  }
}

public class ThrowsDemo {

  public static void main(String[] args) {
    try {
      System.out.println(Parent.result());

    } catch (Exception e) {
      System.out.println("Something is wrong" + e);
    }

  }
}
