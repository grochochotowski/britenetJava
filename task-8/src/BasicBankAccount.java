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

    public void displayAllInfo() {
        System.out.printf(
                "name=" + name + '\n' +
                ", surname='" + surname + '\n' +
                ", accountBalance=" + accountBalance + '\n' +
                ", customerNumberId=" + customerNumberId + '\n');
    }
    public void withdrawAll() {
        this.accountBalance = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public int getCustomerNumberId() {
        return customerNumberId;
    }

    public void setCustomerNumberId(int customerNumberId) {
        this.customerNumberId = customerNumberId;
    }

    @Override
    public String toString() {
        return "BasicBankAccount{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", accountBalance=" + accountBalance +
                ", customerNumberId=" + customerNumberId +
                '}';
    }
}
