public class Ex1 {
    public static void main(String[] args) {
        // create example data
        BlueCollarWorker blueWorker = new BlueCollarWorker("Blue", "Worker", "00000000000",
                1999, 2010,'m', "H&M", "shop assistant",
                27.70, 25.5);
        WhiteCollarWorker whiteWorker = new WhiteCollarWorker("White", "Worker", "11111111111",
                2995, 2014,'f', "Google", "dev", 9999.99);

        // test toString
        System.out.println("===============TO STRING===============");
        System.out.printf("white:\n%s", whiteWorker.toString());
        System.out.printf("\nblue:\n%s", blueWorker.toString());
    }
}