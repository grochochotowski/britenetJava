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
        String text = "BlueCollarWorker" +
                super.toString() +
                "paymentPerHour=" + paymentPerHour +
                ", hoursWorked=" + hoursWorked +
                '}';
        return text;
    }

    public void display() {
        super.display();
        String text = """
               PAYMENT: %.2f/h
               WORKED: %.2f
               """;
        System.out.printf(text, paymentPerHour, hoursWorked);
    }

    // calculate
    public double calculatePayment() {
        return hoursWorked * paymentPerHour;
    }

}