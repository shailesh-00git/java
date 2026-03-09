import java.util.HashSet;

class HashSetDemo {
  public static void main(String[] args) {
    HashSet<String> hs = new HashSet<>();
    System.out.println(hs.size());

    hs.add("aplpha");
    hs.add("beta");
    hs.add("theta");
    System.out.println(hs);
    hs.add("beta");
    System.out.println(hs);
    System.out.println("size of hashSet: " + hs.size());

  }
}