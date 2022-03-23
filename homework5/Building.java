import java.util.ArrayList;

public class Building {
    private int residences;
    private double area;
    private int rooms;
    private ArrayList<Resident> residents;

    public Building() {
        this.area = 0;
        this.residences = 0;
        this.residents = new ArrayList<>();
        this.rooms = 0;
    }

    public Building(int residences, double area, int rooms, Resident resident) {
        this.area = area;
        this.residences = residences;
        this.rooms = rooms;
        this.residents = new ArrayList<>();
        this.residents.add(resident);
    }

    // public Building(int residences, double area, int rooms, String residentName) {
    //     this.area = area;
    //     this.residences = residences;
    //     this.rooms = rooms;
    //     this.residents = new ArrayList<>();
    //     this.residents.add(new Resident(residentName));
    // }

    public void setArea(double area) {
        this.area = area;
    }

    public void setResidences(int residences) {
        this.residences = residences;
    }

    public void setResident(String name) {
        this.residents.add(new Resident(name));
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public double getArea() {
        return this.area;
    }

    public int getResidences() {
        return this.residences;
    }

    public ArrayList<Resident> getResidents() {
        return this.residents;
    }

    public int getRooms() {
        return this.rooms;
    }
    
    public void printInfo(){
        System.out.println("Number of residences:   "+this.residences);
        System.out.println("Number of rooms:        "+this.rooms);
        System.out.println("Area:                   "+this.area);
        System.out.print("Residents:              ");
        for (Resident resident : residents) {
            resident.printInfo();
            System.out.print("                        ");
        }
    }

}
