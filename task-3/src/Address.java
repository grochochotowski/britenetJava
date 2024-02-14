public class Address {
    // variables
    private String city;
    private String street;
    private String number;
    private String postalCode;


    // constructors
    public Address() { }
    public Address(String city, String street, String number, String postalCode) {
        this.city = city;
        this.street = street;
        this.number = number;
        this.postalCode = postalCode;
    }

    // getters
    public String getCity() { return city; }
    public String getStreet() { return street; }
    public String getNumber() { return number; }
    public String getPostalCode() { return postalCode; }

    // setters
    public void setCity(String city) { this.city = city; }
    public void setStreet(String street) { this.street = street; }
    public void setNumber(String number) { this.number = number; }
    public void setPostalCode(String postalCode) { this.postalCode = postalCode; }

    // other
    public void display() {
        String text =
                """
                %s, %s, %s, %s
                """,
        city, postalCode, street, number;
        System.out.println(text);
    }
}
