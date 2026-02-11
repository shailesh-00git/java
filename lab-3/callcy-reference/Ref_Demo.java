
class Box {

    int length;
}

public class Ref_Demo {

    static void change(Box x) {
        x.length = 50;
    }

    public static void main(String[] args) {
        Box b1 = new Box();
        b1.length = 10;

        change(b1);
        System.out.println("Length of box = " + b1.length);

    }
}
