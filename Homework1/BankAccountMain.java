package homework1;

import java.util.Scanner;
//import homework1.BankAccount.*;


public class BankAccountMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Full name: ");
        String name = input.nextLine();

        System.out.print("Account Number: ");
        String accId = input.nextLine();

        System.out.print("Balance: ");
        double balance = input.nextDouble();

        BankAccount acc = new BankAccount(name, accId, balance);
        
        acc.getAccount();

        input.close();
    }
    
}
