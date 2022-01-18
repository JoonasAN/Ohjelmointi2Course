package homework1;

public class BankAccount {
    private String accountOwner = null;
    private String accountNum = null;
    private double balance = 0.0;

    // Constructor for bank account
    public BankAccount(String name, String accId, double balanceIn) {
        this.accountOwner = name;
        this.accountNum = accId;
        this.balance = balanceIn;
    }

    public String getAccountNum() {
        //System.out.println("Account Number: " + accountNum);
        return this.accountNum;
    }
    public String getAccountOwner() {
        //System.out.println("Owner: " + accountOwner); 
        return this.accountOwner;
    }
    public Double getAccountBalance() {
        //System.out.println("Balance: " + balance);
        return this.balance;
    }

    // deposits specified amount of balance to account
    public void deposit(double amount) {
        this.balance += amount;
    }

    // withdraw specified amount from account balance
    public void withdraw(double amount) {
        this.balance -= amount;
    }
}
