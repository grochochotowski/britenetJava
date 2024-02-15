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

    
}
