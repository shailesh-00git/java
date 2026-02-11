package Interfaces;

public class DynamicStack {
  int tos = -1;
  int[] stack;

  DynamicStack(int size) {
    stack = new int[size];
  }

  public void push(int item) {
    if (tos == stack.length - 1) {
      int[] temp = new int[stack.length * 2];
      for (int i = 0; i <= tos; i++) {
        temp[i] = stack[i];
      }
      stack = temp;
      stack[++tos] = item;
    } else {
      stack[++tos] = item;

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
      System.out.println("stack overflow");
    } else {
      for (int i = tos; i >= 0; i--) {
        System.out.println("Item " + indx + " : " + stack[i]);
        indx++;
      }
    }
  }

}
