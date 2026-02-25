
import java.util.EmptyStackException;
import java.util.Stack;

class StackDemo {
  static void showpush(Stack<Integer> st, int a) {
    st.push(a);
    System.out.println("push(" + a + ")");
    System.out.println("stack: " + st);
  }

  static void showpop(Stack<Integer> st) {
    System.out.print("pop -> ");
    Integer a = st.pop();
    System.out.println(a);
    System.out.println("stack: " + st);
  }

  public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();
    System.out.println("stack: " + s);
    showpush(s, 42);

    showpush(s, 66);
    showpush(s, 99);

    showpop(s);
    showpop(s);
    showpop(s);
    try {
      showpop(s);
    } catch (EmptyStackException e) {
      System.out.println(e);
    }

  }
}