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

    // carriage
    public void addCarriage(TrainCarriage carriage) {
        this.carriageList.add(carriage);
        System.out.println("Carriage added");
    }

    // train
    public void displayTrainInfo() {
        System.out.printf("Train (%d carriages):\n" +
                "%s >>> %s\n" +
                "Price: %.2f\n",
                carriageList.size(), from, to, price);
        for (int i = 0; i < carriageList.size(); i++) {
            System.out.printf("Carriage #%d:\n", i);
            carriageList.get(i).displayPassengers();
        }
    }

    // discounts
    public int countEntitledToSeniorDiscount() {
        int count = 0;
        for (TrainCarriage carriage : carriageList) count += carriage.countEntitledToSeniorDiscount();
        return count;
    }
}
