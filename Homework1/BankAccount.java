package homework1;

public class BankAccount {
    private String accountOwner;
    private String accountNum;
    private double balance;

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
