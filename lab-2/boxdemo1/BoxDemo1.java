class Box{
  double height;
   double width;
   double depth;
}
class BoxDemo1{
  public static void main(String[] args){
    Box mybox= new Box();
    mybox.height=10;
    mybox.depth=10;
    mybox.width  =20;

    double vol;
    vol = mybox.height*mybox.width*mybox.depth;
    System.out.println("The volume of the box is "+vol);
    }
}