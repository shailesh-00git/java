class Box{
  double height,width,depth;

  Box(Box ob){
    height=ob.height;
    width=ob.width;
    depth=ob.depth;
  }

  Box(double h, double w, double d){
    height=h;
    width=w;
    depth=d;

  }
  double volume(){
    return height*width*depth;
  }
}
class ParConstructor{
  public static void main(String[] args){
    Box mybox = new Box(5,5,5);
    double vol;

    Box myBoxClone = new Box(mybox);

    // get volume of mybox
    vol = mybox.volume();
    System.out.println(vol);

    // getting box of mybox clone
    vol = myBoxClone.volume();
    System.out.println(vol);
    
  }
}