import java.util.ArrayList;

public class MovieApp {

    ArrayList<Film> films;
    ArrayList<Booking> bookings;

    MovieApp() {
        films = new ArrayList<>();
        bookings = new ArrayList<>();
    }

    void addFilm(Film film) {
        films.add(film);
    }

    void displayFilms() {
        System.out.println("List of Films");
        for (Film film : films) {
            System.out.println(film.displayFilmDetails());
        }
    }

    Film searchFilm(String title) {
        for (Film film : films) {
            if (film.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Film Tersedia");
                return film;
            }
        }
        System.out.println("Film Tidak Tersedia");
        return  null;
    }

    Booking searchBooking(int bookingID) {
        for (Booking booking : bookings) {
            if (booking.getBookingID() == bookingID) {
                return booking;
            }
        }
        System.out.println("Pesanan Tidak Ditemukan");
        return null;
    }

    void bookFilm(Film film, int numberOfTickets) {
        if (film.getAvailableSeats() >= numberOfTickets) {
            Booking booking = new Booking(film, numberOfTickets);
            bookings.add(booking);
            film.bookFilm(numberOfTickets);
            System.out.println("Pesanan berhasil dengan detail pesanan: \n" + booking.displayBookingDetails());
        } else {
            System.out.println("Pesanan tidak dapat diproses. Kursi tidak tersedia.");
        }
    }
}
