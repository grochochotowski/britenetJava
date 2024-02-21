public class I1Ex3 {
    public static void main(String[] args) {
        Plane plane = new Plane();
        Ship ship = new Ship();
        Hydroplane hydroplane = new Hydroplane();

        plane.fly();
        ship.swim();
        hydroplane.fly();
        hydroplane.swim();
    }
}