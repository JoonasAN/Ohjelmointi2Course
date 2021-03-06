import java.util.ArrayList;

public class Plot {
    private String name;
    private String address;
    private double area;
    private Building building;

    public Plot() {
        this.name = null;
        this.address = null;
        this.area = 0;
        this.building = new Building();
    }

    public Plot(String name, String address, double area, Building building) {
        this.name = name;
        this.address = address;
        this.area = area;
        this.building = building;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setBuilding(double area, Resident resident, int rooms) {
        this.building = new Building(area, resident, rooms);
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public double getArea() {
        return this.area;
    }

    public Building getBuilding() {
        return this.building;
    }

    public void printInfo() {
        System.out.println("Name of the Plot:       "+this.name);
        System.out.println("Address:                "+this.address);
        System.out.println("Area of the Plot:       "+this.area);
        this.building.printInfo();
    }

}
