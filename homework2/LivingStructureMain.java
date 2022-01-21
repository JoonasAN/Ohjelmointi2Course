package homework2;

import java.util.Scanner;

public class LivingStructureMain {
    public static void main(String[] args) {
        double area;
        int rooms;
        String widthCoord;
        String lengthCoord;
        String name;
        String birthDate;
        String choice;
        Plot plot;

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

        System.out.print("Give width coordinate > ");
        widthCoord = input.nextLine();

        System.out.print("Give length coordinate > ");
        lengthCoord = input.nextLine();

        plot = new Plot(name, area, widthCoord, lengthCoord);

        System.out.println("\n *** Add House ***");

        do {
            System.out.print("Give Area > ");
            area = input.nextDouble();
            input.nextLine(); // clear buffer
            if (area < 0) {
                System.out.println("\nArea can't be negative! Try again.");
            }
        } while (area < 0);

        System.out.print("Give number of rooms > ");
        rooms = input.nextInt();
        input.nextLine(); // clear buffer

        // constructor for building
        plot.setBuilding(area, rooms);

        // next we ask resident info from user until enough
        do {
            System.out.print("Add new Resident y/n? > ");
            choice = input.nextLine();
            switch (choice) {
                case "y":
                    System.out.print("Give Name > ");
                    name = input.nextLine();

                    System.out.print("Give Birth Date > ");
                    birthDate = input.nextLine();
                    plot.getBuilding().setResident(name, birthDate);
                    break;

                case "n":
                    choice = "n";
                    break;

                default:
                    break;
            }
        } while (choice != "n");

        plot.printInfo();
        plot.getBuilding().printInfo();
        input.close();
    }

}
