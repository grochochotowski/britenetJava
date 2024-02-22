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

    // getters setters
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

    // methods
    public boolean isHigher(int days) {
        return days > this.daysStaying;
    }

    public void addXtraDay() {
        this.daysStaying += 1;
    }

    public boolean checkWard(String ward) {
        return ward.equals(this.wardName);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", PESEL='" + PESEL + '\'' +
                ", wardName='" + wardName + '\'' +
                ", daysStaying=" + daysStaying +
                ", age=" + age +
                '}';
    }

    public void display() {
        String text =
                """
                name: %s
                surname: %s
                PESEL: %s
                wardName= %s
                daysStaying: %d
                age: %d\n
                """;
        System.out.printf(text, name, surname, PESEL, wardName, daysStaying, age);
    }
}
