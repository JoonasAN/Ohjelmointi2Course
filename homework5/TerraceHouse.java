import java.util.ArrayList;

public class TerraceHouse extends Building {
    private String type; // for printInfo

    public TerraceHouse() {
        super();
        this.type = "Terraced House";
    }

    public TerraceHouse(double area, int rooms,Resident resident) {
        super(area, resident, rooms);
        this.type = "Terraced House";
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
