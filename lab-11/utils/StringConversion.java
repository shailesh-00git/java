public class StringConversion {
  public static void main(String[] args) {
    int n = 10;
    System.out.println("Binary: " + Integer.toBinaryString(n));
    System.out.println("Octal: " + Integer.toOctalString(n));
    System.out.println("Hexadecimal: " + Integer.toHexString(n));
    // interger to string
    if (Integer.toString(n).equals("10")) {
      System.out.println("true");
    }
  }
}