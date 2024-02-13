public class Car {
    // variables
    private String brand;
    private String model;
    private int year;
    private double mileage;
    private double combustion;
    private double maxSpeed;
    private double speed;
    private double tankCapacity;
    private double fuel;
    private String licencePlate;

    // constructors
    public Car() { }
    public Car(String brand, String model, int year, double mileage, double combustion, double maxSpeed, double tankCapacity, String licencePlate) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.combustion = combustion;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
        this.tankCapacity = tankCapacity;
        this.fuel = 0;
        this.licencePlate = licencePlate;
    }

    // getters
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public double getMileage() { return mileage; }
    public double getCombustion() { return combustion; }
    public double getMaxSpeed() { return maxSpeed; }
    public double getSpeed() { return speed; }
    public double getTankCapacity() { return tankCapacity; }
    public double getFuel() { return fuel; }
    public String getLicencePlate() { return licencePlate; }

    // setters

    //other methods

}
