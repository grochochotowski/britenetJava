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

    // getters
    public int getId() { return id; }
    public String getLogin() { return login; }
    public String getPassword() { return password; }
    public User getUserData() { return userData; }
    public boolean isPremium() { return premium; }


    // setters
    public void setLogin(String login) { this.login = login; }
    public void setPassword(String password) { this.password = password; }
    public void setUserData(User userData) { this.userData = userData; }
    public void setPremium(boolean premium) { this.premium = premium; }

    // other
    
}
