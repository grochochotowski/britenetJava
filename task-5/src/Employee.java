public class Employee {
    // variables
    private String name;
    private String surname;
    private int yearOfBirth;
    private String country;
    private String city;
    private String street;
    private double monthlySalaryGross;

    // constructor
    public Employee(String name, String surname, int yearOfBirth, String country, String city, String street, double monthlySalaryGross) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.country = country;
        this.city = city;
        this.street = street;
        this.monthlySalaryGross = monthlySalaryGross;
    }
}
