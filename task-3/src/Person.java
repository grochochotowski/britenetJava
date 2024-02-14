import java.util.Calendar;
import java.util.Scanner;

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
        return Calendar.getInstance().get(Calendar.YEAR) - getYearOfBirth();
    }
    public boolean is18 () {
        return getAge() >= 18;
    }
    public void changeAddress () {
        Scanner scan = new Scanner(System.in);
        System.out.println("==== Set new address ====\nCity:");
        String newCity = scan.nextLine();
        System.out.println("Postal Code:");
        String newPostalCode = scan.nextLine();
        System.out.println("Street:");
        String newStreet = scan.nextLine();
        System.out.println("Number:");
        String newNumber = scan.nextLine();

        address.setCity(newCity);
        address.setPostalCode(newPostalCode);
        address.setStreet(newStreet);
        address.setNumber(newNumber);
    }
    public void display () {
        String text =
                """
                %s %s
                Year of birth: %d
                Address:
                """,
                name, surname, yearOfBirth;
        System.out.printf(text);
        this.address.display();
    }
}
