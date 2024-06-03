package bank;

public abstract class BankAccount {

    double balance;

    public BankAccount() {
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }
    
    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public abstract double calculateInterest();

    public double getBalance() {
        return balance;
    }
}
