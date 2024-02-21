public class Rectangle implements GeometricShape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area: " + (width * height));
    }

    @Override
    public void calculateCircumference() {
        System.out.println("Circumference: " + (2*width + 2*height));
    }

    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
