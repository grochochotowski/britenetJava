import java.security.spec.RSAOtherPrimeInfo;

public class Main {
    public static void main(String[] args) {
        // Create example data
        Employee employee_1 = new Employee("Michał", "Kazimiruk", "12345678910", "dev", 15000.50, 2);
        Employee employee_2 = new Employee("Karol", "Kruchelski", "1111122223", "hr", 12000, 0);
        Employee employee_3 = new Employee("Maciej", "Król", "444444555556", "dev", 200000, 3);
        Employee employee_4 = new Employee("Karolina", "Makarewicz", "77777888889", "dev", 10000, 1);

        // Display all with toString
        System.out.println(employee_1.toString());
        System.out.println(employee_2.toString());
        System.out.println(employee_3.toString());
        System.out.println(employee_4.toString());

        System.out.println("\n");
        // Display all with display
        System.out.println(employee_1.display() + "\n");
        System.out.println(employee_2.display() + "\n");
        System.out.println(employee_3.display() + "\n");
        System.out.println(employee_4.display() + "\n");

        System.out.println("\n");
        // Display rise for 1 and 3
        employee_1.giveRise(200.89);
        employee_3.giveRise(100.3);
        System.out.println(employee_1.display() + "\n");
        System.out.println(employee_3.display() + "\n");
    }
}