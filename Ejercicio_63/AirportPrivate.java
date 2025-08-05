package Ejercicio_63;

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

    @Override
    public boolean compareTo(Airport airport) {
        boolean compareName = name.compareTo(airport.getName()) == 0;

        Integer thisYearStart = Integer.valueOf(yearStart);
        Integer yearStartCompare = Integer.valueOf(airport.getYearStart());

        boolean yearStartEquals = thisYearStart.compareTo(yearStartCompare) == 0;

        boolean resultBoolean = compareName == true && yearStartEquals == true ? true : false;

        return resultBoolean;
    }


}
