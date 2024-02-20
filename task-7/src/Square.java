public class Square {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    // methods
    public double Area() {
        return sideLength*sideLength;
    };
    public double Circumference () {
        return 4*sideLength;
    };
}
