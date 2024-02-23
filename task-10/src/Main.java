public class Main {
    public static void main(String[] args) {
        PersonalData data = new PersonalData("Name", "Surname", 2000, "999-888-777", true);
        MobilePhone phone = new MobilePhone(10, 5, data);

        phone.call(30);
        phone.sendSMS(3);
        phone.sendSMS(3);
        phone.bill();
        phone.payBill();
    }
}