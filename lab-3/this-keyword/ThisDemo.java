class Pen{
  String type;
  String color;

  void printDetail(){
    System.out.println("type: "+ this.type);
    System.out.println("type: "+ this.color);
  }
}
class ThisDemo{
  public static void main(String[] args){
    Pen pen1 = new Pen();
    Pen pen2 = new Pen();

    pen1.type = "ball pen";
    pen1.color="red";

    // pen obj 1
    pen2.type="gel";
    pen2.color = "blue";

    pen1.printDetail();
    pen2.printDetail();
  }
}