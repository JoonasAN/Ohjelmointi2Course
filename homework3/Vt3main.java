package homework3;

import java.util.Scanner;

public class Vt3main {
    
    public static void main(String[] args) {
        String journal_name;
        String subscriber_name;
        String delivery_address;
        double monthly_price;
        int rate;
        int discount;

        try (Scanner input = new Scanner(System.in)) {
			System.out.print("Give Name of the journal > ");
			journal_name = input.nextLine();
			System.out.print("Give Name of the subscriber > ");
			subscriber_name = input.nextLine();
			System.out.print("Give delivery address > ");
			delivery_address = input.nextLine();
			System.out.print("Give monthly price > ");
			monthly_price = input.nextDouble();
			input.nextLine(); // clear buffer

			System.out.print("Give rate > ");
			rate = input.nextInt();
			input.nextLine(); // clear buffer

            System.out.print("Give rate > ");
			discount = input.nextInt();
			input.nextLine(); // clear buffer
		}

        RegularSubscription sub1 = new RegularSubscription(journal_name, subscriber_name, delivery_address, monthly_price, rate);
        StandingSubscription sub2 = new StandingSubscription(journal_name, subscriber_name, delivery_address, monthly_price, discount);

        printSubscription(sub1);
        printSubscription(sub2);
        
    }

    static void printSubscription(Subscription subs){
        
        if (subs.getClass().getName() == "homework3.RegularSubscription") {
            System.out.println("Journal Type:       " + ((RegularSubscription)subs).getType() );
            System.out.println("Journal:            " + subs.getJournalName());
            System.out.println("Subscriber:         " + subs.getSubscriberName());
            System.out.println("Address:            " + subs.getDeliveryAddress());
            System.out.println("Price per month:    " + subs.getMonthlyPrice());
            //System.out.println("Class:              " + subs.getClass().getName());
            System.out.println("Rate:               "+ ((RegularSubscription)subs).getRate() );  
        } else{
            System.out.println("Journal Type:       " + ((StandingSubscription)subs).getType() );
            System.out.println("Journal:            " + subs.getJournalName());
            System.out.println("Subscriber:         " + subs.getSubscriberName());
            System.out.println("Address:            " + subs.getDeliveryAddress());
            System.out.println("Price per month:    " + subs.getMonthlyPrice());
            //System.out.println("Class:              " + subs.getClass().getName());
            System.out.println("Discount:               "+ ((StandingSubscription)subs).getDiscount() ); 
        }

    }
}
