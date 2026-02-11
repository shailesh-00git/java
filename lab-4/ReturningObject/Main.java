class Test{
  String name;
  int age;
  static Test objRet(String name,int age){
    Test temp = new Test();
    temp.name = name ;
    temp.age = age;
    return temp;
  }


}
class Main{
  public static void main(String[] args){
    Test t1 = new Test();
    Test result = Test.objRet("shailesh",20);
    System.out.println("Name = "+ result.name);
    System.out.println("Age = "+ result.age);
  }
}