import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        // create example data
        Book book = new Book("BookTitle", "Sth", 2024, "ISBN", 99.99, 0, "Smn");

        // test display
        book.display();
        System.out.print("\n");

        // test buying and selling
        book.buy(10);
        book.sell(4);

        // display
        book.display();
    }
}