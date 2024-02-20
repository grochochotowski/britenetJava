public class Document {
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
}
