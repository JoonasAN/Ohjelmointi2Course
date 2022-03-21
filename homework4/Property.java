
public class Property {
    private String type;
    private String location;

    public Property(String type, String location){
        this.type = type;
        this.location = location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public String getType() {
        return type;
    }
}
