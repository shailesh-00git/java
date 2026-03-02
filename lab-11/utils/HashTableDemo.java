import java.util.Hashtable;

class HashTableDemo {
  public static void main(String[] args) {
    Hashtable<Integer, String> ht = new Hashtable<>();
    System.out.println(ht);
    ht.put(1, "Anish");
    ht.put(2, "Santi");
    ht.put(3, "Hari");
    ht.put(4, "Manish");
    System.out.println(ht);
    String s = ht.get(1);
    System.out.println(s);
    for (int i : ht.keySet()) {
      System.out.println(i + " : " + ht.get(i));
    }
    // ht.clear();
    // System.out.println(ht);

  }
}