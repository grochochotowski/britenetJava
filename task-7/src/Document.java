public abstract class Document {
    // variables
    protected String date;
    protected String city;
    protected String contractor1;
    protected String contractor2;
    protected boolean isSigned ;

    // constructors
    public Document(String date, String city, String contractor1, String contractor2, boolean isSigned) {
        this.date = date;
        this.city = city;
        this.contractor1 = contractor1;
        this.contractor2 = contractor2;
        this.isSigned = false;
    }

    // display
    public void displayContractors() {
        System.out.printf("\nDocument drawn between %s and %s\n", contractor1, contractor2);
    }

    public void displayBasicData() {
        String text =
                """
                Where: %s
                When: %s
                Between: %s and %s
                isSigned: %s
                """;
        System.out.printf(text, city, date, contractor1, contractor2, isSigned ? "YES" : "NO");
    }
    public abstract void displayDetailedData();

    // return


}
