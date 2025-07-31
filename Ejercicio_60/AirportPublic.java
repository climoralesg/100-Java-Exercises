package Ejercicio_60;

public class AirportPublic extends Airport{
    
    public boolean publicFinance;
    public int disabledPerson;


    public AirportPublic(boolean publicFinance, int disabledPerson) {

        this.publicFinance = publicFinance;
        this.disabledPerson = disabledPerson;
        
    }
    public AirportPublic(String name, String country, String street, int number, String city, int yearStart,
            int capacity, boolean publicFinance, int disabledPerson) {

        super(name, country, street, number, city, yearStart, capacity);

        this.publicFinance = publicFinance;
        this.disabledPerson = disabledPerson;
    }
    public boolean isPublicFinance() {
        return publicFinance;
    }
    public void setPublicFinance(boolean publicFinance) {
        this.publicFinance = publicFinance;
    }
    public int getDisabledPerson() {
        return disabledPerson;
    }
    public void setDisabledPerson(int disabledPerson) {
        this.disabledPerson = disabledPerson;
    }


    
}
