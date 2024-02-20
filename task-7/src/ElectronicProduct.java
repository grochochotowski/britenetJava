public class ElectronicProduct extends Product {
    public int guarantee;
    public String producer;

    public ElectronicProduct(String name, double price, int guarantee, String producer) {
        super(name, price);
        this.guarantee = guarantee;
        this.producer = producer;
    }

    public double CalculatePrice() {
        return price;
    }
    public void display() {
        String text =
                """
                PRODUCER: %s
                NAME: %s
                PRICE: %.2f
                GUARANTEE: %s
                """;
        System.out.printf(text, producer, name, price, guarantee);
    }
}
