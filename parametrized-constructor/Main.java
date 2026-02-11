
class Myclass{
  int age;
  String name;
    Myclass(int a,String s){
    age=a;
    name =s;

   }
}
class Main{
  public static void main(String[] args){
    Myclass stds =new Myclass(20,"shailesh");
    System.out.println("Name: "+stds.name);
    System.out.println("Age: "+stds.age);

  }
}