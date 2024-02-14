public class Ex2 {
    public static void main(String[] args) {
        // Create examples
        Destination dest1 = new Destination("Bialystok", "Watszawa", 18.90);
        Destination dest2 = new Destination("Warszawa", "Krakow", 23.50);

        Passenger passenger1 = new Passenger("Michal", "Kazimiruk", true);
        Passenger passenger2 = new Passenger("Karolina", "Lankau", false);

        Ticket ticket1 = new Ticket(15, dest2, passenger1);
        Ticket ticket2 = new Ticket(34, dest1, passenger2);

        
    }
}