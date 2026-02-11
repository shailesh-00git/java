class Main{
  int value;
  static void modify(Main obj){
    obj.value = 23;
  }
  public static void main(String[] args){
   Main m1 = new Main();
   
   m1.value = 20;
    System.out.println("Before function call value = "+m1.value);
    modify(m1);
    System.out.println("Before function call value = "+m1.value);
  }
}