package Ejercicio_57;

public class Address {
    public String country;
    public String street;
    public int number;
    public String city;


    public Address(String country, String street, int number, String city){
        this.country = country;
        this.street = street;
        this.number = number;
        this.city = city;

    }

    public Address(){
        
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

    @Override
    public String toString() {
        return "Address [country=" + country + ", street=" + street + ", number=" + number + ", city=" + city + "]";
    }

    


}
