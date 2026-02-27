
import java.io.*;

class User implements Serializable {
  String name;
  String address;
  int age;

  public User(String name, int age, String address) {
    this.name = name;
    this.age = age;
    this.address = address;
  }
}

public class SerializationDemo {

  public static void main(String[] args) throws Exception {
    User user1 = new User("shailesh", 20, "Dang");
    // writing the object state to file (serialization)
    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serilization.ser"));
    oos.writeObject(user1);
    oos.close();
    System.out.println("object saved....");

    // deserialization
    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serilization.ser"))) {
      // ois.readObject() ---> returns object so we hane to cast it to User type
      User data = (User) ois.readObject();
      System.out.println(data.name);
      System.out.println(data.age);
      System.out.println(data.address);

    } catch (Exception e) {
      System.out.println(e);
    }
  }

}
