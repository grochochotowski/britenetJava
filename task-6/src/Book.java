public class Book extends Publication {
    // variable
    private String author;

    // constructor
    public Book(String title, String publisher, int year, String ident, double price, int quantity, String author) {
        super(title, publisher, year, ident, price, quantity);
        this.author = author;
    }

    // getter & setter
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
}
