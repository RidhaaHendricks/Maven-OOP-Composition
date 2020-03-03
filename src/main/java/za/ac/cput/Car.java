package za.ac.cput;

public class Car extends Vehicle {

    private String wheels;
    private Engine engine;
    private Brake brake;

    public Car() {
    }

    public Car(String carID, String model, String make, int price, String wheels, Engine engine, Brake brake) {
        super(carID, model, make, price);
        this.wheels = wheels;
        this.engine = engine;
        this.brake = brake;
    }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Brake getBrake() {
        return brake;
    }

    public void setBrake(Brake brake) {
        this.brake = brake;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carID='" + getCarID() + '\'' +
                ", model='" + getModel() + '\'' +
                ", make='" + getMake() + '\'' +
                ", price=" + getPrice() + '\'' +
                "wheels='" + wheels + '\'' +
                ", engine=" + engine + '\'' +
                ", brake=" + brake +
                '}';
    }
}
