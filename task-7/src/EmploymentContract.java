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

    // display
    public void displayDetailedData() {
        String text =
                """
                Type: Contract of employment
                Time: %s - %s
                Where: %s
                When: %s
                Between: %s and %s
                Salary: %.2f
                isSigned: %s
                """;
        System.out.printf(text, startDate, endDate, city, date, contractor1, contractor2, salary, isSigned ? "YES" : "NO");
    };

    // return
    public String returnDocumentType() {
        return "Document type: Contract of employment";
    };

    // sign
    public void Sign() {
        this.isSigned = true;
        System.out.println("Contract of employment has been signed");
    };

}
