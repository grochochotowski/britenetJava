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

    // getters
    public String getName() { return name; }
    public String getSurname() { return surname; }
    public int getYearOfBirth() { return yearOfBirth; }
    public String getCountry() { return country; }
    public String getCity() { return city; }
    public String getStreet() { return street; }
    public double getMonthlySalaryGross() { return monthlySalaryGross; }

    
}
