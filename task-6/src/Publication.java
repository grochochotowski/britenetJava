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

    // setters
    public void setTitle(String title) { this.title = title; }
    public void setPublisher(String publisher) { this.publisher = publisher; }
    public void setYear(int year) { this.year = year; }
    public void setIdent(String ident) { this.ident = ident; }
    public void setPrice(double price) { this.price = price; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    // display
    public void display() {
        String text =
                """
                TITLE: %s
                PUBLISHER: %s
                YEAR: %d
                IDENT: %s
                PRICE: %.2f
                QUANTITY: %d
                """;
        System.out.printf(text, title, publisher, year, ident, price, quantity);
    }

    // quantity
    public void buy(int n) {
        this.quantity += n;
    }
    public void sell(int n) {
        this.quantity -= n;
    }
}
