import java.util.ArrayList;

class ArrayListDemo {
  public static void main(String[] args) {
    ArrayList<String> al = new ArrayList<>();
    System.out.println("Size of array list: " + al.size());
    al.add("A");
    al.add("B");
    al.add("C");
    al.add("D");
    al.add("E");
    System.out.println(al);
    // push elemnt at given index
    al.add(1, "AF");
    System.out.println(al);
    System.out.println("Size of array list: " + al.size());
    al.remove(2);
    System.out.println(al);

    System.out.println("Size of array list: " + al.size());
    al.clear();
    System.out.println("Size of array list: " + al.size());

  }
}