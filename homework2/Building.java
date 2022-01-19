package homework2;

import java.util.ArrayList;
import java.util.Arrays;


public class Building {
    private double area;
    private int rooms;
    //private Resident [] residents;
    private ArrayList<Resident> residents = new ArrayList<>();

    public Building(double area, int rooms){
        this.area = area;
        this.rooms = rooms;
    }

    public Building(double area, int rooms, String name, String birthDate) {
        this.area = area;
        this.rooms = rooms;
        this.residents.add(new Resident(name , birthDate));
    }

    public void setResident(String name, String birthDate){
        this.residents.add(new Resident(name, birthDate));
    }

    public ArrayList<Resident> getResidents() {
        return this.residents;
    }

    public void printBuildingInfo(){
        System.out.println("\n*** PRINTED INFO ***\n");
        System.out.println("Area:               " + this.area);
        System.out.println("Number of rooms:    " + this.rooms);
        System.out.println("Residents: ");
        for (Resident resident : residents) {
            //System.out.println(resident.getName() + " Birth Date: " + resident.getBirthDate()); 
            resident.printInfo();
            
        }
       
    }


}
