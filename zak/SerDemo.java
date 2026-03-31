
import java.io.*;

class Student implements Serializable {

    int roll;
    String name;
    String address;
    String college;

    Student(int roll, String name, String address, String college) {
        this.roll = roll;
        this.name = name;
        this.address = address;
        this.college = college;
    }

}

public class SerDemo {
    public static void main(String[] args) {
        Student s1 = new Student(12, "Ramesh", "sanepa", "Everest");
        Student s2 = new Student(12, "Hrish", "kritipur", "sagarmatha");
        Student s3 = new Student(12, "Samir", "kritipur", "cosmos");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.txt"));) {
            oos.writeObject(s1);
            oos.writeObject(s2);
            oos.writeObject(s3);
        } catch (Exception e) {
            System.out.println(e);
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.txt"));) {
            for (int i = 0; i < 3; i++) {
                Student s = (Student) ois.readObject();
                if (s.address.equals("kritipur"))
                    System.out.println(s.roll + " " + s.name + " " + s.address + " " + s.college);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
