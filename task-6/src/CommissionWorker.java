import java.util.Random;

public class CommissionWorker extends Worker{

    // variables
    private double[] monthlySalaries;

    // constructor
    public CommissionWorker(String name, String surname, String PESEL, int dateOfBirth, int dateOfEmployment, char sex, String company, String occupation) {
        super(name, surname, PESEL, dateOfBirth, dateOfEmployment, sex, company, occupation);
    }

    // getters & setters
    public double[] getMonthlySalaries() { return monthlySalaries; }
    public void setMonthlySalaries(double[] monthlySalaries) { this.monthlySalaries = monthlySalaries; }

    // generate
    public void generateSalaries(int n) {
        Random random = new Random();
        monthlySalaries = new double[n];
        for (int i = 0; i < n; i++) {
            double salary = 4100 + random.nextDouble() * 15000;
            monthlySalaries[i] = salary;
        }
    }

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
