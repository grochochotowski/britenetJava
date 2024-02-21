public class Car implements Moveable{
    private String mark;

    public Car(String mark) {
        this.mark = mark;
    }

    @Override
    public void start() {
        System.out.printf("%s STARTED", mark);
    }
    @Override
    public void stop() {
        System.out.printf("%s STOPPED". mark);
    }
}
