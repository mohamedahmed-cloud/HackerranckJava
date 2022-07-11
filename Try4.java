public class Try4 {
    public static void main(String[] args) {
        circle c = new circle();
    }
}

abstract class Shape {
    public abstract double getArea();

    Shape() {

    }
}

class circle extends Shape {
    double r;

    circle() {

    }

    public double getArea() {
        return r * r * Math.PI;
    }

}

class Triangle extends Shape {
    double height;
    double width;

    Triangle() {

    }

    @Override
    public double getArea() {
        return height * width;
    }
}