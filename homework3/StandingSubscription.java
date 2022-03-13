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
        super.setMonthlyPrice( monthly_price - (monthly_price / discount) );
    }

    // setters
    public void setDiscount(int discount) {
        this.discount = discount;
    }

    // getter
    public int getDiscount() {
        return this.discount;
    }
    public int getRate() {
        return this.rate;
    }
    public String getType() {
        return "Standing Subscription";
    }
    public double getOrderPrice() {
        return super.getMonthlyPrice() * 12;
    }

}
