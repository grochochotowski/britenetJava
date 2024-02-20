public class Ex1 {
    public static void main(String[] args) {
        // example documents
        Invoice invoice = new Invoice("31-02-2024", "Bialystok", "BestCompany", "Adam",
                1, 99.99 );
        EmploymentContract contract = new EmploymentContract ("03-02-2024", "Warszawa", "iDontKnow",
                "Adam", 40000, "01-01-2024", "02-03-2024" );

        // test
        invoice.displayContractors();
        System.out.print("\n");
        contract.displayBasicData();
        System.out.print("\n");
        invoice.displayDetailedData();
        System.out.print("\n");
        System.out.println(contract.returnDocumentType());
        System.out.print("\n");
        invoice.Sign();
        System.out.print("\n");
        invoice.displayBasicData();
        System.out.print("\n");
        contract.isSalaryGreater(3000);
    }
}