public class AgriculturalMachine extends Vehicle{
    // variable
    private String subCategory;

    // constructor
    public AgriculturalMachine(String subCategory) {
        this.subCategory = subCategory;
    }
    public AgriculturalMachine(String model, String mark, String color, String state, double price, String subCategory) {
        super(model, mark, color, state, price);
        this.subCategory = subCategory;
    }

    // getter & setter
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    // toString
    @Override
    public String toString() {
        return "Car{" +
                super.toString() +
                "type='" + type + '\'' +
                '}';
    }
}
