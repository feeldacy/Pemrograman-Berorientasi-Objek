import java.util.Random;

public class Booking {
    int bookingID;
    Film film;
    int numberOfTickets;

    Booking(Film film, int numberOfTickets) {
        this.bookingID = generateBookingID();
        this.film = film;
        this.numberOfTickets = numberOfTickets;
    }

    int generateBookingID(){
        return new Random().nextInt(1000);
    }

    int getBookingID(){
        return bookingID;
    }

    public String displayBookingDetails() {
        return "Film: " + film.getTitle() + "\nJumlah Tiket: " + numberOfTickets + "\nBooking ID: " + bookingID;
    }

}
