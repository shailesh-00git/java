
class Box {

    double height;
    double width;
    double depth;

    Box(double h, double w, double d) {
        height = h;
        width = w;
        depth = d;
    }

    double volume() {
        return height * width * depth;
    }
}

public class BoxDemo7 {
public static void main(String[] args){
    Box mybox1 = new Box(10,20,30);
    double vol;
    vol = mybox1.volume();
    System.out.println("Volume is "+ vol);
    }
}
