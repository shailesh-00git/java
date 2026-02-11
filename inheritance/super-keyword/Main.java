// superclass Person
class Person {
    Person(String name)
    {
        System.out.println("Name: "+name);
    }
}

// subclass Student extending the Person class
class Student extends Person {
    Student(String name,int age)
    {
        // invoke or call parent class constructor
        super(name);

        System.out.println("Age: "+age);
    }
}

// Driver Program
class Main {
    public static void main(String[] args)
    {
        Student s = new Student("shailesh",20);
    }
}