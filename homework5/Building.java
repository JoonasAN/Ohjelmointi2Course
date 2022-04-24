import java.util.ArrayList;

public class Building {
    private ArrayList<Residence> residences;
    // private int numResidences;
    // private double area;
    // private int rooms;
    // private ArrayList<Resident> residents;

    public Building() {
        this.residences = new ArrayList<Residence>();
    }

    public Building(double area, Resident resident, int rooms) {
        this.residences = new ArrayList<Residence>();
        this.residences.add(new Residence(area, resident, rooms));
    }

    public void setResidences(ArrayList<Residence> residences) {
        this.residences = residences;
    }

    public ArrayList<Residence> getResidences() {
        return this.residences;
    }
    
    public void printInfo(){
        System.out.println("Number of residences:   "+this.residences.size());

        for (int index = 0; index < residences.size(); index++) {
            System.out.println("Area:                   "+residences.get(index).getArea());
            System.out.println("Number of rooms:        "+residences.get(index).getRooms());
            System.out.print("Residents:              ");
            for (Resident resident : residences.get(index).getResidents()) {
                resident.printInfo();
                System.out.print("                        ");
            }
        }
        
    }
}
