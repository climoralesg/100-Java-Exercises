package Ejercicio_63;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Airport {

    protected static int id = 0;
    protected String name;
    protected int yearStart;
    protected int capacity;

    private Address address;
    private ArrayList<Airplane> airplanes;

    public Airport() {

    }

    public Airport(String name, String country, String street, int number, String city, int yearStart,
            int capacity) {

        this.name = name;
        this.yearStart = yearStart;
        this.capacity = capacity;

        this.address = new Address(country, street, number, city);

        this.id++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getYearStart() {
        return yearStart;
    }

    public void setYearStart(int yearStart) {
        this.yearStart = yearStart;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getYearsOpen() {

        LocalDate today = LocalDate.now();
        int yearToday = today.getYear();
        int yearWorks = yearToday - getYearStart();
        return yearWorks;
    }

    public Address getAddress() {
        return this.address;
    }

    public Airplane addAirplane(String model, int siteNumber, int maxSpeed) {

        Airplane airplane = new Airplane(model, siteNumber, maxSpeed);
        this.airplanes.add(airplane);
        return airplane;
    }

    public ArrayList<Airplane> getAirplanes() {
        return airplanes;
    }

    public void setAirplanes(ArrayList<Airplane> airplanes) {
        this.airplanes = airplanes;
    }

    public static int getId() {
        return id;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Airport [name=" + name + ", yearStart=" + yearStart + ", capacity=" + capacity + ", address=" + address
                + ", airplanes=" + airplanes + "]";
    }

    public abstract boolean compareTo(Airport airport);

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Airport other = (Airport) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!this.name.equals(other.name))
            return false;
        if (this.yearStart != other.yearStart)
            return false;
        return true;
    }

}
