public class User {
    // variables
    private String name ;
    private int age;
    private String email;
    private String phone_number;

    // constructors
    public User() { }
    public User(String name, int age, String email, String phone_number) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone_number = phone_number;
    }

    // getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getEmail() { return email; }
    public String getPhone_number() { return phone_number; }

    // setters
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setEmail(String email) { this.email = email; }
    public void setPhone_number(String phone_number) { this.phone_number = phone_number; }

    // other
    
}
