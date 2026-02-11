class Data{
  int a;
  int b;
  int c;
   
   int add(){
    return a+b+c;
   }

   int mul(){
    return a*b*c;
   }
}
class Main{
  public static void main(String[] args){

Data mydata= new Data();
mydata.a=2;
mydata.b=3;
mydata.c=4;
// add a b and c
int res = mydata.add();
System.out.println(res);
// multiply a b and c
res = mydata.mul();
System.out.println(res);
  }
}