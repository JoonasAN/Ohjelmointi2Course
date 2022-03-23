public class TerraceHouse extends Building {
    private String type; // for printInfo

    public TerraceHouse() {
        super();
        this.type = "Terraced House";
    }

    public TerraceHouse(int residences, double area,
            int rooms, Resident resident) {
        super(residences, area, rooms, resident);
        this.type = "Terraced House";
    }

    // public TerraceHouse(int residences, double area,
    //         int rooms, Resident resident, String residentName) {
    //     super(residences, area, rooms, residentName);
    //     this.type = "Terraced House";
    // }

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
