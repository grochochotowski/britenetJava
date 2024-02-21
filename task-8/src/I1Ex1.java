public class I1Ex1 {
    public static void race(Moveable... moveable) {
        for (Moveable m : moveable) {
            m.start();
            if (m instanceof Dog) {
                System.out.printf("\t-%s\n", ((Dog) m).getName());
            }
        }
    }

    public static void main(String[] args) {
        Car car = new Car("Opel");
        car.start();
        car.stop();

        Dog dog = new Dog("doggo");
        dog.start();
        dog.stop();
        System.out.println(dog.getType());

        System.out.println("RACE");
        race(new Bike(), new Dog("Doggo"), new Car("Mcqueen"));
    }
}