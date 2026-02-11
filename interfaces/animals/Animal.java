package animals;

public interface Animal {
    void eat();

    void sleep();

    // static method these methods are called without creating objects and are not
    // inherited by the implementing clases
    static void info() {
        System.out.println("This is animal interface");
    }

    // default methods
    default void run() {
        System.out.println("Animal is running");
    }

}
