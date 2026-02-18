// to reverse a string  the characters in the string without usong recursion
class ReverseString {
  public static void main(String[] args) {
    String str = "Nepal";
    String rev = "";
    System.out.println(str);
    for (int i = str.length() - 1; i >= 0; i--) {
      rev = rev + str.charAt(i);
    }
    System.out.println("The reversed string is: " + rev);
  }
}