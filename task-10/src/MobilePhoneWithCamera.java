public class MobilePhoneWithCamera extends MobilePhone{
    private int numberMMS;
    public MobilePhoneWithCamera(double priceMinute, double priceSMS, PersonalData ownerData, int numberMMS) {
        super(priceMinute, priceSMS, ownerData);
        this.numberMMS = numberMMS;
    }

    public int getNumberMMS() {
        return numberMMS;
    }

    public void setNumberMMS(int numberMMS) {
        this.numberMMS = numberMMS;
    }

    public void sendPhoto() {
        numberMMS += 1;
    }
}
