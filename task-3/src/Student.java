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

    //
}
