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
    public void setName(String name) { this.name = name; }
    public void setSurname(String surname) { this.surname = surname; }
    public void setPESEL(String PESEL) { this.PESEL = PESEL; }
    public void setDateOfBirth(int dateOfBirth) { this.dateOfBirth = dateOfBirth; }
    public void setDateOfEmployment(int dateOfEmployment) { this.dateOfEmployment = dateOfEmployment; }
    public void setSex(char sex) { this.sex = sex; }
    public void setCompany(String company) { this.company = company; }
    public void setOccupation(String occupation) { this.occupation = occupation; }


    // toString & display
    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", PESEL='" + PESEL + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", dateOfEmployment=" + dateOfEmployment +
                ", sex=" + sex +
                ", company='" + company + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }


    // calculate


}
