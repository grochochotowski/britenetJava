public class Car implements Moveable{
    private String mark;

    public Car(String mark) {
        this.mark = mark;
    }

    @Override
    public void start() {
        System.out.println("BIKE STARTED");
    }
    @Override
    public void stop() {
        System.out.println("BIKE STOPPED");
    }
}
