class Main{
  static void modify(int a,int b){
    a = a+2;
    b = b-2;
  }
  public static void main(String[] args){
    int a = 2,b = 3;
    System.out.println("Before function call a = "+a+" "+"b = "+b);

    modify(a,b);
    System.out.println("After function call a = "+a+" "+"b = "+b);

  }
}