import java.util.*;

public class TrainCarriage {
    // variables
    private int maxSeats;
    private List<Passenger> passengerList;

    // constructor
    public TrainCarriage(int maxSeats) {
        this.maxSeats = maxSeats;
        this.passengerList = new ArrayList<>();
    }

    // getters
    public int getMaxSeats() { return maxSeats; }
    public List<Passenger> getPassengerList() { return passengerList; }

    // setters
    public void setMaxSeats(int maxSeats) { this.maxSeats = maxSeats; }
    public void setPassengerList(List<Passenger> passengerList) { this.passengerList = passengerList; }

    // passenger
    public void addPassenger(Passenger passenger) {
        if (this.passengerList.size() <= this.maxSeats) {
            passengerList.add(passenger);
            System.out.println("Ticket booked successfully");
        }
        else System.out.println("Can't book a ticket - no seats available");
    }
    public void displayPassengers() {
        for (Passenger passenger : passengerList) {
            passenger.display();
        }
    }

    // carriage
    public void displayCarriage() {
        System.out.printf("Carriage:\n" +
                "%d seats\n" +
                "%d seats taken\n" +
                "%d seats available\n" +
                "Passengers:\n",
                maxSeats, passengerList.size(), maxSeats-passengerList.size());
        displayPassengers();
    }

    // discount
    public int countEntitledToSeniorDiscount() {
        int count = 0;
        for (Passenger passenger : passengerList) {
            if (passenger.getAge() > 65) count++;
        }
        return count;
    }
    public int countEntitledToJuniorDiscount() {
        int count = 0;
        for (Passenger passenger : passengerList) {
            if (passenger.getAge() < 5) count++;
        }
        return count;
    }
}
