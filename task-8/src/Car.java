public class Car implements Moveable{
    private String mark;
    
    @Override
    public void start() {
        System.out.println("BIKE STARTED");
    }
    @Override
    public void stop() {
        System.out.println("BIKE STOPPED");
    }
}
