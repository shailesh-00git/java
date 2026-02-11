
class Box {

    double height;
    double width;
    double depth;

    Box() {
        height = 10;
        width = 10;
        depth = 10;
    }

    double volume() {
        return height * width * depth;
    }
}

public class BoxDemo6 {

    void main(String[] args) {
        Box mybox1 = new Box();
        double volume = mybox1.volume();
        System.out.println("Volume of the box is " + volume);
    }
}
