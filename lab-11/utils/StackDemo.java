import java.util.*;

class StackDemo {
  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    System.out.println(st);
    st.push(12);
    st.push(45);
    st.push(56);
    st.push(02);
    System.out.println(st);
    System.out.println("Removed: " + st.pop());
    System.out.println(st);
    System.out.println("Peeked: " + st.peek());
    System.out.println(st);

    System.out.println("Get: " + st.get(1));
    st.set(1, 99);
    System.out.println("Replaced element at index 1 by 99");
    System.out.println(st);
    System.out.println("Is Empty: " + st.isEmpty());

  }
}