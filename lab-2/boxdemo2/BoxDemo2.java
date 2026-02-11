
class Box {

    double height;
    double width;
    double depth;

}

public class BoxDemo2 {

    public static void main(String[] arguments) {
        Box mybox = new Box();
        mybox.height = 20;
        mybox.width = 20;
        mybox.depth = 20;

        double vol;
        vol = mybox.height * mybox.width * mybox.depth;
        System.out.println("The volume of the box is " + vol);

    }
}
