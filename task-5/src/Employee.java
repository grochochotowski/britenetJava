public class Employee {
    // variables
    private static double BONUS;

    private String name;
    private String surname;
    private int yearOfBirth;
    private int jobName;
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
    public static double getBONUS() { return BONUS; }

    public String getName() { return name; }
    public String getSurname() { return surname; }
    public int getYearOfBirth() { return yearOfBirth; }
    public int getJobName() { return jobName; }
    public String getCountry() { return country; }
    public String getCity() { return city; }
    public String getStreet() { return street; }
    public double getMonthlySalaryGross() { return monthlySalaryGross; }

    // setters
    public static void setBONUS(double BONUS) { Employee.BONUS = BONUS; }

    public void setName(String name) { this.name = name; }
    public void setSurname(String surname) { this.surname = surname; }
    public void setYearOfBirth(int yearOfBirth) { this.yearOfBirth = yearOfBirth; }
    public void setJobName(int jobName) { this.jobName = jobName; }
    public void setCountry(String country) { this.country = country; }
    public void setCity(String city) { this.city = city; }
    public void setStreet(String street) { this.street = street; }
    public void setMonthlySalaryGross(double monthlySalaryGross) { this.monthlySalaryGross = monthlySalaryGross; }

    // display methods
    @Override
    public String toString() {
        String text =
                """
                %s %s - %d
                %s - %.2f PLN
                %s, %s, %s
                """;
        return String.format(text, name, surname, yearOfBirth, jobName, monthlySalaryGross, country, city, street);
    }

    public void displayAddress() {
        System.out.printf("%s, %s, %s", country, city, street);
    }
    public void displayAllData() {
        System.out.printf("""
                NAME: %s %s - %d
                JOB: %s - %.2f
                ADDRESS: %s, %s, %s
                """,
                name, surname, yearOfBirth, jobName, monthlySalaryGross, country, city, street);
    }

    // income
    public double calculateGrossIncome() {
        return this.monthlySalaryGross*12;
    }
    public double calculateGrossIncome(int months) {
        return this.monthlySalaryGross*months;
    }
}