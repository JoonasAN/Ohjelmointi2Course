package homework3;

public class RegularSubscription extends Subscription {

    private int rate;

    public RegularSubscription(String journal_name, 
                                String subscriber_name, 
                                String delivery_address, 
                                double monthly_price,
                                int rate) {
        super(journal_name, subscriber_name, delivery_address, monthly_price);
        this.rate = rate;
    }

    // setter
    public void setRate(int rate) {
        this.rate = rate;
    }

    // getter
    public int getRate() {
        return this.rate;
    }
    public String getType() {
        return "Regular Subscription";
    }
    
}
