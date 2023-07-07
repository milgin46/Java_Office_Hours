package week14.morning.movie;

import java.util.ArrayList;

public final class Cinema implements PlayMovie{
    /*
    - Create a final class Cinema
        create the following instance variables:
            location, number of theaters, List of Movies
    */

    String location;
    int numberOfTheaters;
    ArrayList<Movie> movies;

    /*
        create a constructor to initialize all the variables
    */

    public Cinema(String location, int numberOfTheaters, ArrayList<Movie> movies) {
        this.location = location;
        this.numberOfTheaters = numberOfTheaters;
        this.movies = new ArrayList<>(movies);
    }
    /*
        implement the PlayMovie & implement the playMovie method to say: "Moving Starting, please grab your popcorn and turn your phones off"
    */

    @Override
    public void playMovie(Movie movie) {
        System.out.println(movie .getTitle() + " starting, please grab your popcorn and turn your phones off");
    }

    /*
        create a method buyTicket(Movie):
            print how much a movie ticket is. The cost is based on the rating of the movie. If it is a 5 the movie costs 25, if it is 3 or 4 it cost 20 and any other rating is 15
    */

    public void buyTicket(Movie movie){
        int cost = 0;
        switch (movie.getRating()){
            case 5:
                cost = 25;
                 break;
            case 3:
            case 4:
                cost = 20;
                break;
            default:
                cost = 15;
        }

        System.out.println(movie.getTitle() + " costs $" + cost);
    }

    /*
        create a toString that will display the information about the Cinema and which Movies are available to watch
     */

    @Override
    public String toString() {
        return "Location: " + location + " has " + numberOfTheaters + " theaters\nMovies available: " + movies;
    }
}
