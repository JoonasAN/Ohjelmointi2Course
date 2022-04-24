import java.util.ArrayList;
public class ApartmentHouse extends Building {
    private String type; // for printInfo

    public ApartmentHouse() {
        super();
        this.type = "Apartment House";
    }

    public ApartmentHouse(double area, int rooms, Resident resident) {
        super(area, resident, rooms);
        this.type = "Apartment House";
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public void printInfo() {
        System.out.println("Type:                   " + this.type);
        super.printInfo();
    }
}
