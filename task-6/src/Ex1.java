public class Ex1 {
    public static void main(String[] args) {
        // create example data
        BlueCollarWorker blueWorker = new BlueCollarWorker("Blue", "Worker", "00000000000",
                1999, 2010,'m', "H&M", "shop assistant",
                27.70, 25.5);
        WhiteCollarWorker whiteWorker = new WhiteCollarWorker("White", "Worker", "11111111111",
                1995, 2014,'f', "Google", "dev", 9999.99);

        // test toString
        System.out.println("===============TO STRING===============");
        System.out.println(whiteWorker.toString());
        System.out.println(blueWorker.toString());

        // test display
        System.out.println("\n===============DISPLAY===============");
        whiteWorker.display();
        System.out.print("\n");
        blueWorker.display();

        // test calculate
        System.out.println("\n===============GET AGE===============");
        System.out.println("white: " + whiteWorker.getAge());
        System.out.println("blue: " + blueWorker.getAge());

        System.out.println("\n===============JOB SENIORITY===============");
        System.out.println("white: " + whiteWorker.returnJobSeniority());
        System.out.println("blue: " + blueWorker.returnJobSeniority());

        System.out.println("\n===============TIME TO RETIREMENT===============");
        System.out.println("white: " + whiteWorker.calculateTimeToRetirement());
        System.out.println("blue: " + blueWorker.calculateTimeToRetirement());

    }
}