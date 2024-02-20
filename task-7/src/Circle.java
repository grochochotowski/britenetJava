public class Circle extends Shape {
    private double side1Length;
    private double side2Length;

    public Rectangle(double side1Length, double side2Length) {
        this.side1Length = side1Length;
        this.side2Length = side2Length;
    }

    // methods
    public double Area() {
        return side1Length*side2Length;
    };
    public double Circumference () {
        return (2*side1Length) + (2*side2Length);
    };
}
