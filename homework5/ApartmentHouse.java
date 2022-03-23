public class ApartmentHouse extends Building {
    private String type; // for printInfo

    public ApartmentHouse() {
        super();
        this.type = "Apartment House";
    }

    public ApartmentHouse(int residences, double area, int rooms, Resident resident) {
        super(residences, area, rooms, resident);
        this.type = "Apartment House";
    }

    // public ApartmentHouse(int residences, double area,
    //         Resident resident, int rooms, String residentName) {
    //     super(residences, area, rooms, residentName);
    //     this.type = "Apartment House";
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
