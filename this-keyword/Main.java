class Myclass1{
  String name;

  Myclass1(){
    this.name="shailesh";
  }

}
class ConstructorDemo2
{
  public static void main(String[] args){
    Myclass myclass = new Myclass1();
    System.out.println(myclass.name);
  }
}