public class Student {
    // variables
    private final int id;
    private int semester;
    private double average;
    private final Person personalData;

    //constructors
    public Student() {
        this.id = -1;
        this.personalData = new Person();
    }
    public Student(int id, int semester, double average, Person personalData) {
        this.id = id;
        this.semester = semester;
        this.average = average;
        this.personalData = personalData;
    }

    // getters
    public int getId() { return id; }
    public int getSemester() { return semester; }
    public double getAverage() { return average; }
    public Person getPersonalData() { return personalData; }

    public int getYear() { return (int) (double) (semester / 2); }

    // setters
    public void setSemester(int semester) { this.semester = semester; }
    public void setAverage(double average) { this.average = average; }

    // other
    public boolean checkAverage(double avg) {
        return this.average > avg;
    }
    public void display() {
        String text = """
                    ID:
                    %s
                    PERSONAL DATA:
                    """;
        System.out.printf(text);
        this.personalData.display();
        text = """
               SEMESTER: %d
               AVERAGE: %.2f
               """;
        System.out.printf(text, semester, average);
    }
}
