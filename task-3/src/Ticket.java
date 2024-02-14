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

    // getters
    public int getSeat() { return seat; }
    public Destination getDestination() { return destination; }
    public Passenger getPassenger() { return passenger; }

    // setters
    public void setSeat(int seat) { this.seat = seat; }
    public void setDestination(Destination destination) { this.destination = destination; }
    public void setPassenger(Passenger passenger) { this.passenger = passenger; }

    // other
    public double getFinalPrice() {
        return this.destination.getPrice() * ( this.passenger.isDiscount() ? 0.5 : 1);
    }
    public void display() {
        this.destination.display();
        String text = """
                    Seat: %d
                    Passenger:
                    """;
        System.out.printf(text, seat);
        this.passenger.display();
        System.out.print("\n");
    }
}
