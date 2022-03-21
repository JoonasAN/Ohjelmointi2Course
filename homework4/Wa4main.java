
import java.util.Scanner;

public class Wa4main {
    public static void main(String[] args) {

        int choice;
        String type;
        String location;
        double insuranceValue;
        double limit;
        InsInfoContainer properties = new InsInfoContainer();

        try (Scanner input = new Scanner(System.in)) {
            do{
                System.out.println("Add new property:                           1");
                System.out.println("Print all properties:                       2");
                System.out.println("Print properties greater than Given limit:  3");
                System.out.println("Print properties lesser than Given limit:   4");
                System.out.println("Quit:                                       5");
                
                choice = input.nextInt();
                input.nextLine(); // clear buffer
            

                switch (choice) {
                    case 1:
                        System.out.println("Add new property:\n");
                        System.out.print("Give Type of Property > ");
                        type = input.nextLine();

                        System.out.print("Give Location of Property > ");
                        location = input.nextLine();

                        System.out.print("Give insurance value of Property > ");
                        insuranceValue = input.nextDouble();
                        input.nextLine(); // clear buffer

                        properties.addInfo((new InsuranceInfo( (new Property(type, location)) , insuranceValue)));
                        break;
                    case 2:
                        System.out.println("Print all properties:\n");
                        properties.printAll();
                        break;
                    case 3:
                        System.out.println("Print properties greater than Given limit:\n");
                        System.out.print("Give limit > ");
                        limit = input.nextDouble();
                        input.nextLine(); // clear buffer
                        properties.printGreaterProperties(limit);
                        break;
                    case 4:
                        System.out.println("Print properties lesser than Given limit:\n");
                        System.out.print("Give limit > ");
                        limit = input.nextDouble();
                        input.nextLine(); // clear buffer
                        properties.printLesserProperties(limit);
                        break;
                    case 5:
                    System.out.println("Quitting...");
                        break;
                    default:
                        System.out.println("Wrong input - try again!");
                        break;
                }
            } while(choice != 5);
        }
    }
}
