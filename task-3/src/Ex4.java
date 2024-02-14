public class Ex4 {
    public static void main(String[] args) {
        // Create examples
        User user1 = new User("Michal", 29, "michal@mail.com", "123-456-789");
        User user2 = new User("Gabrysia", 17, "gabrysia@mail.com", "987-654-321");

        UserAccount acc1 = new UserAccount(1, "mich", "mich123", user1);
        UserAccount acc2 = new UserAccount(2, "gabi", "gabi123", user2);

        // display test
        acc1.display();
        System.out.print("\n");
        acc2.display();
        System.out.print("\n");

        // password methods tests
        System.out.printf(acc1.remindPassword());
        System.out.print("\n");
        acc1.setPassword("michu321");
        System.out.printf(acc1.remindPassword());
        System.out.print("\n");
        System.out.print(acc1.typePassword("michu123"));
        System.out.print("\n");
        System.out.print(acc2.typePassword("gabi123"));
        System.out.print("\n\n");

        // premium methods test
        acc2.activatePremium();
        acc2.display();
        System.out.print("\n");
        acc2.deactivatePremium();
        acc2.display();
        System.out.print("\n");

        // age method test
        System.out.print(acc1.isOfAge());
        System.out.print("\n");
        System.out.print(acc2.isOfAge());
    }
}
