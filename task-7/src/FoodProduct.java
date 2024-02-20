public class FoodProduct extends Product {
    public String expires;
    public String type;

    public FoodProduct(String name, double price, String expires, String type) {
        super(name, price);
        this.expires = expires;
        this.type = type;
    }

    public double CalculatePrice() {
        return price;
    }
    public void display() {
        String text =
                """
                NAME: %s
                TYPE: %s
                PRICE: %.2f
                EXPIRES: %s
                """;
        System.out.printf(text, name, type, price, expires);
    }
}
