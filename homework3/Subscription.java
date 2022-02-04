package homework3;

public class Subscription {
    private String journal_name;
    private String subscriber_name;
    private String delivery_access;
    private double monthly_price;

    // constructor
    public Subscription(String journal_name, String subscriber_name,
            String delivery_access, double monthly_price) {
        this.journal_name = journal_name;
        this.subscriber_name = subscriber_name;
        this.delivery_access = delivery_access;
        this.monthly_price = monthly_price;
    }

    // Setters
    public void setJournalName(String journal_name) {
        this.journal_name = journal_name;
    }
    public void setSubscriberName(String subscriber_name) {
        this.subscriber_name = subscriber_name;
    }
    public void setDeliveryAccess(String delivery_access) {
        this.delivery_access = delivery_access;
    }
    public void setMonthlyPrice(double monthly_price) {
        this.monthly_price = monthly_price;
    }

    // Getters
    public String getJournalName() {
        return this.journal_name;
    }
    public String getSubscriberName() {
        return this.subscriber_name;
    }
    public String getDeliveryAccess() {
        return this.delivery_access;
    }
    public double getMonthlyPrice() {
        return this.monthly_price;
    }

    
    
}
