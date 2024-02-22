public class Patient {
    protected String name;
    protected String surname;
    protected String PESEL;
    protected String wardName;
    protected int daysStaying;
    protected int age;

    public Patient(String name, String surname, String PESEL, String wardName, int daysStaying, int age) {
        this.name = name;
        this.surname = surname;
        this.PESEL = PESEL;
        this.wardName = wardName;
        this.daysStaying = daysStaying;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPESEL() {
        return PESEL;
    }

    public void setPESEL(String PESEL) {
        this.PESEL = PESEL;
    }

    public String getWardName() {
        return wardName;
    }

    public void setWardName(String wardName) {
        this.wardName = wardName;
    }

    public int getDaysStaying() {
        return daysStaying;
    }

    public void setDaysStaying(int daysStaying) {
        this.daysStaying = daysStaying;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
}
