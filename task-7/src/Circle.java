public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // methods
    public double Area() {
        return Math.PI*radius*radius;
    };
    public double Circumference () {
        return 2*Math.PI*radius;
    };
}
