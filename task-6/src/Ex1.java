public class Ex1 {
    public static void main(String[] args) {
        // create example data
        WhiteCollarWorker whiteWorker = new WhiteCollarWorker("White", "Worker", "11111111111",
                1995, 2014,'f', "Google", "dev", 9999.99);
        BlueCollarWorker blueWorker = new BlueCollarWorker("Blue", "Worker", "00000000000",
                1999, 2010,'m', "H&M", "shop assistant",
                27.70, 25.5);
        CommissionWorker commWorker = new CommissionWorker("Blue", "Worker", "00000000000",
                1999, 2010,'m', "H&M", "shop assistant");

        // test toString
        System.out.println("\n===============TO STRING===============");
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

        // test children methods
        System.out.println("\n===============CHILDREN METHODS===============");
        System.out.println("white (calculateAnnualSalary): " + whiteWorker.calculateAnnualSalary());
        System.out.println("blue: (calculatePayment): " + blueWorker.calculatePayment());

        // commission worker
        System.out.println("\n===============COMMISSION WORKER===============");
        commWorker.generateSalaries(20);
        System.out.println("total: " + commWorker.calculateTotalIncome());
        System.out.println("average: " + commWorker.calculateAverageSalary());
        System.out.println("bigger than 7000: " + commWorker.findBiggerSalaries(7000));
    }
}