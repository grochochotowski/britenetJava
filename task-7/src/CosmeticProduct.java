public class CosmeticProduct extends Product{
    public String ingredients;
    public String purpose;

    public CosmeticProduct(String name, double price, String ingredients, String purpose) {
        super(name, price);
        this.ingredients = ingredients;
        this.purpose = purpose;
    }

    public double CalculatePrice() {
        return price;
    }
    public void display() {
        String text =
                """
                NAME: %s
                PRICE: %.2f
                INGREDIENTS: %s
                PURPOSE: %s
                """;
        System.out.printf(text, name, price, ingredients, purpose);
    }
}
