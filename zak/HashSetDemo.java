import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("London");
        hs.add("New York");
        hs.add("Los Angles");
        hs.add("Begining");
        hs.add("New York");
        System.out.println(hs);

        // add a new element
        hs.add("Kathmandu");
        System.out.println(hs);

        // delete element
        hs.remove("Begining");
        System.out.println(hs);

        // check elemnt
        System.out.println(hs.contains("Kathmandu"));

        // addAll
        HashSet<String> set2 = new HashSet<>();
        set2.add("Pokhara");
        set2.add("New York");
        set2.add("London");
        hs.addAll(set2);
        System.out.println(hs);

        // retain all
        hs.retainAll(set2);
        System.out.println("hii");
        System.out.println(hs);

        hs.removeAll(set2);
        System.out.println(hs);

    }
}
