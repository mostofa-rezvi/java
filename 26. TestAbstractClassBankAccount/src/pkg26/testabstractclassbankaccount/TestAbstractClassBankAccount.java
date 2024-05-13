package pkg26.testabstractclassbankaccount;

import bankcalculation.BankAccount;
import bankcalculation.CheckingAccount;
import bankcalculation.SavingsAccount;

public class TestAbstractClassBankAccount {

    public static void main(String[] args) {

        
        
        SavingsAccount savingsAccount = new SavingsAccount(0.05);
        CheckingAccount checkingAccount = new CheckingAccount(3, 1.0);
        
        savingsAccount.deposit(1000);
        System.out.println("Savings Account balance: $" + savingsAccount.getBalance());
        double interestEarned = savingsAccount.calculateInterest();
        System.out.println("Interest earned: $" + interestEarned);
        
        
        
        
        checkingAccount.deposit(500);
        System.out.println("Checking Account balance: $" + checkingAccount.getBalance());
        checkingAccount.withdraw(100);
        System.out.println("Checking Account balance after withdrawal: $" + checkingAccount.getBalance());
        checkingAccount.withdraw(100);
        System.out.println("Checking Account balance after withdrawal: $" + checkingAccount.getBalance());
        checkingAccount.withdraw(100);
        System.out.println("Checking Account balance after withdrawal: $" + checkingAccount.getBalance());
        checkingAccount.withdraw(100); // Exceeds withdrawal limit, incurs fee
        System.out.println("Checking Account balance after withdrawal: $" + checkingAccount.getBalance());
        
    }
    
    public static void displayBankAccount(BankAccount account){
        System.out.println("");
        
    }

}