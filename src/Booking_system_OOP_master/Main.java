package Booking_system_OOP_master;

public class Main {
    public static void main(String[] args) {
        // laver et object som er ProgramManager
        ProgramManager programManager = new ProgramManager("Frank","45236789","FrankIsCool@gmail.com");
        // laver nogle band objekter
        Band coolGuys64 = new Band("coolGuys64",5000);
        Band deathGuys666 = new Band("deathGuys666",5000);
        // putter band objekterne ind i et array
        Band[] bandsPlaying = {coolGuys64,deathGuys666};
        // laver så et event objekt hvor objektet bands playing indgår
        Event event = new Event("frankvej 15","kl 15","kl 18",100,500, bandsPlaying);

        BookingObjects[] bookingInfo = {programManager, event};

        for (BookingObjects programInfo:bookingInfo) {
            System.out.println(programInfo);
        }
    }
}
