public class Film {
    String title;
    String genre;
    int duration;
    int availableSeats;

    Film(String title, String genre, int duration, int availableSeats) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.availableSeats = availableSeats;
    }

    String getTitle(){return title;}
    int getAvailableSeats(){return availableSeats;}

    void bookFilm(int numberOfTickets) {
        if (numberOfTickets <= availableSeats) {
            availableSeats -= numberOfTickets;
        } else {
            System.out.println("Pesanan tidak dapat diproses. Kursi tidak tersedia.");
        }
    }

    public String displayFilmDetails() {
        return title + " - " + genre + " - Duration: " + duration + " mins - Available Seats: " + availableSeats;
    }
}
