package _05_netflix;

public class NetflixRunner {
	public static void main(String[] args) {
		Movie hp = new Movie("Harry Potter and the Philosopher's Stone", 2);
		Movie g = new Movie("How the Grinch Stole Christmas", 3);
		Movie p = new Movie("The Polar Express", 5);
		Movie a = new Movie("Avengers: Endgame", 4);
		Movie d = new Movie("Despicable Me", 1);
		
		System.out.println(g.getTicketPrice());
		
		NetflixQueue n = new NetflixQueue();
		n.addMovie(hp);
		n.addMovie(g);
		n.addMovie(p);
		n.addMovie(a);
		n.addMovie(d);
		
		n.printMovies();
		
		System.out.println("the best movie is " + n.getBestMovie());
		
		System.out.println("the second best movie is " + n.getMovie(1));
		

		
		
	}

}
