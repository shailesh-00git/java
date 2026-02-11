class Animal{
  void move(){
    System.out.println("Animal classs");
  }
}
class Dog extends Animal{
  void move(){
   
    System.out.println("Dog class");
  }
}
class Main{
  public static void main(String [] args){
    Animal a = new Dog();
    a.move();
  }
}