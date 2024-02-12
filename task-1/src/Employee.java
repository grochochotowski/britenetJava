public class Employee {

    // Variables
    private String name;
    private String surname;
    private String PESEL;
    private String occupation;
    private double salary;
    private int experienceStage;

    // Constructors
    public Employee() {
        this.name = "";
        this.surname = "";
        this.PESEL = "";
        this.occupation = "";
        this.salary = 0.0;
        this.experienceStage = -1;
    }
    public Employee(String name, String surname, String PESEL, String occupation, double salary, int experienceStage) {
        this.name = name;
        this.surname = surname;
        this.PESEL = PESEL;
        this.occupation = occupation;
        this.salary = salary;
        this.experienceStage = experienceStage;
    }

    // Getters
    public String getName() { return name; }
    public String getSurname() { return surname; }
    public String getPESEL() { return PESEL; }
    public String getOccupation() { return occupation; }
    public double getSalary() { return salary; }
    public int getExperienceStage() { return experienceStage; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setSurname(String surname) { this.surname = surname; }
    public void setPESEL(String PESEL) { this.PESEL = PESEL; }
    public void setOccupation(String occupation) { this.occupation = occupation; }
    public void setSalary(double salary) { this.salary = salary; }
    public void setExperienceStage(int experienceStage) { this.experienceStage = experienceStage; }

    // Other method
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", PESEL='" + PESEL + '\'' +
                ", occupation='" + occupation + '\'' +
                ", salary=" + salary +
                ", experienceStage=" + experienceStage +
                '}';
    }

    public String display() {
        String experience = switch (experienceStage) {
            case 0 -> "intern";
            case 1 -> "junior";
            case 2 -> "mid";
            case 3 -> "senior";
            default -> "none";
        };
        return String.format("Name: %s %s\n" +
                "PESEL: %s\n" +
                "Occupation: %s\n" +
                "Salary: %.2fPLN\n" +
                "Experience: %s",
                name, surname, PESEL, occupation, salary, experience);
    }

    public void giveRise(double rise) {
        setSalary(salary + rise);
    }
}
