class Employee{
  String name;
  int age;
  double salary;

  // default constructor 
  Employee(){
    this.name="not provided";
    this.age=0;
    this.salary=0.0;
  }
   Employee(String name){
    this.name=name;
    this.age=0;
    this.salary=0.0;
   }
   Employee(String name,int age,double salary){
    this.name=name;
    this.age=age;
    this.salary=salary;
   }
}
class Main{
  public static void main(String[] args){
    Employee emp1 = new Employee();
    Employee emp2 = new Employee("sahil");
    Employee emp3 = new Employee("samir",20,2000.23);
    System.out.println("Employee 1: "+emp1.name+" "+emp1.age+emp1.salary);
    System.out.println("Employee 2: "+emp2.name+emp2.age+emp2.salary);
    System.out.println("Employee 3: "+emp3.name+emp3.age+emp3.salary);
  }
}