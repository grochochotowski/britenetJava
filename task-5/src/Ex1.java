public class Ex1 {
    public static void main(String[] args) {
        // example data
        Employee employee1 = new Employee("Maciej", "Makarewicz", 2000, "web dev", "Poland", "Bialystok", "Sienkiewicza", 10500.50);
        Employee employee2 = new Employee("Karol", "Szycko", 1999, "shop assistant", "Poland", "Bialystok", "Mickiewicza", 5000.20);

        // display methods
        System.out.println(employee1.toString());
        employee2.displayAllData();
        employee1.displayAddress();

        
    }
}