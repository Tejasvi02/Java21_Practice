package switchrecords;

public class SealedSwitchDemo {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(3, 4);
        Shape s3 = new Triangle(6, 2);

        printArea(s1);
        printArea(s2);
        printArea(s3);
    }

    static void printArea(Shape shape) {
        switch (shape) {
            case Circle c ->
                System.out.println("Circle area = " + Math.PI * c.radius * c.radius);
            case Rectangle r ->
                System.out.println("Rectangle area = " + r.w * r.h);
            case Triangle t ->
                System.out.println("Triangle area = " + 0.5 * t.base * t.height);
            //  No default needed — sealed interface makes switch exhaustive
        }
    }
}

// ---------------- SEALED CLASSES ----------------
sealed interface Shape permits Circle, Rectangle, Triangle {}

final class Circle implements Shape {
    double radius;
    Circle(double r) { this.radius = r; }
}

final class Rectangle implements Shape {
    double w, h;
    Rectangle(double w, double h) { this.w = w; this.h = h; }
}

final class Triangle implements Shape {
    double base, height;
    Triangle(double b, double h) { this.base = b; this.height = h; }
}
