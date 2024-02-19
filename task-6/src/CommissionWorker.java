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

    // generate


    // calculate
    public double calculateTotalIncome() {
        double sum = 0;
        for (double salary : monthlySalaries) sum += salary;
        return sum;
    }
    public double calculateAverageSalary() {
        return calculateTotalIncome()/monthlySalaries.length;
    }

    // find
    public double findBiggerSalaries(double sal) {
        int num = 0;
        for (double salary : monthlySalaries)
            if (salary > sal) num++;
        return num;
    }
}
