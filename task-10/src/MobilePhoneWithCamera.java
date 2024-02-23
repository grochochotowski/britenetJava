public class MobilePhoneWithCamera extends MobilePhone{
    private int numberMMS;
    public MobilePhoneWithCamera(double priceMinute, double priceSMS, PersonalData ownerData, int numberMMS) {
        super(priceMinute, priceSMS, ownerData);
        this.numberMMS = numberMMS;
    }

    
}
