package za.ac.cput;

public class Engine {

    private String engineNo;
    private String noCylinder;
    private Boolean turbo;

    public Engine() {
    }

    public Engine(String engineNo, String noCylinder, Boolean turbo) {
        this.engineNo = engineNo;
        this.noCylinder = noCylinder;
        this.turbo = turbo;
    }

    public String getEngineNo() {
        return engineNo;
    }

    public void setEngineNo(String engineNo) {
        this.engineNo = engineNo;
    }

    public String getNoCylinder() {
        return noCylinder;
    }

    public void setNoCylinder(String noCylinder) {
        this.noCylinder = noCylinder;
    }

    public Boolean getTurbo() {
        return turbo;
    }

    public void setTurbo(Boolean turbo) {
        this.turbo = turbo;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "engineNo='" + engineNo + '\'' +
                ", noCylinder='" + noCylinder + '\'' +
                ", turbo=" + turbo +
                '}';
    }
}
