public class Ex3 {
    public static void main(String[] args) {
        // Create examples
        Address add1 = new Address("Bialystok", "Sienkiewicza", "12A", "15-082");
        Address add2 = new Address("Bialystok", "Poludniowa", "4", "15-341");

        Person person1 = new Person("Michal", "Kazimiruk", 2006, add1);
        Person person2 = new Person("Karolina", "Mackiewicz", 2015, add2);

        Student student1 = new Student(1, 1, 4.5, person1);
        Student student2 = new Student(2, 5, 3.4, person2);

        // test methods
        student1.checkAverage(4.4);
        student1.checkAverage(4.6);

        student2.display();
    }
}
