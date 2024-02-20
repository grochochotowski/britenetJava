public class Ex3 {
    public static void main(String[] args) {
        // example shapes
        FoodProduct food = new FoodProduct("Banana", 1.99, "2025", "Fruit");
        ElectronicProduct elec = new ElectronicProduct("PC", 1999.99, 24, "HP");
        CosmeticProduct cosm = new CosmeticProduct("Krem", 1.99, "I dont know much about this",
                "Face");

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