package Interfaces;

public class Test {
  public static void main(String[] args) {
    FixedStack stack1 = new FixedStack(2);
    for (int i = 5; i < 7; i++) {
      stack1.push(i);

    }
    System.out.println("Elements of stack1");
    stack1.show();
    stack1.pop();

    FixedStack stack2 = new FixedStack(5);
    for (int i = 0; i < 5; i++) {
      stack2.push(i);
    }
    stack2.show();
    stack2.pop();

    System.out.println("Dynamic stack");
    DynamicStack stack3 = new DynamicStack(2);
    for (int i = 50; i < 55; i++) {
      stack3.push(i);
    }
    stack3.show();
    stack3.pop();
  }
}
