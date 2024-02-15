import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create example passengers and display it
        List<Passenger> passengers = new ArrayList<>();

        passengers.add(new Passenger("Szymon", "Kowalski", 3));
        passengers.add(new Passenger("Maciej", "Bednarek", 4));
        passengers.add(new Passenger("Izabella", "Lewandowska", 5));

        passengers.add(new Passenger("Karol", "Kubica", 23));
        passengers.add(new Passenger("Karolina", "Małysz", 24));
        passengers.add(new Passenger("Paweł", "Korzeniowski", 25));

        passengers.add(new Passenger("Teodora", "Chmielewska", 65));
        passengers.add(new Passenger("Agnieszka", "Karaś", 66));
        passengers.add(new Passenger("Tadeusz", "Kościuszko", 67));

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Name: ");
            String name = scan.next();
            System.out.print("Surname: ");
            String surname = scan.next();;
            System.out.print("Age: ");
            int age = scan.nextInt();

            passengers.add(new Passenger(name, surname, age));
        }

        System.out.println("\n=== EXAMPLE LIST OF PASSENGERS ===");
        for (Passenger passenger : passengers) passenger.display();
        System.out.println("==================================\n");


        // create example carriages
        TrainCarriage carriage1 = new TrainCarriage(30);
        TrainCarriage carriage2 = new TrainCarriage(40);

        // create example trains
        Train train1 = new Train("Bialystok", "Warszawa", 18.90);
        Train train2 = new Train("Warszawa", "Krakow", 23.40);

        // add passengers to carriages
        carriage1.addPassenger(passengers.get(1));
        carriage1.addPassenger(passengers.get(2));
        carriage1.addPassenger(passengers.get(5));
        carriage1.addPassenger(passengers.get(6));
        carriage1.addPassenger(passengers.get(8));
        carriage1.addPassenger(passengers.get(3));
        carriage1.addPassenger(passengers.get(9));

        for (int i = 0; i < 39; i++) carriage2.addPassenger(passengers.get(i%11+1));
        carriage2.addPassenger(passengers.get(1));
        carriage2.addPassenger(passengers.get(2));
        carriage2.addPassenger(passengers.get(3));

        // display carriage and/or passengers
        System.out.println("\n=========== CARRIAGE 1 ===========");
        carriage1.displayCarriage();
        System.out.println("==================================");
        System.out.println("=== PASSENGERS FROM CARRIAGE 2 ===");
        carriage2.displayPassengers();
        System.out.println("==================================");

        // count in carriages
        System.out.println("======= COUNT IN CARRIAGES =======");
        System.out.printf("Juniors in carriage 1: %d\n", carriage1.countEntitledToJuniorDiscount());
        System.out.printf("Seniors in carriage 2: %d\n", carriage2.countEntitledToSeniorDiscount());
        System.out.println("==================================");
    }
}