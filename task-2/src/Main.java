public class Main {
    public static void main(String[] args) {
        // Create example cars
        Car car1 = new Car("Opel", "Corsa", 2011, 150000.50, 9, 180, 40, "ABC 01234");
        Car car2 = new Car("BMW", "X5", 2023, 76234.50, 10.5, 230, 93, "CBA 09876");
        Car car3 = new Car("Audi", "A1", 2014, 194000, 8.5, 200, 60, "TST 12A54");
        Car car4 = new Car("Porshe", "sth", 2024, 0, 15.5, 450, 75, "B0 SPEED");

        // test toString and display
        System.out.printf(car1.toString());
        System.out.printf(car2.toString());
        car3.display();
        car4.display();

        // test getAge()
        car1.getAge();
        car2.getAge();
        car3.getAge();
        car4.getAge();

        // test speed
        car1.speedUp(30);
        car2.slowDown(30);
        car1.display();
        car2.display();

        // test fuel
        car1.refuel(20);
        car2.refuelToFull();
        System.out.println(car2.isEmpty());
        System.out.println(car3.isEmpty());

        // test drive
        car1.drive(500);
        car2.drive(100);
        car2.stop();
        car4.tuning(50);

        // display after testing
        car1.display();
        car2.display();
        car3.display();
        car4.display();
    }
}