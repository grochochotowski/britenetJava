import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        // create example data
        Book book = new Book("BookTitle", "Sth", 2024, "ISBN", 99.99, 0, "Smn");
        Book book2 = new Book("BookTitle2", "Sth2", 2022, "ISBN2", 22.22, 0, "Smn2");

        // test display
        book.display();
        System.out.print("\n");
        book2.display();
        System.out.print("\n\n");

        // test buying and selling
        book.buy(10);
        book.sell(4);

        book2.buy(20);
        book2.sell(17);

        // display
        book.display();
        System.out.print("\n\n");

        // test difference
        System.out.print(Book.incomeDiff(book, book2));
    }
}