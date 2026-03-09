import java.util.LinkedList;

class LinkedListDemo {
  public static void main(String[] args) {
    LinkedList<String> ll = new LinkedList<>();
    ll.add("A");
    ll.add("B");
    ll.add("C");
    ll.add("D");
    System.out.println(ll);

    // push at certain index
    ll.add(1, "we");
    System.out.println(ll);

    // remove elements
    ll.remove(2);
    System.out.println(ll);

    // remving first ans last elements
    ll.removeFirst();
    ll.removeLast();
    System.out.println(ll);

    // get and set vales
    String val = ll.get(1);
    System.out.println(val);
    ll.set(1, "AAAA");
    System.out.println(ll);

  }
}