package Booking_system_OOP_master;

public class ProgramManager implements BookingObjects {
    private String name;
    private String phoneNumber;
    private String email;

    public ProgramManager(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "ProgramManager{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
