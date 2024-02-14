public class Ex4 {
    public static void main(String[] args) {
        // Create examples
        User user1 = new User("Michal", 29, "michal@mail.com", "123-456-789");
        User user2 = new User("Gabrysia", 25, "gabrysia@mail.com", "987-654-321");

        UserAccount acc1 = new UserAccount(1, "mich", "mich123", user1);
        UserAccount acc2 = new UserAccount(2, "gabi", "gabi123", user2);
    }
}
