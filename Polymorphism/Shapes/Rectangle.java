package Polymorphism.Shapes;

public class Rectangle extends Shape {

    private Double height;
    private Double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculatePerimeter() {
        if (getPerimeter() == null) {
            double perimeter = width*2+height*2;
            setPerimeter(perimeter);
        }
        return getPerimeter();
    }

    @Override
    public double calculateArea() {
        if (getArea() == null) {
            double area = width*height;
            setArea(area);
        }
        return getArea();
    }

    public Double getHeight() {
        return height;
    }

    public Double getWidth() {
        return width;
    }
}
