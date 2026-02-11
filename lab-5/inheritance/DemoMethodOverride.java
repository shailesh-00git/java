package inheritance;

class Figure {
  double dim1;
  double dim2;

  Figure(double dim1, double dim2) {
    this.dim1 = dim1;
    this.dim2 = dim2;
  }

  Figure() {
    dim1 = dim2 = 1;
  }

  double area() {
    System.out.println("area of the figure is undefined");
    return 0;
  }

}

class Rectangle extends Figure {

  Rectangle(double l, double b) {
    super(l, b);
  }

  double area() {
    return dim1 * dim2;
  }
}

public class DemoMethodOverride {
  public static void main(String[] args) {
    Figure f = new Figure();
    f.area();
    Rectangle r = new Rectangle(4, 4);
    double area = r.area();
    System.out.println("Area of recatangle = " + area);
  }

}
