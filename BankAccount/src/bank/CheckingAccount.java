package bank;

public class CheckingAccount extends BankAccount{

    private int withdrawalLimit;
    private double withdrawalFee;

    public CheckingAccount() {
    }

    public CheckingAccount(int withdrawalLimit, double withdrawalFee) {
        this.withdrawalLimit = withdrawalLimit;
        this.withdrawalFee = withdrawalFee;
    }

    public CheckingAccount(int withdrawalLimit, double withdrawalFee, double balance) {
        super(balance);
        this.withdrawalLimit = withdrawalLimit;
        this.withdrawalFee = withdrawalFee;
    }
    
    @Override
    public void deposit(double amount) {
        balance += amount;
    }
    
    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            if (withdrawalLimit > 0) {
                balance -= amount;

            } else {
                balance -= (amount + withdrawalFee);
            }
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    @Override
    public double calculateInterest() {
        return 0;
    }
    
    
    
}
