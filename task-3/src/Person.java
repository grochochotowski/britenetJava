import java.util.Calendar;

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

    // getters
    public String getName() { return name; }
    public String getSurname() { return surname; }
    public static int getYearOfBirth() { return yearOfBirth; }
    public Address getAddress() { return address; }

    // setters
    public void setName(String name) { this.name = name; }
    public void setSurname(String surname) { this.surname = surname; }
    public static void setYearOfBirth(int yearOfBirth) { Person.yearOfBirth = yearOfBirth; }
    public void setAddress(Address address) { this.address = address; }

    // other methods
    public int getAge() {

    }
    public boolean is18 () {
        return Calendar.getInstance().get(Calendar.YEAR) - getAge() >= 18;
    }
    public void changeAddress () {

    }
    public void display () {

    }
}
