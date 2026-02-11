class Vehicle{
  String category;
  int code;
}
class Car extends Vehicle{
  String type;
}
class Main{
  public static void main(String[] args){
    Car car1 = new Car();
    car1.category="car";
    car1.code=1234; 
    car1.type="suv"; 
    System.out.println(car1.category+" "+car1.code+' '+car1.type);
  }
}