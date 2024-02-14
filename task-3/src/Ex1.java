public class Ex1 {
    public static void main(String[] args) {
        // Create examples
        Address add1 = new Address("Bialystok", "Sienkiewicza", "12A", "15-082");
        Address add2 = new Address("Bialystok", "Poludniowa", "4", "15-341");

        Person person1 = new Person("Michal", "Kazimiruk", 2006, add1);
        Person person2 = new Person("Karolina", "Mackiewicz", 2015, add2);
        Person person3 = new Person("Maciej", "Kowalczuk", 1950,
                new Address("Bialsytok", "Zachodnia", "15", "15-341"));

        
    }
}