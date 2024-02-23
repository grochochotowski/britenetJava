public class MobilePhone implements TelephoneOperator {
    private double priceMinute;
    private double priceSMS;
    private int talkTime;
    private int numberSMS;
    private PersonalData ownerData;

    // constructors
    public MobilePhone() {}
    public MobilePhone(double priceMinute, double priceSMS, PersonalData ownerData) {
        this.priceMinute = priceMinute > 0 ? priceMinute : 0;
        this.priceSMS = priceSMS > 0 ? priceSMS : 0;
        this.talkTime = 0;
        this.numberSMS = 0;
        this.ownerData = ownerData;
    }

    // getters
    public double getPriceMinute() {
        return priceMinute;
    }

    public double getPriceSMS() {
        return priceSMS;
    }

    public int getTalkTime() {
        return talkTime;
    }

    public int getNumberSMS() {
        return numberSMS;
    }

    public PersonalData getOwnerData() {
        return ownerData;
    }

    // setters
    public void setPriceMinute(double priceMinute) {
        this.priceMinute = priceMinute;
    }

    public void setPriceSMS(double priceSMS) {
        this.priceSMS = priceSMS;
    }

    public void setOwnerData(PersonalData ownerData) {
        this.ownerData = ownerData;
    }

    public void display() {
        System.out.println(
            "priceMinute=" + priceMinute + '\n' +
             ", priceSMS=" + priceSMS + '\n' +
             ", talkTime=" + talkTime + '\n' +
             ", numberSMS=" + numberSMS + '\n' +
             ", ownerData=\n"
        );
        ownerData.displayData();
    }

    public void sendSMS(int no) {
        if (no <= 6) {
            if (ownerData.isPayment()) {
                this.numberSMS += no;
            }
            else {
                System.out.println("Unable to send SMS. The bill awaits payment.");
            }
        }
        else {
            System.out.println("Too many SMS - cannot send");
        }
    }

    public void payBill() {
        ownerData.setPayment(true);
    }
}
