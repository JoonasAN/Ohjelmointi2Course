package homework2;

public class Plot {

    private String name;
    private double area;
    private String widthCoord;
    private String lenghtCoord;
    private Building building;

    public Plot(String name, double area, String width, String lenght) {
        this.name = name;
        this.area = area;
        this.widthCoord = width;
        this.lenghtCoord = lenght;
        // this.building = new Building(area, rooms, name, birthDate);
    }

    public void setBuilding(double area, int rooms) {
        this.building = new Building(area, rooms);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCoordinates(String widthCoord, String lenghtCoord) {
        this.widthCoord = widthCoord;
        this.lenghtCoord = lenghtCoord;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Building getBuilding() {
        return this.building;
    }

    public String getName() {
        return this.name;
    }

    public String getCoordinates() {
        return this.widthCoord + ", " + this.lenghtCoord;
    }

    public void printInfo() {
        System.out.println("\n\n*** PLOT INFO ***\n");
        System.out.println("Name: " + this.name);
        System.out.println("Area: " + this.area);
        System.out.println("Coordinates: " + this.widthCoord + ", " + this.lenghtCoord);
    }
}
