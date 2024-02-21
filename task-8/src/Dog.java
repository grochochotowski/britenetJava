public class Dog extends Animal implements Speakable {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "Pies";
    }

    @Override
    public void getVoice(int voice) {
        System.out.println("Woof");
    }
}
