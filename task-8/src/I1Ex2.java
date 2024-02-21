public class I1Ex2 {
    public static void greet(Language... languages) {
        for (Language l : languages) {
            System.out.println(l.sayGreeting());
        }
    }
    public static void main(String[] args) {
        greet(new English(), new Spanish(), new Japanese(), new Polish());
    }
}