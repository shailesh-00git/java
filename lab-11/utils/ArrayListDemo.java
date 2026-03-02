import java.util.ArrayList;

class ArrayListDemo {
  public static void main(String[] args) {
    ArrayList<String> al = new ArrayList<>();
    al.add("shailesh");
    al.add("ram");
    al.add("hari");
    al.add("shyam");
    System.out.println("Size of array: " + al.size()); // gives the size of array

    System.out.println(al); // display thre content of array list
    al.remove("shailesh");
    System.out.println(al);
    al.remove(1);
    System.out.println(al);
    al.set(0, "shailesh"); // replace the content of the given index
    System.out.println(al);

  }
}