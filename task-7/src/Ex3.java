public class Ex3 {
    public static void main(String[] args) {
        // example shapes
        FoodProduct food = new FoodProduct("Banana", 1.99, "2025", "Fruit");
        ElectronicProduct elec = new ElectronicProduct("PC", 1999.99, 24, "HP");
        CosmeticProduct cosm = new CosmeticProduct("Krem", 1.99, "I dont know much about this",
                "Face");

        // test
        System.out.print(food.CalculatePrice() + "\n\n");
        food.display();
        System.out.print("\n\n");

        System.out.print(elec.CalculatePrice() + "\n\n");
        elec.display();
        System.out.print("\n\n");

        System.out.print(cosm.CalculatePrice() + "\n\n");
        cosm.display();
        System.out.print("\n\n");

    }
}