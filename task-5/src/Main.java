public class Main {
    public static void main(String[] args) {
        // example data
        Employee employee1 = new Employee("Maciej", "Makarewicz", 2000, "web dev", "Poland", "Bialystok", "Sienkiewicza", 10500.50);
        Employee employee2 = new Employee("Karol", "Szycko", 1999, "shop assistant", "Poland", "Bialystok", "Mickiewicza", 5000.20);

        // set static variables
        Employee.setBONUS(555.55);
        Employee.setMinimalPayment(4242.42);
        Employee.setTax(23);

        // display methods
        System.out.println(employee1.toString());
        employee2.displayAllData();
        System.out.print("\nAddress of employee 1:\n");
        employee1.displayAddress();
        System.out.print("\n\n");

        // income methods
        System.out.printf("Annual income of employee 1: %.2f\n", employee1.calculateGrossIncome());
        System.out.printf("6 months income of employee 2: %.2f\n\n", employee2.calculateGrossIncome(6));

        employee1.changeMonthlySalaryGross(200);
        employee2.changeMonthlySalaryGross();
        employee1.displayAllData();
        System.out.print("\n");
        employee2.displayAllData();
        System.out.print("\n");

        System.out.printf("Monthly net income of employee 1: %.2f\n", employee1.calculateMonthlySalaryNet());
        System.out.printf("Annual net income of employee 1: %.2f\n", employee1.calculateNetIncome());
        System.out.printf("6 months net income of employee 2: %.2f\n\n", employee2.calculateNetIncome(6));
    }
}