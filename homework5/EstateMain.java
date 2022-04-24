import java.util.ArrayList;
import java.util.Scanner;

public class EstateMain {
    public static void main(String[] args) {
        double area;
        int rooms = 0;
        // private int residences;
        int typeChoice;
        int counter = 0;
        String address;
        String name;
        String plotName = "";
        String choice;
        String plotChoice;
        String residentChoice = "";
        Resident resident = new Resident();
        // String residentName;
        // Plot plot;
        Building building;
        ArrayList<Resident> residents = new ArrayList<Resident>();
        ArrayList<Residence> residences = new ArrayList<Residence>();
        ArrayList<Plot> plots = new ArrayList<Plot>();

        Scanner input = new Scanner(System.in);

        do {
            // residences.clear();
            // residents.clear();
            // plots.clear();
            System.out.println("\nAdd New Plot y/n > ");
            plotChoice = input.nextLine();
            switch (plotChoice) {
                case "y":
                    System.out.print("Give Name of the Plot > ");
                    plotName = input.nextLine();
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
                    while (true) {
                        System.out.print("> ");
                        typeChoice = input.nextInt();
                        input.nextLine(); // clear buffer
        
                        if (typeChoice < 1 || typeChoice > 3) {
                            System.out.println("wrong input, Try again!");
                            continue;
                        } else {
                            break;
                        }
                    }
        
                    // System.out.print("Give number of residence(s) > ");
                    // residences = input.nextInt();
                    // input.nextLine(); // clear buffer
        
                    do {
                        System.out.print("Add new residence? y/n > ");
                        choice = input.nextLine();
                        switch (choice) {
                            case "y":
                                System.out.print("Give number of rooms > ");
                                rooms = input.nextInt();
                                input.nextLine(); // clear buffer
        
                                do {
                                    System.out.print("Give Area of the Residence " + (counter + 1) + " > ");
                                    area = input.nextDouble();
                                    input.nextLine(); // clear buffer
                                    if (area < 0) {
                                        System.out.println("\nArea can't be negative! Try again.");
                                    }
                                } while (area < 0);
                                do {
                                    System.out.print("Add new Resident of Residence y/n? > ");
                                    residentChoice = input.nextLine();
                                    switch (residentChoice) {
                                        case "y":
                                            System.out.print("Give Name > ");
                                            name = input.nextLine();
                                            resident = new Resident(name);
                                            // residents.add(new Resident(name));
                                            break;
        
                                        case "n":
                                            residentChoice = "n";
                                            break;
        
                                        default:
                                            break;
                                    }
                                } while (residentChoice != "n");
                                break;
        
                            case "n":
                                choice = "n";
                                break;
        
                            default:
                                break;
                        }
                    } while (choice != "n");
                    // residences.add(new Residence(area, residents, rooms));
        
                    // System.out.print("Give residents name > ");
                    // residentName = input.nextLine();
        
                    // make building
                    switch (typeChoice) {
                        case 1:
                            building = new ApartmentHouse(area, rooms, resident);
                            plots.add(new Plot(plotName, address, area, building));
                            break;
                        case 2:
                            building = new TerraceHouse(area, rooms, resident);
                            plots.add(new Plot(plotName, address, area, building));
                            break;
                        case 3:
                            building = new DetachedHouse(area, rooms, resident);
                            plots.add(new Plot(plotName, address, area, building));
                            break;
                        default:
                            building = new Building();
                            break;
                    }
        
                    // make plots
                    // plots.add(new Plot(plotName, address, area, building));
                    break;

                case "n":
                    plotChoice = "n";
                    break;
            }

        } while (plotChoice != "n");
        //System.out.println(plots.size());

        for (Plot plot : plots){
            System.out.println();
            plot.printInfo();    
        }
        // plot.getBuilding().printInfo();
        input.close();
    }
}
