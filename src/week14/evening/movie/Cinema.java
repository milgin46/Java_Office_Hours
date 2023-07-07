package week14.evening.movie;

import java.util.ArrayList;

public final class Cinema implements PlayMovie{
    String location;
    int numberOfTheaters;
    ArrayList<Movie> movies;

    public Cinema(String location, int numberOfTheaters, ArrayList<Movie> movies) {
        this.location = location;
        this.numberOfTheaters = numberOfTheaters;
        this.movies = new ArrayList<>(movies);
    }

    @Override
    public void playMovie(Movie movie) {
        System.out.println("Moving Starting, please grab your popcorn and turn your phones off");
    }

    public void buyTicket(Movie movie){
       if (movie.getRate()==5){
           System.out.println(movie.getTitle() +"'s cost is 25" );
       } else if (movie.getRate()==4 || movie.getRate()==3) {
           System.out.println(movie.getTitle() +"'s cost is 20" );
       }else {
           System.out.println(movie.getTitle() +"'s cost is 15" );
       }
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "location='" + location + '\'' +
                ", numberOfTheaters=" + numberOfTheaters +
                ", movies=" + movies +
                '}';
    }
}
