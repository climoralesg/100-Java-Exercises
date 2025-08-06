package Ejercicio_64;

public class Airplane {

    public String model;
    public int siteNumber;
    public int maxSpeed;

    public Airplane() {

    }

    public Airplane(String model, int siteNumber, int maxSpeed) {
        this.model = model;
        this.siteNumber = siteNumber;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSiteNumber() {
        return siteNumber;
    }

    public void setSiteNumber(int siteNumber) {
        this.siteNumber = siteNumber;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String toString() {
        return "Avion [model=" + model + ", siteNumber=" + siteNumber + ", maxSpeed=" + maxSpeed + "]";
    }
}
