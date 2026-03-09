import java.util.TreeSet;

class TreeSetDemo {
  public static void main(String[] args) {
    TreeSet<String> ts = new TreeSet<>();
    ts.add("alpha");
    ts.add("beta");
    ts.add("theta");
    ts.add("epsilon");
    System.out.println(ts);
    // duplicate element is not added
    ts.add("alpha");

  }
}