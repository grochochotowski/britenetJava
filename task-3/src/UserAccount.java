public class UserAccount {
    // variables
    private final int id;
    private String login;
    private String password;
    private User userData;
    private boolean premium;

    // constructors
    public UserAccount() {
        this.id = -1;
    }
    public UserAccount(int id, String login, String password, User userData, boolean premium) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.userData = userData;
        this.premium = premium;
    }

    
}
