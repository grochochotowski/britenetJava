import java.util.ArrayList;
import java.util.List;

public class Train {
    // variables
    private String from;
    private String to;
    private double price;
    private List<TrainCarriage> carriageList;

    // constructor
    public Train(String from, String to, double price) {
        this.from = from;
        this.to = to;
        this.price = price;
        this.carriageList = new ArrayList<>();
    }

    // getters
    public String getFrom() { return from; }
    public String getTo() { return to; }
    public double getPrice() { return price; }
    public List<TrainCarriage> getCarriageList() { return carriageList; }

    
}
