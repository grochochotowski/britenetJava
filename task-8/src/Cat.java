public class Cat implements Animal2 {
    @Override
    public void eat() {
        System.out.println("I like milk");
    }

    @Override
    public void travel() {
        System.out.println("Cat travels");
    }

    @Override
    public void giveVoice() {
        System.out.println("Meow");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping now");
    }
}
