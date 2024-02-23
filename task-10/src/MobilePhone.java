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

    // override
    @Override
    public void call(int time) {
        if (getOwnerData().isPayment()) talkTime += time;
        else System.out.println("Unable to make a call. The bill awaits payment");
    }

    @Override
    public void bill() {
        System.out.println(totalPayment());
        newMonth();
        ownerData.setPayment(false);
    }

    @Override
    public void newMonth() {
        this.talkTime = 0;
        this.numberSMS = 0;
    }

    @Override
    public double totalPayment() {
        return ((double)talkTime/60 * priceMinute) + (numberSMS * priceSMS);
    }

    @Override
    public void talkTimeInHours() {
        int timeLeft = talkTime;
        int hours = timeLeft / 3600;
        timeLeft -= hours * 3600;
        int minutes = timeLeft / 60;
        timeLeft -= minutes * 60;
        System.out.printf("TIME: %d:%d:%d", hours, minutes, timeLeft);
    }
}
