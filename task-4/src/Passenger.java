public class Passenger {
    // variables
    private String name;
    private String surname;
    private int age;

    // constructor
    public Passenger(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    // getters
    public String getName() { return name; }
    public String getSurname() { return surname; }
    public int getAge() { return age; }

    // other
    @Override
    public String toString() {
        String text =
                """
                %s %s - %d
                """;
        return String.format(text, name, surname, age);
    }

    public void display() {
        System.out.printf("NAME: %s %s\n AGE: %d", name, surname, age);
    }

}
