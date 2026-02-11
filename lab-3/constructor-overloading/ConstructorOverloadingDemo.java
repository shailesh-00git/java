class Box{
  double height;
  double width;
  double depth;

  // constrictor with no argument
  Box(){
    height=0;
    width=0;
    depth=0;
  }

  // constructor with all argument
  Box(double h,double w,double d){
    height=h;
    width=w;
    depth=d;
  }

  //constructor with only one argument
  Box(double side){
    height=side;
    width=side;
    depth=side;
  }

  double volume(){
    return height*width*depth;
  }
}
class ConstructorOverloadingDemo{
  public static void main(String[] args){
    Box b1 = new Box();
    Box b2 = new Box(10,20,30);
    Box b3 = new Box(10);

    System.out.println("volume of b1 = "+b1.volume());
    System.out.println("volume of b2 = "+b2.volume());
    System.out.println("volume of b3 = "+b3.volume());
  }
}