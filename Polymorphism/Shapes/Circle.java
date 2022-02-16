package Polymorphism.Shapes;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        if (getPerimeter() == null) {
            double perimeter = 2*Math.PI*radius;
            setPerimeter(perimeter);
        }
        return getPerimeter();
    }

    @Override
    public double calculateArea() {
        if (getArea() == null) {
            double area = Math.PI*radius*radius;
            setArea(area);
        }
        return getArea();
    }

    public final double getRadius() {
        return radius;
    }
}
