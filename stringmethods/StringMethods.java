package stringmethods;

public class StringMethods {
  public static void main(String[] args) {
    String str = "I love Nepal";
    System.out.println(str.length());
    System.out.println(str.charAt(6)); // prints the character after that index
    System.out.println(str.substring(7));
    System.out.println(str.substring(2, 7));
  }
}
