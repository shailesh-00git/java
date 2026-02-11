
class Box {

    double height;
    double width;
    double depth;

    void volume() {
        double vol;
        vol = height * width * depth;
        System.out.println("The volume of the box is " + vol);

    }

}

public class BoxDemo3 {

    public static void main(String[] arguments) {
        Box mybox = new Box();
        mybox.height = 20;
        mybox.width = 20;
        mybox.depth = 20;
        // calculate the voume using the method
        mybox.volume();

    }
}
