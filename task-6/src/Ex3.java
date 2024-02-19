public class Ex3 {
    public static void main(String[] args) {
        // create example data
        Vehicle vehicle = new Vehicle("Airbus", "A320", "white", "sold", 30000000);
        Car car = new Car("Volkswagen", "Passat B8", "white", "not-sold", 89000, "sedan");
        AgriculturalMachine agriculturalMachine = new AgriculturalMachine("Claas", "Lexion 600", "white-green", "sold", 315000, "combine");

        // test toString
        System.out.println("Vehicle{" + vehicle.toString() + "}");
        System.out.println(car.toString());
        System.out.println(agriculturalMachine.toString());

    }
}