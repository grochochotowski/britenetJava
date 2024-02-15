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
    private void addCarriage(TrainCarriage carriage) {
        this.carriageList.add(carriage);
    }

    // train
    private void displayTrainInfo() {
        System.out.printf("Train (%d carriages):\n" +
                "%s >>> %s\n" +
                "Price: %.2f\n",
                carriageList.size(), from, to, price);
        for (int i = 0; i < carriageList.size(); i++) {
            System.out.printf("Carriage #%d:\n", i);
            carriageList.get(i).displayPassenger();
        }
    }

    // discounts
    public int countEntitledToSeniorDiscount() {
        int count = 0;
        for (TrainCarriage carriage : carriageList) count += carriage.countEntitledToSeniorDiscount();
        return count;
    }
}
