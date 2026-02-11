
class Data{
  int a,b,c;

  int add(int a,int b){
    return a+b;
      }

      double add(double a, double b){
        return a+b;
      }
}
class Main{
  public static void main(String[] args){
    Data mydata1 = new Data();
    
    int res = mydata1.add(2,4);
    System.out.println(res);

    double res1 = mydata1.add(2.2,2.2);
    System.out.println(res1);
  }
}