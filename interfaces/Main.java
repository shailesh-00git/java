
import animals.*;
import devices.*;

public class Main {

  public static void main(String[] args) {
    Cat cat = new Cat();
    cat.eat();
    cat.sleep();
    Animal.info();

    // device packages
    Smartphone oppo = new Smartphone();
    oppo.startCall();
  }
}
