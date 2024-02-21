public class Main {
    public static void race(Moveable... moveable) {
        for (Moveable m : moveable) {
            m.start();
            if (m instanceof Dog) {
                System.out.printf("DOG: %s", ((Dog) m).getName());
            }
        }
    }
    
    public static void main(String[] args) {
        System.out.println("RACE");
        race(new Bike(), new Dog("Doggo"), new Car("Mcqueen"));
    }
}