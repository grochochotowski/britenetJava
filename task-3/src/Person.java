public class Person {
    // variables
    private String name;
    private String surname;
    private static int yearOfBirth;
    private Address address;

    // constructors
    public Person() { }
    public Person(String name, String surname, Address address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    
}
