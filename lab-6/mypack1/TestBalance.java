package mypack1;

import mypack.*;

public class TestBalance {
  public static void main(String[] args) {
    Balance test = new Balance("shailesh", 5000);
    System.out.println("----from mypack1----");
    test.show();
  }
}