public class CommissionWorker extends Worker{

    // variables
    private double[] monthlySalaries;

    public CommissionWorker(String name, String surname, String PESEL, int dateOfBirth, int dateOfEmployment, char sex, String company, String occupation, double[] monthlySalaries) {
        super(name, surname, PESEL, dateOfBirth, dateOfEmployment, sex, company, occupation);
        this.monthlySalaries = monthlySalaries;
    }
}
