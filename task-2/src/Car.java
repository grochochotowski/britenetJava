import java.util.Calendar;

public class Car {
    // variables
    private String brand;
    private String model;
    private int year;
    private double mileage; // km
    private double combustion; // l/100km
    private double maxSpeed; // kph
    private double speed; // kph
    private double tankCapacity; // l
    private double fuel; // l
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
        return String.format("""
                        %s %s %d
                        Mileage: %.2f km
                        Combustion: %.2f l/100km
                        Max Speed: %.2f km/h
                        Tank Capacity: %.2f l
                        Licence Plate: %s
                        === Current state ===
                        Speed: %.2f km/h
                        Fuel: %.2f l""",
                brand, model, year, mileage, combustion, maxSpeed, tankCapacity, licencePlate, speed, fuel);
    }
    public void display() {
        System.out.printf("""
                        %s %s %d
                        Licence Plate: %s
                        Mileage: %.2f km
                        Combustion: %.2f l/100km
                        Speed: %.2f / %.2f km/h
                        Fuel: %.2f / %.2f%n l""",
                brand, model, year, licencePlate, mileage, combustion, speed, maxSpeed, fuel, tankCapacity);
    }
    public int getAge() {
        return Calendar.getInstance().get(Calendar.YEAR) - year;
    }

    // speed
    public void speedUp(double speed) {
        this.speed += speed;
    }
    public void slowDown(double speed) {
        this.speed -= speed;
    }

    // fuel
    public void refuel(double fuel) {
        this.fuel += fuel;
    }
    public void refuelToFull() {
        this.fuel += tankCapacity;
    }
    public boolean isEmpty() {
        return fuel == 0;
    }

    // driving
    public void drive(double distance) {
        double tempFuel = this.fuel;
        this.fuel -= combustion * distance / 100;
        if (fuel < 0) {
            this.fuel = 0;
            this.mileage = tempFuel * 100 / combustion;
        }
        else {
            this.mileage += distance;
        }
    }
    public void stop() {
        this.speed = 0;
    }
    public void tuning(double moreSpeed) {
        this.maxSpeed = moreSpeed;
    }
}
