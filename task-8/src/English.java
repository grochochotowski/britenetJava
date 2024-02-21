public class English implements Language{
    @Override
    public String sayGreeting() {
        return "Hello";
    }

    @Override
    public String sayGoodbye() {
        return "Bye";
    }

    @Override
    public String sayThanks() {
        return "Thanks";
    }
}
