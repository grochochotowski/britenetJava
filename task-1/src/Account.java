public class Account {
    // Variables
    private String name;
    private String surname;
    private double balance;
    private String accountNumber;

    // Constructors
    public Account() { }
    public Account(String name, String surname, double balance, String accountNumber) {
        this.name = name;
        this.surname = surname;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    // Getters
    public String getName() { return name; }
    public String getSurname() { return surname; }
    public double getBalance() { return balance; }
    public String getAccountNumber() { return accountNumber; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setSurname(String surname) { this.surname = surname; }
    public void setBalance(double balance) { this.balance = balance; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }

    // Other methods
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", balance='" + balance + '\'' +
                ", accountNumber=" + accountNumber +
                '}';
    }

    public String display() {

    }

    public void increaseBalance (double amountToIncrease) {

    }
    public void decreaseBalance (double amountToDecrease) {

    }
    public void withdrawAll () {

    }
}
