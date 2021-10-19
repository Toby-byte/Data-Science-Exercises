package Booking_system_OOP_master;

public class Band implements BookingObjects {
    private String name;
    private double contractPrice = 100;

    public Band(String name, double contractPrice) {
        this.name = name;
        this.contractPrice = contractPrice;
    }

    @Override
    public String toString() {
        return "Band{" +
                "name='" + name + '\'' +
                ", contractPrice=" + contractPrice +
                '}';
    }
}
