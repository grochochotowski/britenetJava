public class SavingBankAccount extends BasicBankAccount{
    private double savingBalance;

    public SavingBankAccount(String name, String surname, double accountBalance, int customerNumberId, double savingBalance) {
        super(name, surname, accountBalance, customerNumberId);
        this.savingBalance = savingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    @Override
    public boolean outgoingMoneyTransfer(double amount) {
        if(amount > accountBalance) {
            this.accountBalance -= amount;
            return true;
        }
        else if (amount > accountBalance + savingBalance) {
            this.savingBalance -= accountBalance;
            this.accountBalance = 0;
            return true;
        }
        return false;
    }

    @Override
    public void displayAllInfo() {
        super.displayAllInfo();
        System.out.printf("savingBalance=" + savingBalance + '\n');
    }
}
