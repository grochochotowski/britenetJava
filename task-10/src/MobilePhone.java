public class MobilePhone implements TelephoneOperator {
    private double priceMinute;
    private double conversation;
    private int talkTime;
    private int numberSMS;
    private PersonalData ownerData;

    // constructors
    public MobilePhone() {}
    public MobilePhone(double priceMinute, double conversation, int talkTime, int numberSMS, PersonalData ownerData) {
        this.priceMinute = priceMinute;
        this.conversation = conversation;
        this.talkTime = talkTime;
        this.numberSMS = numberSMS;
        this.ownerData = ownerData;
    }
}
