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
        ArrayList<Movie> movieListRented = new ArrayList<Movie>();
    }
    void rentMovie(Movie movie){
        movie.movieChangetoTrueStatus();
        movieListRented.add(movie);
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