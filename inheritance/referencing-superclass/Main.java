class Box{
  void Volume(){
    System.out.println("Ever box has its volume");
  }
}
class Box1 extends Box{
  

}


class Main{
  public static void main(String[] args){
    // first method to use sound function through subclass
    Box1 b1 =new Box1();
    b1.Volume();
        System.out.println(b1.color);


    // secound using a refrence variable to the super class
    Box b2 = new Box1();
    b2.Volume();
    System.out.println(b2.color);
  }
}