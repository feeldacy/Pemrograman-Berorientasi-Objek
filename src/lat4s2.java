public class lat4s2 {
    public static void main(String[] args) {
        MovieApp movieApp = new MovieApp();

        Film avenger = new Film("Avengers: Endgame", "Action", 180, 50);
        Film joker = new Film("Joker", "Drama", 122, 60);

        movieApp.addFilm(avenger);
        movieApp.addFilm(joker);

        movieApp.displayFilms();

        movieApp.searchFilm("Joker");
        movieApp.searchFilm("Dune");

        movieApp.bookFilm(avenger, 2);
        movieApp.bookFilm(joker, 100);
        movieApp.displayFilms();

        movieApp.searchBooking(376);
        movieApp.searchBooking(000);
    }
}