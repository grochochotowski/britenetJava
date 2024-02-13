import java.util.Calendar;

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

    // car info
    @Override
    public String toString() {
        return String.format("%s %s %d\n" +
                        "Mileage: %.2f\n" +
                        "Combustion: %.2f\n" +
                        "Max Speed: %.2f\n" +
                        "Tank Capacity: %.2f\n" +
                        "Licence Plate: %s\n" +
                        "=== Current state ===\n" +
                        "Speed: %.2f\n" +
                        "Fuel: %.2f",
                brand, model, year, mileage, combustion, maxSpeed, tankCapacity, licencePlate, speed, fuel);
    }
    public void display() {
        System.out.printf("%s %s %d\n" +
                        "Licence Plate: %s\n" +
                        "Mileage: %.2f\n" +
                        "Combustion: %.2f\n" +
                        "Speed: %.2f / %.2f\n" +
                        "Fuel: %.2f / %.2f%n",
                brand, model, year, licencePlate, mileage, combustion, speed, maxSpeed, fuel, tankCapacity);
    }
    public int getAge() {
        return Calendar.getInstance().get(Calendar.YEAR) - year;
    }

    // speed
    public void sppedUp() {

    }
    public void slowDown() {

    }

    // fuel
    public void refuel() {

    }
    public void refuelToFull() {

    }
    public boolean isEmpty() {

    }

    // driving
    public void drive() {

    }
    public void stop() {

    }
    public void tuning() {

    }
}
