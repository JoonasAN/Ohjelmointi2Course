import java.util.Scanner;

public class EstateMain {
    public static void main(String[] args) {
        double area;
        int rooms;
        int residences;
        int typeChoice;
        String address;
        String name;
        String choice;
        String residentName;
        Plot plot;
        Building building;

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Add Plot ***");
        System.out.print("Give Name of the Plot > ");
        name = input.nextLine();

        do {
            System.out.print("Give Area of the plot > ");
            area = input.nextDouble();
            input.nextLine(); // clear buffer
            if (area < 0) {
                System.out.println("\nArea can't be negative! Try again.");
            }
        } while (area < 0);

        System.out.print("Give address > ");
        address = input.nextLine();

        System.out.println("\n *** Add Building ***");

        System.out.println("Give type of Building: ");
        System.out.println("Apartment House:    1");
        System.out.println("Terraced House:     2");
        System.out.println("Detached House:     3");
        while(true){
            System.out.print("> ");
            typeChoice = input.nextInt();
            input.nextLine(); // clear buffer

            if (typeChoice < 1 || typeChoice > 3){
                System.out.println("wrong input, Try again!");
                continue;
            }
            else{
                break;
            }
        }

        do {
            System.out.print("Give Area of the Building > ");
            area = input.nextDouble();
            input.nextLine(); // clear buffer
            if (area < 0) {
                System.out.println("\nArea can't be negative! Try again.");
            }
        } while (area < 0);

        System.out.print("Give number of residences > ");
        residences = input.nextInt();
        input.nextLine(); // clear buffer

        System.out.print("Give number of rooms > ");
        rooms = input.nextInt();
        input.nextLine(); // clear buffer



        System.out.print("Give residents name > ");
        residentName = input.nextLine();

        // make building
        switch (typeChoice) {
            case 1:
                building = new ApartmentHouse(residences, area, rooms, new Resident(residentName));
                break;
            case 2:
                building = new TerraceHouse(residences, area, rooms, new Resident(residentName));
                break;
            case 3:
                building = new DetachedHouse(residences, area, rooms, new Resident(residentName));
                break;
            default:
                building = new Building();
                break;
        }
        
        // make plot and add one resident
        plot = new Plot(name, address, area, building);

        // next we ask resident info from user until enough
        do {
            System.out.print("Add new Resident y/n? > ");
            choice = input.nextLine();
            switch (choice) {
                case "y":
                    System.out.print("Give Name > ");
                    name = input.nextLine();
                    plot.getBuilding().setResident(name);
                    break;

                case "n":
                    choice = "n";
                    break;

                default:
                    break;
            }
        } while (choice != "n");

        plot.printInfo();
        //plot.getBuilding().printInfo();
        input.close();
    }
}
