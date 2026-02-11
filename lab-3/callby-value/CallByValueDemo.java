class CallByValueDemo{
   static void change(int x){
x=100;
  }
  public static void main(String[] args){
    int a=10;
    // before call
    System.out.println("a = "+ a);

    //after call
    change(a);
        System.out.println("a = "+ a);

  }
}