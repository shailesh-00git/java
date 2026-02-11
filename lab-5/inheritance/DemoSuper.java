package inheritance;

class Box {
  double width;
  double height;
  double depth;

  Box(double w, double h, double d) {
    width = w;
    height = h;
    depth = d;
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

class DemoSuper {
  static void main(String[] args) {
    BoxWeight mybox1 = new BoxWeight(13, 12, 45, 23.4);
    double vol = mybox1.volume();
    System.out.println("volume: " + vol);
    System.out.println("weight: " + mybox1.weight);
  }
}