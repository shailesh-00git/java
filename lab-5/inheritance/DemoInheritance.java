package inheritance;

class Box {
    double width;
    double height;
    double depth;

    Box() {
        height = width = depth = -1;
    }

    Box(Box obj) {
        height = obj.height;
        width = obj.width;
        depth = obj.depth;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxWeight extends Box {
    double weight;

    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }
}

class DemoInheritance {
    static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(4, 3, 2, 1);
        double vol = mybox1.volume();
        System.out.println("volume: " + vol);
        System.out.println("weight: " + mybox1.weight);
    }
}