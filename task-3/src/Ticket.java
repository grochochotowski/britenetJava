public class Ticket {
    // variables
    private int seat;
    private Destination destination;
    private Passenger passenger;

    // constructor
    public Ticket() { }
    public Ticket(int seat, Destination destination, Passenger passenger) {
        this.seat = seat;
        this.destination = destination;
        this.passenger = passenger;
    }

    
}
