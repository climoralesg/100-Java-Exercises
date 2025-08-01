package Ejercicio_61;

public class AirportPrivate extends Airport{
    public int totalMembers;

    public AirportPrivate(int totalMembers) {
        this.totalMembers = totalMembers;
    }

    public AirportPrivate(String name, String country, String street, int number, String city, int yearStart,
            int capacity, int totalMembers) {
        super(name, country, street, number, city, yearStart, capacity);
        this.totalMembers = totalMembers;
    }

    public int getTotalMembers() {
        return totalMembers;
    }

    public void setTotalMembers(int totalMembers) {
        this.totalMembers = totalMembers;
    }

    @Override
    public String toString() {
        return "AirportPrivate [totalMembers=" + totalMembers + "]";
    }

}
