import java.util.Vector;

class VectorDemo {
  public static void main(String[] args) {
    Vector<Integer> v = new Vector<>(3, 2);
    System.out.println("Elements: " + v);
    System.out.println("Capacity: " + v.capacity());
    System.out.println("Size: " + v.size());
    v.add(1);
    v.add(2);
    v.add(3);
    System.out.println("Elements: " + v);
    System.out.println("Capacity: " + v.capacity());
    System.out.println("Size: " + v.size());
    v.add(4);
    System.out.println("Elements: " + v);
    System.out.println("Capacity: " + v.capacity());
    System.out.println("Size: " + v.size());
    v.remove(3);
    if (v.contains(3)) {
      System.out.println("Yes is contains 3");
    }
  }
}