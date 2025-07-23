package Ejercicio_56;


import java.time.LocalDate;
import java.util.ArrayList;

public class Airport {

    public String name;
    public int yearStart;
    public int capacity;

    public Address address;
    public ArrayList<Airplane> airplanes;

    public Airport(){

    }

    public Airport(String name, String country, String street, int number, String city, int yearStart,
            int capacity) {

        this.name = name;
        this.yearStart = yearStart;
        this.capacity = capacity;

        this.address = new Address(country, street, number, city);

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

    public int getYearsOpen(){

        LocalDate today = LocalDate.now();
        int yearToday = today.getYear();
        int yearWorks = yearToday - getYearStart();
        return yearWorks;
    }

    public String toString() {
        return "Aeropuerto [name=" + name + ", country=" + country + ", street=" + street + ", number=" + number
                + ", city=" + city + ", yearStart=" + yearStart + ", capacity=" + capacity + ", getYearsOpen()="
                + getYearsOpen() + "]";
    }

    public Address getAddress(){
        return this.address;
    }

    public Airplane addAirplane(String model, int siteNumber,int maxSpeed){
        
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
}
