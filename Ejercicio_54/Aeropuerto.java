package Ejercicio_54;


import java.time.LocalDate;
public class Aeropuerto {

    public String name;
    public String country;
    public String street;
    public int number;
    public String city;
    public int yearStart;
    public int capacity;

    public Aeropuerto(){

    }

    public Aeropuerto(String name, String country, String street, int number, String city, int yearStart,
            int capacity) {
        this.name = name;
        this.country = country;
        this.street = street;
        this.number = number;
        this.city = city;
        this.yearStart = yearStart;
        this.capacity = capacity;
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

}
