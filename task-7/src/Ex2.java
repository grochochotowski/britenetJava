public class Ex2 {
    public static void main(String[] args) {
        // example shapes
        Square square = new Square(5.5);
        Rectangle rectangle = new Rectangle(3, 9.5);
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(2, 3);

        // test
        System.out.println("Area: " + square.Area());
        System.out.println("Circumference: " + square.Circumference() + "\n");
        System.out.println("Area: " + rectangle.Area());
        System.out.println("Circumference: " + rectangle.Circumference() + "\n");
        System.out.println("Area: " + circle.Area());
        System.out.println("Circumference: " + circle.Circumference() + "\n");
        System.out.println("Area: " + triangle.Area());
        System.out.println("Circumference: " + triangle.Circumference() + "\n");
    }
}