public class UserStudent extends User{
    private int year;

    public UserStudent(String name, String surname, int year) {
        super(name, surname);
        this.year = year;
        this.fee = 0;
    }

    public String returnDescription() {
        String text =
                """
                NAME: %s %s
                FEE: %.2fPLN (student plan)
                SCHOOL YEAR: %d
                """;
        return String.format(text,name, surname, fee, year);
    };
}
