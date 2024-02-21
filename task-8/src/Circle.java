public class Circle implements GeometricShape {

    private double radius;

    @Override
    public void calculateArea() {
        System.out.println("Area: " + (Math.PI*radius*radius));
    }

    @Override
    public void calculateCircumference() {
        System.out.println("Circumference: " + (2*Math.PI*radius));
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }
}
