package za.ac.cput;

public class Brake {

    private String brakeType;
    private String brakeMake;
    private String brakeColour;

    public Brake() {
    }

    public Brake(String brakeType, String brakeMake, String brakeColour) {
        this.brakeType = brakeType;
        this.brakeMake = brakeMake;
        this.brakeColour = brakeColour;
    }

    public String getBrakeType() {
        return brakeType;
    }

    public void setBrakeType(String brakeType) {
        this.brakeType = brakeType;
    }

    public String getBrakeMake() {
        return brakeMake;
    }

    public void setBrakeMake(String brakeMake) {
        this.brakeMake = brakeMake;
    }

    public String getBrakeColour() {
        return brakeColour;
    }

    public void setBrakeColour(String brakeColour) {
        this.brakeColour = brakeColour;
    }

    @Override
    public String toString() {
        return "Brake{" +
                "brakeType='" + brakeType + '\'' +
                ", brakeMake='" + brakeMake + '\'' +
                ", brakeColour='" + brakeColour + '\'' +
                '}';
    }
}
