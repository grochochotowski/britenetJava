public class BasicBankAccount implements Playable{
    public static int nextCustomerIdAvailable = 5000;

    protected String name;
    protected String surname;
    protected double accountBalance;
    protected int customerNumberId;

    public void incomingMoneyTransfer(double amount) {
        this.accountBalance += amount;
    }
    public boolean outgoingMoneyTransfer(double amount) {
        if(amount > accountBalance) {
            this.accountBalance -= amount;
            return true;
        }
        return false;
    }

    public BasicBankAccount(String name, String surname, double accountBalance, int customerNumberId) {
        this.name = name;
        this.surname = surname;
        this.accountBalance = accountBalance;
        this.customerNumberId = nextCustomerIdAvailable;
        nextCustomerIdAvailable += 2;
    }
}
