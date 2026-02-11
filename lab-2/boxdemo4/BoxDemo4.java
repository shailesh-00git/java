
class Box {

    double height;
    double width;
    double depth;

    // method wihout argument but return type
    double volume() {
        return height * width * depth;

    }

}

public class BoxDemo4 {

    public static void main(String[] arguments) {
        Box mybox = new Box();
        mybox.height = 10;
        mybox.width = 10;
        mybox.depth = 10;

        double vol;
        vol = mybox.volume();
        System.out.println(vol);

    }
}
