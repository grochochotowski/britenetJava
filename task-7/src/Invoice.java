public class Invoice extends Document{
    // variables
    private int number;
    private double value;

    // constructor
    public Invoice(String date, String city, String contractor1, String contractor2, boolean isSigned, int number, double value) {
        super(date, city, contractor1, contractor2, isSigned);
        this.number = number;
        this.value = value;
    }

    // display
    public void displayDetailedData() {
        String text =
                """
                Type: Invoice
                Number: %s
                Where: %s
                When: %s
                Between: %s and %s
                Total value: %s
                isSigned: %s
                """;
        System.out.printf(text, number, city, date, contractor1, contractor2, value, isSigned ? "YES" : "NO");
    };

    // return
    public String returnDocumentType() {
        return "Document type: Invoice";
    };

    // sign
    public void Sign() {

    };

}
