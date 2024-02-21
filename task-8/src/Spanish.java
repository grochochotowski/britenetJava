public class Spanish implements Language{
    @Override
    public String sayGreeting() {
        return "Hola";
    }

    @Override
    public String sayGoodbye() {
        return "Adios";
    }

    @Override
    public String sayThanks() {
        return "Gracias";
    }
}
