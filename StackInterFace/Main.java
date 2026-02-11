
interface StackBluePrint {
  void push(int value);

  void pop();
}

class FixedStack implements StackBluePrint {
  private int tos;
  private final int[] stack;

  public FixedStack(int size) {
    tos = -1;
    stack = new int[size];
  }

  @Override
  public void push(int value) {
    if (tos == stack.length - 1) {
      System.out.println("Stack Overflow");
    } else {
      tos++;
      stack[tos] = value;
    }
  }

  @Override
  public void pop() {
    if (tos < 1) {
      System.out.println("stack underflow");
    } else {
      System.out.println(stack[tos] + " is removed from stack");
      tos--;
    }
  }

  void display() {
    int idx = 1;
    for (int i = tos; i >= 0; i--) {
      System.out.println("Element " + idx + " : " + stack[i]);
      idx++;
    }
  }
}

public class Main {
  public static void main(String[] args) {
    FixedStack s1 = new FixedStack(5);
    s1.push(23);
    s1.push(24);
    s1.push(25);
    s1.push(20);
    s1.push(28);
    s1.push(28);
    s1.display();
  }

}
