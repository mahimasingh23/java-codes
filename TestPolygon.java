abstract class polygon{
    public abstract double area();
    public abstract double perimeter();
}
class Rectangle extends polygon {
    private final double width, length; //sides

    public Rectangle() {
        this(1,1);
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        // A = w * l
        return width * length;
    }

    @Override
    public double perimeter() {
        // P = 2(w + l)
        return 2 * (width + length);
    }

}
class Square extends polygon {
    private final double length; //side

    public Square() {
        this(1);
    }
    public Square(double length) {
        this.length = length;
    }

    @Override
    public double area() {
        // A = l * l
        return length * length;
    }

    @Override
    public double perimeter() {
        // P = 4*(l)
        return 4 * (length);
    }

}
class Circle extends polygon {
    private final double radius;
    final double pi = Math.PI;

    public Circle() {
        this(1);
    }   
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        // A = π r^2
        return pi * Math.pow(radius, 2);
    }

    public double perimeter() {
        // P = 2πr
        return 2 * pi * radius;
    }
}
class Triangle extends polygon {
    private final double a, b, c; // sides

    public Triangle() {
        this(1,1,1);
    }
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        // Heron's formula:
        // A = SquareRoot(s * (s - a) * (s - b) * (s - c)) 
        // where s = (a + b + c) / 2, or 1/2 of the perimeter of the triangle 
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double perimeter() {
        // P = a + b + c
        return a + b + c;
    }
}
//seperate the code 
public class TestPolygon {
    public static void main(String[] args) {

        // Rectangle test
        double width = 5, length = 7;
        polygon rectangle = new Rectangle(width, length);
        System.out.println("Rectangle width: " + width + " and length: " + length
                + "\nResulting area: " + rectangle.area()
                + "\nResulting perimeter: " + rectangle.perimeter() + "\n");

        // Circle test
        double radius = 5;
        polygon circle = new Circle(radius);
        System.out.println("Circle radius: " + radius
            + "\nResulting Area: " + circle.area()
            + "\nResulting Perimeter: " + circle.perimeter() + "\n");

        // Triangle test
        double a = 5, b = 3, c = 4;
        polygon triangle = new Triangle(a,b,c);
        System.out.println("Triangle sides lengths: " + a + ", " + b + ", " + c
                + "\nResulting Area: " + triangle.area()
                + "\nResulting Perimeter: " + triangle.perimeter() + "\n");
    }
}

//add an explanation properly
