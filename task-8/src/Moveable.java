public interface Moveable {
    void start();
    void stop();

    public static void race(Moveable... moveable) {
        for (Moveable m : moveable) {
            m.start();
            if (m instanceof Dog) {
                System.out.printf("DOG: %s", ((Dog) m).getName());
            }
        }
    }
}
