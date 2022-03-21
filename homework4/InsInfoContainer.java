
import java.util.ArrayList;

public class InsInfoContainer {

    private ArrayList<InsuranceInfo> insuranceList;
    
    public InsInfoContainer(){
        this.insuranceList = new ArrayList<>();
    }
    
    public void addInfo(InsuranceInfo info) {
        this.insuranceList.add(info);
    }

    public void printAll() {
        for (InsuranceInfo info : this.insuranceList) {
            System.out.println("Property type:      "+info.getProperty().getType());
            System.out.println("Property Location:  "+info.getProperty().getLocation());
            System.out.println("Insurance Value:    "+info.getInsuranceValue());
            System.out.println();
        }
    }

    public void printGreaterProperties(double limit) {
        for (InsuranceInfo info : this.insuranceList) {
            if (info.getInsuranceValue() > limit) {
                System.out.println("Property type:      "+info.getProperty().getType());
                System.out.println("Property Location:  "+info.getProperty().getLocation());
                System.out.println("Insurance Value:    "+info.getInsuranceValue());
                System.out.println("Limit:              "+limit);
                System.out.println();
            }
        }
    }

    public void printLesserProperties(double limit) {
        for (InsuranceInfo info : this.insuranceList) {
            if (info.getInsuranceValue() < limit) {
                System.out.println("Property type:      "+info.getProperty().getType());
                System.out.println("Property Location:  "+info.getProperty().getLocation());
                System.out.println("Insurance Value:    "+info.getInsuranceValue());
                System.out.println("Limit:              "+limit);
                System.out.println();
            }
        }
    }

}
