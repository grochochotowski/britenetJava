public class UserWorker extends User{
    private String position;

    public UserWorker(String name, String surname, double fee, String position) {
        super(name, surname, 10);
        this.position = position;
    }

    public String returnDescription() {
        String text =
                """
                NAME: %s %s
                FEE: %.2fPLN
                POSITION: %s
                """;
        return String.format(text,name, surname, fee, position);
    };
}
