public class DetachedHouse extends Building {
    private String type; // for printInfo

    public DetachedHouse() {
        super();
        this.type = "Detached House";
    }

    public DetachedHouse(int residences, double area,
            int rooms, Resident resident) {
        super(residences, area, rooms, resident);
        this.type = "Detached House";
    }

    // public DetachedHouse(int residences, double area,
    //         int rooms, Resident resident, String residentName) {
    //     super(residences, area, rooms, residentName);
    //     this.type = "Detached House";
    // }

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
