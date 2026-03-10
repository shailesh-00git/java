import java.util.ArrayList;
import java.util.ListIterator;

class ListIteratorDemo {
  public static void main(String[] args) {
    ArrayList<String> al = new ArrayList<>();
    System.out.println("Size of array list: " + al.size());
    al.add("A");
    al.add("B");
    al.add("C");
    al.add("D");
    al.add("E");
    System.out.println("Original contents of al: " + al);

    // using iterator
    ListIterator<String> ls = al.listIterator();
    while (ls.hasNext()) {
      String element = ls.next();
      System.out.print(element+" ");
    }

    // modify
    ListIterator<String> lsm = al.listIterator();
    while (lsm.hasNext()) {
      String element = lsm.next(); 
      lsm.set(element + "+");
    }
    lsm = al.listIterator();
    while (lsm.hasNext()) {
      System.out.println();
      String element = lsm.next();
      System.out.print(element+" ");

    }
    // backward it
    System.out.println("\nbackward ");
    while (lsm.hasPrevious()) {
      String element = lsm.previous();
      System.out.print(element+" ");

    }

  }
}