public class Exc3 {
  public static void main(String[] args) {
    try {
      int b = 0;
      int a[] = { 4, 44, 32, 5, 6 };
      try {
        System.out.println(a[2] / b);

      } catch (Exception e) {
        // Dividedd by zero exception
        System.out.println(e);
      }

      System.out.println(a[6]);
    } catch (Exception e) {
      // Ihdex out of bound exception
      System.out.println(e);
    }
  }
}
