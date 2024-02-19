public class BlueCollarWorker extends Worker{
    // variables
    private double paymentPerHour;
    private double hoursWorked;

    // constructor
    public BlueCollarWorker(String name, String surname, String PESEL, int dateOfBirth,
                            int dateOfEmployment, char sex, String company, String occupation,
                            double paymentPerHour, double hoursWorked) {
        super(name, surname, PESEL, dateOfBirth, dateOfEmployment, sex, company, occupation);
        this.paymentPerHour = paymentPerHour;
        this.hoursWorked = hoursWorked;
    }

    // getters
    public double getPaymentPerHour() { return paymentPerHour; }
    public double getHoursWorked() { return hoursWorked; }

    // setters


    // toString & display


    // calculate


}
