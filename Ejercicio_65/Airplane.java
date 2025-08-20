package Ejercicio_65;

public class Airplane implements Activable {

    public String model;
    public int siteNumber;
    public int maxSpeed;
    public boolean active;

    public Airplane() {

    }

    public Airplane(String model, int siteNumber, int maxSpeed) {
        this.model = model;
        this.siteNumber = siteNumber;
        this.maxSpeed = maxSpeed;
        this.active = false;
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
        return "Airplane [model=" + model + ", siteNumber=" + siteNumber + ", maxSpeed=" + maxSpeed + ", active="
                + active + "]";
    }

    public void isReadyToFly() {
        this.active = true;
    }
}
