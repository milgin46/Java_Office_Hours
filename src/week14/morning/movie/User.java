package week14.morning.movie;

import java.util.ArrayList;
import java.util.Arrays;

public final class User {
    public static void main(String[] args) {

        // create a main method and create Movie, Cinema, Netflix, Amazon, & Hulu objects
        ArrayList<Movie> movies = new ArrayList<>(Arrays.asList(
                new Movie("Avengers End Game", 5, 120, 2020),
                new Movie("Guardians of the Galaxy", 4, 125, 2023),
                new Movie("Avatar 2", 3, 140, 2023)
        ));

        Cinema cinema = new Cinema("Chicago", 13, movies);
        System.out.println(cinema);

        Netflix netflixUS = new Netflix("us", 15, 250);
        Netflix netflixCA = new Netflix("ca", 17, 120);
        System.out.println(netflixUS);
        System.out.println(netflixCA);

        Amazon amazon = new Amazon(20, 100);
        System.out.println(amazon);

        System.out.println("===========================");

        ArrayList<StreamingSite> streamingSites = new ArrayList<>(Arrays.asList(
                netflixCA, netflixUS, amazon,
                new Netflix("jp", 25, 300),
                new Amazon(10, 50)
                // hulu objects
        ));

        for(StreamingSite each : streamingSites){
            each.subscribe();
        }

        System.out.println("===========================");

        ArrayList<PlayMovie> allMovies = new ArrayList<>(Arrays.asList(
                cinema,  netflixCA, netflixUS, amazon,
                new Netflix("uk", 13, 150),
                new Amazon(10, 50)
                // anything that implements PlayMovie
        ));

        //ArrayList<PlayMovie> allMovies2 = new ArrayList<>(streamingSites);

        for(PlayMovie each : allMovies){
            each.playMovie(new Movie("Batman", 5, 135, 2015));
        }

        System.out.println("===========================");

        for(PlayMovie each : allMovies){
          if(each instanceof StreamingSite){
              ((StreamingSite)each).pause();
          }
        }

    }
}
