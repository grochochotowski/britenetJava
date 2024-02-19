public class CommissionWorker extends Worker{

    // variables
    private double[] monthlySalaries;

    // constructor
    public CommissionWorker(String name, String surname, String PESEL, int dateOfBirth, int dateOfEmployment, char sex, String company, String occupation, double[] monthlySalaries) {
        super(name, surname, PESEL, dateOfBirth, dateOfEmployment, sex, company, occupation);
        this.monthlySalaries = monthlySalaries;
    }

    // getters & setters
    public double[] getMonthlySalaries() { return monthlySalaries; }
    public void setMonthlySalaries(double[] monthlySalaries) { this.monthlySalaries = monthlySalaries; }

    // calculate
    public double calculateAverageSalary() {
        int n = 0;
        double sum = 0;
        for (double salary : monthlySalaries) {
            sum += salary;
            n++;
        }
        return sum/n;
    }
}
