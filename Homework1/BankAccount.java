package homework1;

public class BankAccount {
    private String accountOwner = null;
    private String accountNum = null;
    private double balance = 0.0;

    // Constructor for bank account
    public BankAccount(String name, String accId, double balanceIn){
        this.accountOwner = name;
        this.accountNum = accId;
        this.balance = balanceIn;
    }

    public void getAccount() {
        System.out.println(accountOwner);
        System.out.println(accountNum);
        System.out.println(balance);
    }

    



}
