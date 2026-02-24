public class StringConversion {
  public static void main(String[] args) {
    int num = 1233;
    System.out.println("num is: " + Integer.toBinaryString(num) + " in binary");
    System.out.println("num is: " + Integer.toOctalString(num) + " in octal");
    System.out.println("num is: " + Integer.toHexString(num) + " in hexadecimal");
  }
}