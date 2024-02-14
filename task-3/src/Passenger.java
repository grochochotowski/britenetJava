public class Passenger {
    // variables
    private String name;
    private String surname;
    private boolean discount;

    // constructors
    public Passenger() { }
    public Passenger(String name, String surname, boolean discount) {
        this.name = name;
        this.surname = surname;
        this.discount = discount;
    }

    // getters
    public String getName() { return name; }
    public String getSurname() { return surname; }
    public boolean isDiscount() { return discount; }

    // setters
    public void setName(String name) { this.name = name; }
    public void setSurname(String surname) { this.surname = surname; }
    public void setDiscount(boolean discount) { this.discount = discount; }

    // other
    public void display() {
        String text = """
                    %s %s
                    Year of birth: %d
                    Discount:
                    """;
        System.out.printf(text, name, surname, discount?"YES":"NO");
    }
}
