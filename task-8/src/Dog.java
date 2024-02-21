public class Dog extends Animal implements Moveable, Speakable {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "dog";
    }

    @Override
    public String getVoice(int voice) {
        if (LOUD == voice) return "WOOF";
        else if (QUIET == voice) return "woof";
        else return null;
    }

    @Override
    public void start() {
        System.out.println("DOG STARTED");
    }

    @Override
    public void stop() {
        System.out.println("DOG STOPPED");
    }
}
