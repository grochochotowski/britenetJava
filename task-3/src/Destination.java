public class Destination {
    // variables
    private String from;
    private String to;
    private double price;

    // constructors
    public Destination() { }
    public Destination(String from, String to, double price) {
        this.from = from;
        this.to = to;
        this.price = price;
    }

    // getters
    public String getFrom() { return from; }
    public String getTo() { return to; }
    public double getPrice() { return price; }

    // setters
    public void setFrom(String from) { this.from = from; }
    public void setTo(String to) { this.to = to; }
    public void setPrice(double price) { this.price = price; }

    // other
    
}
