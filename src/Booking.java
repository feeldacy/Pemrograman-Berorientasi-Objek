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

    Film getFilm(){
        return film;
    }

    int getNumberOfTickets(){return numberOfTickets;}

    @Override
    public String toString() {
        return "Film: " + film.getTitle() + "\nJumlah Tiket: " + numberOfTickets + "\nBooking ID: " + bookingID;
    }

}
