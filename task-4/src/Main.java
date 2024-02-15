import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // create example passengers
        Passenger passenger1 = new Passenger("Szymon", "Kowalski", 3);
        Passenger passenger2 = new Passenger("Maciej", "Bednarek", 4);
        Passenger passenger3 = new Passenger("Izabella", "Lewandowska", 5);

        Passenger passenger4 = new Passenger("Karol", "Kubica", 23);
        Passenger passenger5 = new Passenger("Karolina", "Małysz", 24);
        Passenger passenger6 = new Passenger("Paweł", "Korzeniowski", 25);

        Passenger passenger7 = new Passenger("Teodora", "Chmielewska", 65);
        Passenger passenger8 = new Passenger("Agnieszka", "Karaś", 66);
        Passenger passenger9 = new Passenger("Tadeusz", "Kościuszko", 67);

        // create example carriages
        TrainCarriage carriage1 = new TrainCarriage(30);
        TrainCarriage carriage2 = new TrainCarriage(30);
        TrainCarriage carriage3 = new TrainCarriage(30);
        TrainCarriage carriage4 = new TrainCarriage(40);
        TrainCarriage carriage5 = new TrainCarriage(40);
        TrainCarriage carriage6 = new TrainCarriage(40);

        // create example trains
        Train train1 = new Train("Bialystok", "Warszawa", 18.90);
        Train train2 = new Train("Warszawa", "Krakow", 23.40);

        // create example list of passengers and display it
        List<Passenger> passengers = Arrays.asList(passenger1, passenger5, passenger9);
        for (Passenger passenger : passengers) passenger.display();
    }
}