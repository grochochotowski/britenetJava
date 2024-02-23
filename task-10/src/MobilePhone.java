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
}
