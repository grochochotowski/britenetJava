public class Publication {
    // variables
    private String title;
    private String publisher;
    private int year;
    private String ident;
    private double price;
    private int quantity;

    // constructor
    public Publication(String title, String publisher, int year, String ident, double price, int quantity) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;
        this.ident = ident;
        this.price = price;
        this.quantity = quantity;
    }

    // getters
    public String getTitle() { return title; }
    public String getPublisher() { return publisher; }
    public int getYear() { return year; }
    public String getIdent() { return ident; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
}
