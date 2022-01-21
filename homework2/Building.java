package homework2;

import java.util.ArrayList;

public class Building {
    private double area;
    private int rooms;
    private ArrayList<Resident> residents;

    public Building(double area, int rooms) {
        this.area = area;
        this.rooms = rooms;
        this.residents = new ArrayList<>();
    }

    public void setResident(String name, String birthDate) {
        this.residents.add(new Resident(name, birthDate));
    }

    public ArrayList<Resident> getResidents() {
        return this.residents;
    }

    public void printInfo() {
        // System.out.println("\n*** BUILDING INFO ***\n");
        System.out.println("Area of house:      " + this.area);
        System.out.println("Number of rooms:    " + this.rooms);
        System.out.print("Residents:");
        for (Resident resident : residents) {
            resident.printInfo();
            System.out.print("          ");
        }
        System.out.println();
    }

}
