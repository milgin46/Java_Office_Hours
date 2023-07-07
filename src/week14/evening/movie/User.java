package week14.evening.movie;

import java.util.ArrayList;
import java.util.Arrays;

public final class User {
    public static void main(String[] args) {

        Movie movie1 = new Movie("Star Wars", 5, 120, 2000);
        Movie movie2 = new Movie("Game Of Thrones", 5, 120, 2006);
        Movie movie3 = new Movie("The Matrix 1", 5, 100, 2003);
        Movie movie4 = new Movie("The Matrix 2", 4, 90, 2006);
        Movie movie5 = new Movie("The Matrix 3", 3, 145, 2009);
        Movie movie6 = new Movie("Jams Bond", 5, 105, 2012);
        Movie movie7 = new Movie("Joh Wick", 4, 125, 2015);
        Movie movie8 = new Movie("Winter See", 4, 180, 2014);
        ArrayList<Movie> cinemaMovies = new ArrayList<>(Arrays.asList(movie3, movie1, movie5, movie6));
        Cinema cinema = new Cinema("NY", 3, cinemaMovies);

        Netflix netflix = new Netflix("netflix.com", 19.99, 4);
        Amazon amazon = new Amazon("amazon.com", 25.99, 7);
        Hulu hulu = new Hulu("hulu.com", 34.5, 8);
        ArrayList<PlayMovie> streamingSites = new ArrayList<>();
        streamingSites.add(netflix);
        streamingSites.add(amazon);
        streamingSites.add(hulu);
        /// streamingSites.add(cinema); no we can not use StreamingSite
        streamingSites.add(cinema); // we can use with PlayMovie

        //print the cinema movies
        for (PlayMovie each : streamingSites) {
            if (each instanceof Cinema)
                System.out.println(((Cinema) each).movies);

        }

        //print the number of available movies in netflix

        for (PlayMovie each : streamingSites) {
            if (each instanceof Netflix) {
                System.out.println(((Netflix) each).numberOfAvailableMovies);
            }
        }
        //print the minimum  subscription amount in streamingSites url //netflix.com
        //extra added maximum one
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        String urlMin = "";
        String urlMax = "";
        for (PlayMovie each : streamingSites) {
            if ((each instanceof Cinema))
                continue;
            double temp = ((StreamingSite) each).subscriptionAmount;
            if (temp < min) {
                min = temp;
                urlMin = ((StreamingSite) each).url;
            }
            if (temp > max) {
                max = temp;
                urlMax = ((StreamingSite) each).url;
            }
        }
        System.out.println("url for minimum cost is : " + urlMin + " - cost is " + min);
        System.out.println("url for maximum cost is : " + urlMax + " - cost is " + max);
    }
}


