import java.util.ArrayList;

public class Residence {
    private double area;
    private int rooms;
    private ArrayList<Resident> residents;

    public Residence() {
        this.area = 0;
        this.residents = new ArrayList<Resident>();
        this.rooms = 0;
    }

    public Residence(double area, Resident resident, int rooms) {
        this.area = area;
        this.residents = new ArrayList<Resident>();
        this.residents.add(resident);
        this.rooms = rooms;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setResident(Resident resident) {
        this.residents.add(resident);
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public double getArea() {
        return area;
    }

    public ArrayList<Resident> getResidents() {
        return residents;
    }

    public int getRooms() {
        return rooms;
    }

}