public class EmploymentContract extends Document{
    // variables
    private double salary;
    private String startDate;
    private String endDate;

    // constructor

    public EmploymentContract(String date, String city, String contractor1, String contractor2, boolean isSigned,
                              double salary, String startDate, String endDate) {
        super(date, city, contractor1, contractor2, isSigned);
        this.salary = salary;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    
}
