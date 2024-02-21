public class Cow implements Animal2 {
    @Override
    public void eat() {
        System.out.println("I like grass");
    }

    @Override
    public void travel() {
        System.out.println("Cow travels");
    }

    @Override
    public void giveVoice() {
        System.out.println("Moo");
    }

    @Override
    public void sleep() {
        System.out.println("Cow is sleeping now");
    }

    public void graze() {
        System.out.println("Cow is grazing in a field");
    }
}
