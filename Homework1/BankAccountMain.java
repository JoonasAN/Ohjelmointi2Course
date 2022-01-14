package homework1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//import homework1.BankAccount.*;


public class BankAccountMain {
    public static void main(String[] args) {
        boolean quit = false;
        boolean back = false;
        String amount = null;
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        List<BankAccount> accounts = new ArrayList<>();
        BankAccount acc;
        
        do {
            // Print interface
            System.out.println("\n\n                                    *** Welcome to ATM ***");
            System.out.println("*** Choose action by giving desired character as an input ***");
            System.out.println("\n  1. Make Account \n  2. Login \n  q: Quit ");

            switch (input1.nextLine()) {
                // Make account
                case "1": 
                    System.out.print("Full name: ");
                    String name = input1.nextLine();

                    System.out.print("Account Number: ");
                    String accId = input1.nextLine();

                    System.out.print("Balance: ");
                    double balance = input1.nextDouble();

                    // make object account and add it to list
                    accounts.add(new BankAccount(name, accId, balance));
                    //BankAccount acc = new BankAccount(name, accId, balance);
                    break;

                // Login
                case "2":
                    //System.out.println("\n\n        *** Login ***\n\n");
                    //System.out.print("Give Your Account Number: ");
                    //String checkAcc = input.nextLine();

                    System.out.println("\n\n                            *** Login ***\n\n");
                    System.out.print("Give Your Account Number: ");
                    String checkAcc = input2.nextLine();

                    // iterate through list of accounts anc check
                    for (int i = 0; i < accounts.size(); i++) {
                        // choose account from list
                        acc = accounts.get(i);

                        System.out.println(checkAcc + " = " + acc.getAccountNum());
                        /*
                        if (checkAcc == acc.getAccountNum()) {
                            do {
                                try {
                                    System.out.println("\n  1. Deposit");
                                    System.out.println("    2. Withdraw");
                                    System.out.println("    3. Show Account and Balance");
                                    System.out.println("    b: Back");
                                     
                                    switch (input.nextLine()) {
        
                                        // Deposit
                                        case "1":
                                            System.out.print("Amount to Deposit: ");
                                            try {
                                                amount = input.nextLine();
                                                acc.deposit(amount);
                                            } catch (Exception e) {
                                                System.out.println("Coudn't Deposit that, try again.");
                                            }
                                            break;
        
                                        // Withdraw
                                        case "2":
                                            System.out.print("Amount to Withdraw: ");
                                            try {
                                                amount = input.nextLine();
                                                acc.withdraw(amount);
                                            } catch (Exception e) {
                                                System.out.println("Coudn't Withdraw that, try again.");
                                            }
                                            break;
        
                                        // Print Account
                                        case "3":
                                            System.out.println("Account Number: " + acc.getAccountNum());
                                            System.out.println("Owner: " + acc.getAccountOwner());
                                            System.out.println("Balance: " + acc.getAccountBalance());
                                            break;
        
                                        // Quit
                                        case "q":
                                            quit = true;
                                            break;
                                        default:
                                            System.out.println("Wrong input try Again.");
                                            break;
                                    }
        
                                } catch (Exception e) {
                                    System.out.println("Exception thrown: " + e);
                                }
                            } while (quit == false);
                            input.close();
                            break;

                        }else if (checkAcc == "b"){
                            break;
                        }else{
                            System.out.println("Account Number Doesn't Exist!");
                        }*/
                    }
                    input2.close();
                    break;

                case "q":
                    quit = true;
                    break;
                default:
                    System.out.println("Wrong input try Again.");
                    break;
            }
        } while (quit == false);
        input1.close();
    }
}
