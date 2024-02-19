public class Vehicle {
    // variables
    private String model;
    private String mark;
    private String color;
    private String state;
    private double price;

    // constructor
    public Vehicle() { }

    public Vehicle(String model, String mark, String color, String state, double price) {
        this.model = model;
        this.mark = mark;
        this.color = color;
        this.state = state;
        this.price = price;
    }

    // getters
    public String getModel() { return model; }
    public String getMark() { return mark; }
    public String getColor() { return color; }
    public String getState() { return state; }
    public double getPrice() { return price; }

    // setters
    public void setModel(String model) { this.model = model; }
    public void setMark(String mark) { this.mark = mark; }
    public void setColor(String color) { this.color = color; }
    public void setState(String state) { this.state = state; }
    public void setPrice(double price) { this.price = price; }

    // toString
    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", mark='" + mark + '\'' +
                ", color='" + color + '\'' +
                ", state='" + state + '\'' +
                ", price=" + price +
                '}';
    }
}
