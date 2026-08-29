abstract class Shape {
    private String color;

    Shape(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public String getColor() {
        return color;
    }

    public String toString() {
        return "Shape color: " + color;
    }
}

class Circle extends Shape {
    private double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String toString() {
        return "Circle [Color: " + getColor()
                + ", Radius: " + radius
                + ", Area: " + String.format("%.2f", getArea()) + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle("Red", 5);
        System.out.println(c);
    }
}