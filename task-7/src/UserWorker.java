public class UserWorker extends User{
    private String position;

    public UserWorker(String name, String surname, String position) {
        super(name, surname);
        this.position = position;
        this.fee = 10;
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
