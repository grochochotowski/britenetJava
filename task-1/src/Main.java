import java.security.spec.RSAOtherPrimeInfo;

public class Main {
    public static void main(String[] args) {
        // ========== EMPLOYEE ==========
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
        System.out.println("\n\n");

        // Display all with display
        employee_1.display(); System.out.println("\n");
        employee_2.display(); System.out.println("\n");
        employee_3.display(); System.out.println("\n");
        employee_4.display(); System.out.println("\n");
        System.out.println("\n\n");

        // Display rise for 1 and 3
        employee_1.giveRise(200.89);
        employee_3.giveRise(100.3);
        employee_1.display(); System.out.println("\n");
        employee_3.display(); System.out.println("\n");

        // ========== ACCOUNT ==========
        System.out.println("\n\n\n\n");
        // Create example data
        Account account_1 = new Account("Adam", "Rogowski", 100.75, "41 1234 5678 9012 3456 7890 1234");
        Account account_2 = new Account("Karol", "Maciuka", 50, "42 1234 5678 9012 3456 7890 1234");
        Account account_3 = new Account("Maciej", "Pan", 450.5, "43 1234 5678 9012 3456 7890 1234");
        Account account_4 = new Account("Ewa", "Miła", 23.26, "44 1234 5678 9012 3456 7890 1234");

        // Display all with toString
        System.out.println(account_1.toString());
        System.out.println(account_2.toString());
        System.out.println(account_3.toString());
        System.out.println(account_4.toString());
        System.out.println("\n");

        // Increase for 1
        account_1.increaseBalance(100);

        // Decrease for 2 and 3
        account_2.decreaseBalance(100);
        account_3.decreaseBalance(100);

        // Withdraw all for 4
        account_4.withdrawAll();

        // Display all with display
        account_1.display(); System.out.println("\n");
        account_2.display(); System.out.println("\n");
        account_3.display(); System.out.println("\n");
        account_4.display(); System.out.println("\n");
    }
}