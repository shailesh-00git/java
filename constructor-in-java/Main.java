class Data{
  int a;
  int b;
   Data(){
    a=2;
    b=2;
   }

   void add(){
    int value= a+b;
    System.out.println(value);
   }
}
class ConstructorDemo{
  public static void main(String[] args){
    Data mydata = new Data();

    mydata.add();
    

  }
}