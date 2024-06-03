package bankaccount;

import bank.CheckingAccount;
import bank.SavingsAccount;

public class BankAccount {

    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount(0.05);
        CheckingAccount checkingAccount = new CheckingAccount(3, 1.0);

//        savingsAccount.deposit(1000);
//        System.out.println("Savings Account balance: " + savingsAccount.getBalance());
//        double interestEarned = savingsAccount.calculateInterest();
//        System.out.println("Interest earned: " + interestEarned);

        checkingAccount.deposit(500);
        System.out.println("Checking Account balance: " + checkingAccount.getBalance());
        checkingAccount.withdraw(100);
        System.out.println("Checking Account balance after withdrawal: " + checkingAccount.getBalance());
        checkingAccount.withdraw(100);
        System.out.println("Checking Account balance after withdrawal: " + checkingAccount.getBalance());
        checkingAccount.withdraw(100);
        System.out.println("Checking Account balance after withdrawal: " + checkingAccount.getBalance());
        checkingAccount.withdraw(100); 
        System.out.println("Checking Account balance after withdrawal: " + checkingAccount.getBalance());

    }

}
