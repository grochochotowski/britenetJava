public class Duck implements Animal2 {
    @Override
    public void eat() {
        System.out.println("Duck eats");
    }

    @Override
    public void travel() {
        System.out.println("Duck travels");
    }

    @Override
    public void giveVoice() {
        System.out.println("Quack");
    }

    @Override
    public void sleep() {
        System.out.println("Duck is sleeping now");
    }
}
