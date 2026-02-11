class Main{
  static int add(int x ,int y){
    return x+y;
  }
  int add(int x,int y,int z){
    return x+y+z;
  }
  public static void main(String args[]){
    Main n = new Main();
    System.out.println("sum: "+add(1,2));
    System.out.println("sum: "+n.add(1,2,3));
  }
}