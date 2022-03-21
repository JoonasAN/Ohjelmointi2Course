
public class InsuranceInfo {
    private Property property;
    private double insuranceValue;
    
    public InsuranceInfo(Property property, double insuranceValue){
        this.property = property;
        this.insuranceValue = insuranceValue;
    }

    public void setInsuranceValue(double insuranceValue) {
        this.insuranceValue = insuranceValue;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public double getInsuranceValue() {
        return insuranceValue;
    }

    public Property getProperty() {
        return property;
    }
}
