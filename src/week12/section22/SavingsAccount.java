package week12.section22;

public class SavingsAccount extends  BankAccount{

    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate){
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void calculateInterest(){
        double interest = balance * interestRate / 100;
        deposit(interest);
    }
}
