package homework2;

import java.util.Scanner;

public class LivingStructureMain {
    public static void main(String[] args) {
        double area;
        int rooms;
        String name;
        String birthDate;
        String choice;

        Scanner input = new Scanner(System.in);

        System.out.println("Add new House?");
        System.out.print("y/n: ");
        
        switch (input.nextLine()) {
            case "y":
                System.out.print("Give Area > ");
                area = input.nextDouble();
                input.nextLine(); // clear buffer

                System.out.print("Give number of rooms > ");
                rooms = input.nextInt();
                input.nextLine(); // clear buffer

                Building home1 = new Building(area, rooms);

                do {
                    System.out.print("Add new Resident y/n? > ");
                    choice = input.nextLine();
                    switch (choice) {
                        case "y":
                            System.out.print("Give Name > ");
                            name = input.nextLine();

                            System.out.print("Give Birth Date > ");
                            birthDate = input.nextLine();

                            home1.setResident(name, birthDate);

                            break;

                        case "n":
                            choice = "n";
                            break;

                        default:
                            continue;
                    }
                } while (choice != "n");
                home1.printBuildingInfo();
                break;

            default:
                break;
        }
        input.close();
    }
}
