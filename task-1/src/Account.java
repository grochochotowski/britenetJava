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

    public void display() {
        System.out.printf("Name: %s %s\nBalance: %.2fPLN\nAccount number: %s%n",
                            name, surname, balance, accountNumber);
    }

    public void increaseBalance (double amountToIncrease) { setBalance(balance + amountToIncrease); }
    public void decreaseBalance (double amountToDecrease) {
        double tempBalance = getBalance();
        tempBalance -= amountToDecrease;
        if (tempBalance < 0) {
            System.out.printf("ERROR - cannot decrease balance to negative: %.2fPLN for %s %s\n\n", tempBalance, name, surname);
        }
        else setBalance(tempBalance);
    }
    public void withdrawAll () { setBalance(0); }
}
