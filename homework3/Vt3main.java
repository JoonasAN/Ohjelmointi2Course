package homework3;

import java.util.ArrayList;
import java.util.Scanner;

public class Vt3main {
    
    public static void main(String[] args) {
        String journal_name;
        String subscriber_name;
        String delivery_address;
        double monthly_price;
        int rate;
        int discount;
        int choice;
        int subChoice;
        ArrayList<Subscription> subArr = new ArrayList<Subscription>();

        try (Scanner input = new Scanner(System.in)) {
            while(true) {
                System.out.println();
                System.out.println("Add new Subscription:   1");
                System.out.println("Print Invoice:          2");
                System.out.println("Quit:                   3");
                System.out.print("> ");
                choice = input.nextInt();
                input.nextLine();// clear buffer
                
                if(choice == 1){
                    
                    System.out.println("Regular subscription:   1");
                    System.out.println("Standing subscription:  2");
                    System.out.print("> ");
                    subChoice = input.nextInt();
                    input.nextLine();// clear buffer

                    System.out.print("Give Name of the journal > ");
                    journal_name = input.nextLine();
                    System.out.print("Give Name of the subscriber > ");
                    subscriber_name = input.nextLine();
                    System.out.print("Give delivery address > ");
                    delivery_address = input.nextLine();
                    System.out.print("Give monthly price > ");
                    monthly_price = input.nextDouble();
                    input.nextLine(); // clear buffer
                    
                    while(true){
                        if (subChoice == 1){
                            System.out.print("Give rate > ");
                            rate = input.nextInt();
                            input.nextLine(); // clear buffer
                            subArr.add(new RegularSubscription(journal_name, subscriber_name, delivery_address, monthly_price, rate));
                            // RegularSubscription sub1 = new RegularSubscription(journal_name, subscriber_name, delivery_address, monthly_price, rate);
                            break;
                            
                        }
                        else if(subChoice == 2) {
                            System.out.print("Give discount > ");
                            discount = input.nextInt();
                            input.nextLine(); // clear buffer
                            subArr.add(new StandingSubscription(journal_name, subscriber_name, delivery_address, monthly_price, discount));
                            // StandingSubscription sub2 = new StandingSubscription(journal_name, subscriber_name, delivery_address, monthly_price, discount);
                            break;
                        }
                        else{
                            System.out.println("Wrong input, Try Again!");
                            continue;
                        }
                    }      
                }
                else if(choice == 2){
                    for (Subscription sub : subArr) {
                        printSubscription(sub);
                    }
                    
                }
                else if(choice == 3) {
                    break;
                }
                else{
                    System.out.println("Wrong input, Try Again!");
                    continue;
                }
            }
			
		}
    }

    static void printSubscription(Subscription subs){
        
        if (subs.getClass().getName() == "homework3.RegularSubscription") {
            System.out.println();
            System.out.println("Journal Type:       " + ((RegularSubscription)subs).getType() );
            System.out.println("Journal:            " + subs.getJournalName());
            System.out.println("Subscriber:         " + subs.getSubscriberName());
            System.out.println("Address:            " + subs.getDeliveryAddress());
            System.out.println("Price per month:    " + subs.getMonthlyPrice());
            System.out.println("Rate:               " + ((RegularSubscription)subs).getRate() );  
            System.out.println("Full price:         " + ((RegularSubscription)subs).getOrderPrice() );
        } else{
            System.out.println();
            System.out.println("Journal Type:       " + ((StandingSubscription)subs).getType() );
            System.out.println("Journal:            " + subs.getJournalName());
            System.out.println("Subscriber:         " + subs.getSubscriberName());
            System.out.println("Address:            " + subs.getDeliveryAddress());
            System.out.println("Price per month:    " + subs.getMonthlyPrice());
            System.out.println("Rate:               " + ((StandingSubscription)subs).getRate() ); 
            System.out.println("Discount:           " + ((StandingSubscription)subs).getDiscount() + " %" );
            System.out.println("Full price:         " + ((StandingSubscription)subs).getOrderPrice() );
        }

    }
}
