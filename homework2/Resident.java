package homework2;

public class Resident {
    private String name;
    private String birthDate;

    // constructor
    public Resident(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return this.name;
    }

    public String getBirthDate() {
        return this.birthDate;
    }
}
