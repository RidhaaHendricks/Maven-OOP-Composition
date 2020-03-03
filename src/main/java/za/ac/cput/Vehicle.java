package za.ac.cput;

/**
 * Hello world!
 * 218120966
 */

public class Vehicle
{

    private String carID;
    private String model;
    private String make;
    private int price;

    public Vehicle() {
    }

    public Vehicle(String carID, String model, String make, int price) {
        this.carID = carID;
        this.model = model;
        this.make = make;
        this.price = price;
    }

    public String getCarID() {
        return carID;
    }

    public void setCarID(String carID) {
        this.carID = carID;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "carID='" + carID + '\'' +
                ", model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", price=" + price +
                '}';
    }
}
