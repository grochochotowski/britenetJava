public class Worker {
    // variables
    private String name;
    private String surname;
    private String PESEL;
    private int dateOfBirth;
    private int dateOfEmployment;
    private char sex;
    private String company;
    private String occupation;

    // constructor
    public Worker(String name, String surname, String PESEL, int dateOfBirth, int dateOfEmployment, char sex, String company, String occupation) {
        this.name = name;
        this.surname = surname;
        this.PESEL = PESEL;
        this.dateOfBirth = dateOfBirth;
        this.dateOfEmployment = dateOfEmployment;
        this.sex = sex;
        this.company = company;
        this.occupation = occupation;
    }

    // getters
    public String getName() { return name; }
    public String getSurname() { return surname; }
    public String getPESEL() { return PESEL; }
    public int getDateOfBirth() { return dateOfBirth; }
    public int getDateOfEmployment() { return dateOfEmployment; }
    public char getSex() { return sex; }
    public String getCompany() { return company; }
    public String getOccupation() { return occupation; }


    // setters


    // toString & display


    // calculate


}
