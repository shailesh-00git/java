
class Box {

    int length;
    int width;
    int height;

}

public class PassObjDemo {

    static void modifyBox(Box b) {
        b.length = 10;
        b.width = 20;
        b.height = 30;

    }

    public static void main(String[] args) {
        Box mybox = new Box();
        mybox.length = 1;
        mybox.width = 2;
        mybox.height = 3;

        modifyBox(mybox);

        System.out.println("length = " + mybox.length);
        System.out.println("width = " + mybox.width);
        System.out.println("height = " + mybox.height);
    }

}
