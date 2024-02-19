public class Car extends Vehicle{
    // variable
    private String type;

    // constructor
    public Car(String type) {
        this.type = type;
    }
    public Car(String model, String mark, String color, String state, double price, String type) {
        super(model, mark, color, state, price);
        this.type = type;
    }

    // getter & setter
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    // toString
    @Override
    public String toString() {
        return "Car{" +
                super.toString() +
                ", type='" + type + '\'' +
                '}';
    }
}
