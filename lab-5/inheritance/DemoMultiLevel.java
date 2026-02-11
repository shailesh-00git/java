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
    this.weight = m;
  }
}

class Shipment extends BoxWeight {
  double cost;

  public Shipment(double w, double h, double d, double m, double cost) {
    super(w, h, d, m);
    this.cost = cost;
  }

}

class DemoMultiLevel {
  static void main(String[] args) {
    Shipment mybox1 = new Shipment(13.2, 1.2, 4.5, 23.4, 23333);
    double vol = mybox1.volume();
    System.out.println("volume: " + vol);
    System.out.println("weight: " + mybox1.weight);
    System.out.println("cost: " + mybox1.cost);
  }
}