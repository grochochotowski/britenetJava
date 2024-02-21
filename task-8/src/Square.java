public class Square implements GeometricShape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area: " + (side*side));
    }

    @Override
    public void calculateCircumference() {
        System.out.println("Circumference: " + (4*side));
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }
}
