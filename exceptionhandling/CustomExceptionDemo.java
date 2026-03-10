import java.io.BufferedReader;
import java.io.InputStreamReader;

class MyException extends Exception {

  MyException(String message) {
    super(message);
  }
}

public class CustomExceptionDemo {

  static void checkNumber(int num) throws MyException {
    if (num < 18) {
      throw new MyException("Not eligible for voting");
    } else {
      System.out.println("Eligible for voting");
    }
  }

  public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String age = null;
    System.out.print("Enter age: ");

    try {
      age = br.readLine();
      int num = Integer.parseInt(age);
      try {
        checkNumber(num);
      } catch (MyException e) {
        System.out.println(e);
      }

    } catch (Exception e) {
      System.out.println(e);
    }
  }
}