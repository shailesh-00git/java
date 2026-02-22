package inputoutput;

import java.io.*;

class Employee implements Serializable {
  int id;
  String name;
  double salary;

  public Employee(int id, String name, double salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  public String toString() {
    return "name: " + name + " id: " + id + " salary: " + salary;
  }
}

class SerializationDemo {
  public static void main(String[] args) {
    // object serialization
    try (ObjectOutputStream objOstr = new ObjectOutputStream(new FileOutputStream("serial.ser"))) {
      Employee emp = new Employee(1, "John Doe", 50000.0);
      System.out.println("emp" + emp);
      objOstr.writeObject(emp);
    } catch (Exception e) {
      System.out.println("Exception during serialization");
    }

    // object deserialization
    try (ObjectInputStream objInstr = new ObjectInputStream(new FileInputStream("serial.ser"))) {
      Employee emp = (Employee) objInstr.readObject();
      System.out.println("emp" + emp);

    } catch (Exception e) {
      System.out.println("Exception during deserialization");
    }

  }

}
