public class PersonalData {
    private String name;
    private String surname;
    private final int year_of_birth;
    private String phone_number;
    private boolean payment;

    public PersonalData(String name, String surname, int year_of_birth, String phone_number, boolean payment) {
        this.name = name;
        this.surname = surname;
        this.year_of_birth = year_of_birth;
        this.phone_number = phone_number;
        this.payment = payment;
    }
}
