public class Ex3 {
    public static void main(String[] args) {
        // example shapes
        FoodProduct food = new FoodProduct("Banan", 1.99, "2025", "Owoc");
        ElectronicProduct elec = new ElectronicProduct("PC", 1999.99, 24, "HP");
        CosmeticProduct cosm = new CosmeticProduct("Krem", 1.99, "Mleko i cos - nie wiem, nie znam sie",
                "Twarz");

        // test
        System.out.println(food.CalculatePrice());
        food.display();
        System.out.print("\n");

        System.out.println(elec.CalculatePrice());
        elec.display();
        System.out.print("\n");

        System.out.println(cosm.CalculatePrice());
        cosm.display();
        System.out.print("\n");

    }
}