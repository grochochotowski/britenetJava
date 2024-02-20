public class Triangle extends Shape  {
    private double side;
    private double height;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    // methods
    public double Area() {
        return side*height/2;
    };
    public double Circumference () {
        return 3*side;
    };
}
