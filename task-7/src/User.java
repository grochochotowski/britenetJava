public abstract class User {
    protected String name;
    protected String surname;
    protected double fee;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.fee = fee;
    }

    public abstract String returnDescription();
}
