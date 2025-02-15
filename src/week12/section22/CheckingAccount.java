package week12.section22;

public class CheckingAccount extends BankAccount{

    double overdraftLimit;

    public CheckingAccount(String accountNumber, double balance, double overdraftLimit){
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void withdrawWithOverdraft(double amount){
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Balance for " + getAccountNumber() + " is " + getBalance());
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}
