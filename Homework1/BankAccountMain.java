package homework1;

import java.util.Scanner;


public class BankAccountMain {
    public static void main(String[] args) {
        boolean quit = false;
        String amount = null;
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        
        do {
            // Print interface
            System.out.println("\n\n                                    *** Welcome to ATM ***");
            System.out.println("*** Choose action by giving desired character as an input ***");
            System.out.println("\n  1. Make Account \n  q: Quit ");

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
                    BankAccount acc = new BankAccount(name, accId, balance);
                    //BankAccount acc = new BankAccount(name, accId, balance);
                    do {
                        try {
                            System.out.println("                        *** Choose action by giving desired character as an input ***");
                            System.out.println();
                            System.out.println("    1. Deposit");
                            System.out.println("    2. Withdraw");
                            System.out.println("    3. Show Account and Balance");
                            System.out.println("    q: Quit");
                            
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
