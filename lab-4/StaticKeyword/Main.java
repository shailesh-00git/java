class Test{
  static int a = 10;
  static int b;
  static int c;
  

  static void setVal(int x){
    c=x;
    System.out.println("a : "+ a);
    System.out.println("b : "+ b);
    System.out.println("c : "+ c);
  }

  static {
    System.out.println("Static block is initialized");
    b = 50;
  }
}
class Main{
  public static void main(String args[]){
    Test.setVal(20);
  }
}