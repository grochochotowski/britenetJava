public abstract class Animal {
    private String name = "bez imienia";

    public Animal(String name) {
        this.name = name;
    }

    public abstract String getType();
}
