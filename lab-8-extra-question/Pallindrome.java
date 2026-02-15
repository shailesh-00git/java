// to check either a string is pallindrom or note
class Pallindrome {

  public static void main(String[] args) {
    String str = "shaiesh";
    String rev = "";
    for (int i = str.length() - 1; i >= 0; i--) {
      rev = rev + str.charAt(i);
    }
    if (rev.equals(str)) {
      System.out.println("The string is palindrome");
    } else {
      System.out.println("The string is not paallindrome");
    }
  }
}