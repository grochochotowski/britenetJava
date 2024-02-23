public class PersonalData {
    private String name;
    private String surname;
    private final int year_of_birth;
    private String phone_number;
    private boolean payment;

    // constructor
    public PersonalData(String name, String surname, int year_of_birth, String phone_number, boolean payment) {
        this.name = name;
        this.surname = surname;
        this.year_of_birth = year_of_birth;
        this.phone_number = phone_number;
        this.payment = payment;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear_of_birth() {
        return year_of_birth;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public boolean isPayment() {
        return payment;
    }

    public void setPayment(boolean payment) {
        this.payment = payment;
    }

    // methods
    public void displayPayment()  {
        System.out.printf("Bill %s", payment ? "is paid" : "awaits payment");
    }

    public void displayData()  {
        System.out.println(
                "name=" + name + '\n' +
                ", surname=" + surname + '\n' +
                ", year_of_birth=" + year_of_birth + '\n' +
                ", phone_number=" + phone_number + '\n' +
                ", payment=" + payment
        );
    }
}
