public class WhiteCollarWorker extends Worker{
    // variables
    private double salary;

    // constructor
    public WhiteCollarWorker(String name, String surname, String PESEL, int dateOfBirth,
                            int dateOfEmployment, char sex, String company, String occupation, double salary) {
        super(name, surname, PESEL, dateOfBirth, dateOfEmployment, sex, company, occupation);
        this.salary = salary;
    }

    // getters
    public double getSalary() { return salary; }

    // setters
    public void setSalary(double salary) { this.salary = salary; }

    // toString & display
    @Override
    public String toString() {
        String text = "WhiteCollarWorker" +
                super.toString() +
                ", salary=" + salary +
                '}';
        return text;
    }

    public void display() {
        super.display();
        String text = """
               SALARY: %.2f
               """;
        System.out.printf(text, salary);
    }

    // calculate
    public double calculateAnnualSalary() {
        return 12 * salary;
    }

}