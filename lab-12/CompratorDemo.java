import java.util.*;

class CompratorDemo {
  public static void main(String[] args) {
    TreeSet<String> ts = new TreeSet<>();
    ts.add("alpha");
    ts.add("beta");
    ts.add("theta");
    System.out.println(ts);

    // displayin the element of the tree set
    for (String el : ts) {
      System.out.println(el);
    }

  }
}