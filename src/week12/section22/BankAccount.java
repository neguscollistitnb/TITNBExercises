package week12.section22;

public class BankAccount {

    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
        System.out.println(" Initial balance for " + getAccountNumber() + " is " + getBalance());
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Top up " + getAccountNumber() + " for " + amount + ". " + getBalance() + " available.");
    }

    public void withdraw(double amount){
        if (balance >= amount){
            balance -= amount;
            System.out.println("Available balance for " + getAccountNumber() + " is " + getBalance());
        }else {
            System.out.println("Insufficient funds");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
