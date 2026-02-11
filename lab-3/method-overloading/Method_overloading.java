class Calculator{
   int add(int x,int y){
    return x+y;
   }
   int add(int x, int y,int z){
    return x+y+z;
   }
   double add(double x, double y){
    return x+y;
   }
   double add(int x, double y){
    return x+y;
   }
}
class Method_overloading{
  public static void main(String[] args){
    Calculator calc = new Calculator();
    System.out.println(calc.add(2,3));
    System.out.println(calc.add(2,3,5));
    System.out.println(calc.add(2.2,1.6));
    System.out.println(calc.add(2,3.1));
  }
}