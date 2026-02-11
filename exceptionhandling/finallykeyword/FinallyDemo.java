package exceptionhandling.finallykeyword;

public class FinallyDemo {
  public static void main(String[] args) {
    int[] num = { 1, 2, 3, 4, 5 };
    try {
      System.out.println(num[12]);
    } catch (Exception e) {
      System.out.println("Somethig is wrong");
      System.out.println(e);
    } finally {
      System.out.println("This  part run any how");
    }
  }

}
