package _04_netflix;

import javax.swing.JOptionPane;

public class NetflixMovieRunner {
public static void main(String[] args) {
	Movie movie = new Movie("Paw Patrol", 1);
	Movie movie1 = new Movie("Sophia the First", 2);
	Movie movie2 = new Movie("Squid Game", 5);
	Movie movie3 = new Movie("Cocomelon", 3);
	Movie movie4 = new Movie("The Batman", 4);
	movie.getTicketPrice();
	NetflixQueue queue = new NetflixQueue();
	queue.addMovie(movie);
	queue.addMovie(movie1);
	queue.addMovie(movie2);
	queue.addMovie(movie3);
	queue.addMovie(movie4);
	queue.sortMoviesByRating();
	queue.printMovies();
	JOptionPane.showMessageDialog(null,"Your best movie is " + queue.getBestMovie());
	JOptionPane.showMessageDialog(null, "Your second best movie is " + queue.getSecondBestMovie());
}
}
