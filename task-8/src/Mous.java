public class Mous implements Animal2 {
    @Override
    public void eat() {
        System.out.println("I like cheese");
    }

    @Override
    public void travel() {
        System.out.println("Mouse travels");
    }

    @Override
    public void giveVoice() {
        System.out.println("Squeak");
    }

    @Override
    public void sleep() {
        System.out.println("Mouse is sleeping now");
    }
}
