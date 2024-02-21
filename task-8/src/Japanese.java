public class Japanese implements Language{
    @Override
    public String sayGreeting() {
        return "Kon'nichiwa";
    }

    @Override
    public String sayGoodbye() {
        return "Sayonara";
    }

    @Override
    public String sayThanks() {
        return "Arigatō";
    }
}
