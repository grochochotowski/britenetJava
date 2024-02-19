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
    public String getSubCategory() { return subCategory; }
    public void setSubCategory(String subCategory) { this.subCategory = subCategory; }

    // toString
    @Override
    public String toString() {
        return "AgriculturalMachine{" +
                super.toString() +
                "subCategory='" + subCategory + '\'' +
                '}';
    }
}
