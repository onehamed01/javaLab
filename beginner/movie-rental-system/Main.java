import java.util.ArrayList;

class Movie{
    private String movieTitle;
    private String movieGenre;
    private double moviePrice;
    private boolean movieIsRented;

    Movie(String movieTitle, String movieGenre, double moviePrice){
        this.movieTitle = movieTitle;
        this.movieGenre = movieGenre;
        this.moviePrice = moviePrice;
        this.movieIsRented = false;
    }
    String getMovieTitle(){
        return movieTitle;
    }
    double getMoviePrice(){
        return moviePrice;
    }
    boolean movieChangetoTrueStatus(){
        return movieIsRented = true;
    }
    boolean movieChangetoFalseStatus(){
        return movieIsRented = false;
    }

}

class Customer{
    private String customerName;
    private ArrayList<Movie> movieListRented;

    Customer(String customerName){
        this.customerName = customerName;
        this.movieListRented = new ArrayList<Movie>();
    }
    void rentMovie(Movie movie){
        movie.movieChangetoTrueStatus();
        this.movieListRented.add(movie);
    }
    void returnedMovie(){
        for (Movie movie: movieListRented){
            movie.movieChangetoFalseStatus();
        }
    }
    double calculateTotalPrice(){
        double totalPrice = 0.00;
        for (Movie movie: movieListRented){
            totalPrice += movie.getMoviePrice();
        }
        return totalPrice;
    }
    void showRentedMovies(){
        System.out.println("Customer Name: "+customerName);
        System.out.println("Movie Rented: ");
        for (Movie movie: movieListRented){
            System.out.println(movie.getMovieTitle());
        }
        System.out.println("Total Price: "+ calculateTotalPrice());
    }
}

class Main{
    public static void main(String[] args){
        Movie fury = new Movie("Fury", "Action", 44.00);
        Movie interstellar = new Movie("Interstellar", "Sci-Fi", 49.99);
        Movie inception = new Movie("Inception", "Sci-Fi", 39.50);
        Movie theDarkKnight = new Movie("The Dark Knight", "Action", 55.00);
        Movie pulpFiction = new Movie("Pulp Fiction", "Crime", 29.99);
        Movie spiritedAway = new Movie("Spirited Away", "Animation", 42.00);
        Movie parasite = new Movie("Parasite", "Thriller", 35.00);
        Movie laLaLand = new Movie("La La Land", "Romance", 31.50);
        Movie getOut = new Movie("Get Out", "Horror", 24.99);
        Movie grandBudapest = new Movie("The Grand Budapest Hotel", "Comedy", 38.00);
        Movie gladiator = new Movie("Gladiator", "Drama", 45.00);

        Customer matti = new Customer("Matti");
        matti.rentMovie(fury);
        matti.rentMovie(interstellar);
        matti.rentMovie(getOut);
        matti.rentMovie(pulpFiction);
        matti.showRentedMovies();

    }
}