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
        passengerList.add(passenger);
    }

    public void displayPassenger() {
        for (Passenger passenger : passengerList) {
            passenger.display();
        }
    }

    // carriage
    public void displayCarriage() {
        System.out.printf("Carriage: %d seats\nPassengers:", maxSeats);
        displayPassenger();
    }

    // discount
    public int countEntitledToSeniorDiscount() {
        int count = 0;
        for (Passenger passenger : passengerList) {
            if (passenger.getAge() > 65) count++;
        }
        return count;
    }

}
