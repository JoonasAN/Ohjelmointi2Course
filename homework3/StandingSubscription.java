package homework3;

public class StandingSubscription extends Subscription{
    
    private int discount;
    private int rate;

    public StandingSubscription(String journal_name, 
                                String subscriber_name, 
                                String delivery_address,
                                double monthly_price,
                                int discount) {
        super(journal_name, subscriber_name, delivery_address, monthly_price);
        this.rate = 12;
        this.discount = discount;
    }

    // setter
    public void setDiscount(int discount) {
        this.discount = discount;
    }

    // getter
    public int getDiscount() {
        return this.discount;
    }
    public String getType() {
        return "Standing Subscription";
    }


}
