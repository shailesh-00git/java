
class Calc {

    void add(int x, int y) {
        int sum = x + y;
        System.out.println(sum);
    }

    void add(int x, double y) {
        double sum = x + y;
        System.out.println(sum);
    }
}

public class Main {

    public static void main(String[] args) {
        Calc c1 = new Calc();
        c1.add(1, 2);
        c1.add(1, 2.2);
    }
}
