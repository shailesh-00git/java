
class Box {

    double height;
    double width;
    double depth;

    // method wihout argument but return type
    double volume() {
        return height * width * depth;

    }

    void setDimension(double h, double w, double d) {
        height = h;
        width = w;
        depth = d;
    }

}

public class BoxDemo5 {

    public static void main(String[] arguments) {
        Box mybox = new Box();
        // 
        mybox.setDimension(2, 2, 2);
        // calculate the voume using the method
        double vol;
        vol = mybox.volume();
        System.out.println(vol);

    }
}
