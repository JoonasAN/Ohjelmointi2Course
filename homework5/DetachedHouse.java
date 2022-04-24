import java.util.ArrayList;

public class DetachedHouse extends Building {
    private String type; // for printInfo

    public DetachedHouse() {
        super();
        this.type = "Detached House";
    }

    public DetachedHouse(double area, int rooms, Resident resident) {
        super(area, resident, rooms);
        this.type = "Detached House";
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public void printInfo() {
        System.out.println("Type:                   " + this.type);
        super.printInfo();
    }

}
