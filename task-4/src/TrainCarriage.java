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
}
