package homework2;

public class Resident {
    private String name;
    private String birthDate;

    // constructors
    public Resident() {
        this.name = null;
        this.birthDate = null;
    }

    public Resident(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getName() {
        return this.name;
    }

    public String getBirthDate() {
        return this.birthDate;
    }

    public void printInfo() {
        System.out.printf("%-10s, %s \n", this.name, this.birthDate);
    }
}
