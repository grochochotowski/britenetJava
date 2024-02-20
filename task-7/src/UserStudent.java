public class UserStudent extends User{
    private int year;

    public UserStudent(String name, String surname, double fee, int year) {
        super(name, surname,0);
        this.year = year;
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
