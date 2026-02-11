class Exc2 {
  public static void main(String[] args) {
    int n = 23;
    int d = 0;
    try {
      System.out.println(n / d);
    } catch (Exception e) {
      System.out.println("There is error" + e);
    }
  }
}