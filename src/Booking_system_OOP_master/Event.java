package Booking_system_OOP_master;

import java.util.Arrays;

public class Event implements BookingObjects {
public String programAdress;
public String startDateAndTime;
public String endDateAndTime;
private double ticketPrice;
private int numOfTickets;
private Band[] bandsPlaying;

    public Event(String programAdress, String startDateAndTime, String endDateAndTime, double ticketPrice, int numOfTickets, Band[] bandsPlaying) {
        this.programAdress = programAdress;
        this.startDateAndTime = startDateAndTime;
        this.endDateAndTime = endDateAndTime;
        this.ticketPrice = ticketPrice;
        this.numOfTickets = numOfTickets;
        this.bandsPlaying = bandsPlaying;
    }

    @Override
    public String toString() {
        return "Event{" +
                "programAdress='" + programAdress + '\'' +
                ", startDateAndTime='" + startDateAndTime + '\'' +
                ", endDateAndTime='" + endDateAndTime + '\'' +
                ", ticketPrice=" + ticketPrice +
                ", numOfTickets=" + numOfTickets +
                ", bandsPlaying=" + Arrays.toString(bandsPlaying) +
                '}';
    }
}
