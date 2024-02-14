public class User {
    // variables
    private String name ;
    private int age;
    private String email;
    private String phoneNumber;

    // constructors
    public User() { }
    public User(String name, int age, String email, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getEmail() { return email; }
    public String getPhone_number() { return phoneNumber; }

    // setters
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setEmail(String email) { this.email = email; }
    public void setPhone_number(String phoneNumber) { this.phoneNumber = phoneNumber; }

    // other
    public void display() {
        String text = """
                    NAME: %s
                    AGE: %d
                    EMAIL: %s
                    PHONE NUMBER: %s
                    """;
        System.out.printf(text, name, age, email, phoneNumber);
    }
}
