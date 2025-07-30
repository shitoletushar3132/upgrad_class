package oops;

class ShapeArea {

    public double area(double length, double width) {
        return length * width;
    }

    public double area(double length) {
        return length * length;
    }

    public double areaCircleByRadius(double radius) {
        return Math.PI * radius * radius;
    }

    public double areaCircleByDiameter(double diameter, boolean isDiameter) {
        double radius = diameter / 2;
        return Math.PI * radius * radius;
    }

    public double areaTriangle(double base, double height) {
        return 0.5 * base * height;
    }
}

public class ShapeAreaTest {
    public static void main(String[] args) {
        ShapeArea shape = new ShapeArea();

        System.out.println("Rectangle area (length=5, width=3): " + shape.area(5, 3));
        System.out.println("Square area (length=4): " + shape.area(4));

        System.out.println("Circle area (radius=7): " + shape.areaCircleByRadius(7));
        System.out.println("Circle area (diameter=14): " + shape.areaCircleByDiameter(14, true));

        System.out.println("Triangle area (base=6, height=4): " + shape.areaTriangle(6, 4));
    }
}

