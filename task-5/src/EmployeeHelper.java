public class EmployeeHelper {
    public static double calculateYearlySalary(double monthlySalary) {
        return monthlySalary*12;
    }

    public static boolean isEligibleForPromotion(int yearsWorked) {
        return yearsWorked > 5;
    }

    public static String generateEmployeeID(String firstName, String lastName) {
        return firstName.charAt(0) + lastName.substring(0, 3);
    }
}
