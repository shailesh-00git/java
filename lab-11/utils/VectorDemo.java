
import java.util.Enumeration;
import java.util.Vector;

class VectorDemo {
  public static void main(String[] args) {
    Vector<Integer> v = new Vector<>(3, 2);
    System.out.println("Initial size: " + v.size());
    System.out.println("Initial capacity: " + v.capacity());
    v.addElement(1);
    v.addElement(2);
    v.addElement(3);
    v.addElement(4);
    System.out.println("Capacity after adding 4 elements: " + v.capacity());
    v.capacity();
    v.addElement(5);
    System.out.println(" current Capacity:" + v.capacity());
    v.addElement(6);
    v.addElement(7);
    System.out.println(" current Capacity:" + v.capacity());
    v.addElement(8);
    v.addElement(1);

    // print first and list element
    System.out.println("First element: " + v.firstElement());
    System.out.println("Last element: " + v.lastElement());
    // Enumaration
    Enumeration<Integer> vEnum = v.elements();
    System.out.println("Elements in vector:");
    while (vEnum.hasMoreElements()) {
      System.out.println(vEnum.nextElement() + " ");
    }

  }
}