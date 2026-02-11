package Interfaces;

public class FixedStack implements InStack {
  int tos = -1;
  int[] stack;

  FixedStack(int size) {
    stack = new int[size];
  }

  public void push(int item) {
    if (tos == stack.length - 1) {
      System.out.println("Stack overflow");
    } else {
      tos++;
      stack[tos] = item;
    }

  }

  public void pop() {
    if (tos == -1) {
      System.out.println("Stack underflow");

    } else {
      System.out.println("Item removed: " + stack[tos]);
      tos--;
    }

  }

  public void show() {
    int indx = 1;
    if (tos == -1) {
      System.out.println(" stack overflow");
    } else {
      for (int i = tos; i >= 0; i--) {
        System.out.println("Item " + indx + " : " + stack[i]);
        indx++;
      }
    }
  }
}
