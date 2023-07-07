package week10.morning;

import java.util.ArrayList;

public class ShowTracker {

    /*
        define these instance variables:
        username
        password
        number of shows watched
        tracked shows (Show ArrayList)
     */

    String username;
    String password;
    int numberOfShowsWatched;
    ArrayList<Show> trackedShows;

    /*
    create a constructor that will initialize the username and password
    create a constructor that will initialize the username, password & number of shows watched
    create a constructor that will initialize the username, password, number of shows watched & the list of shows
     */

    public ShowTracker(String username, String password) {
        this.username = username;
        this.password = password;
        trackedShows = new ArrayList<>();
    }

    public ShowTracker(String username, String password, int numberOfShowsWatched) {
        this(username, password);
        this.numberOfShowsWatched = numberOfShowsWatched;
    }

    public ShowTracker(String username, String password, int numberOfShowsWatched, ArrayList<Show> trackedShows) {
        this(username, password, numberOfShowsWatched);
        this.trackedShows.addAll(trackedShows);
    }

/*
    create method trackShow(Show)
        this method will accept the name of a show. Check if the show is already tracked and if it is not add it to the list of shows
 */

    public void trackShow(Show show){
        for(Show each : trackedShows){
            if(each.name.equalsIgnoreCase(show.name)){
                return;
            }
        }
        trackedShows.add(show);
    }

    /*
        create a method filter(String)
        return all the shows that are available in the defined language
            ex: filter("english") -> returns all the shows that have English available
     */

    public ArrayList<Show> filter(String lang){
        ArrayList<Show> filtered = new ArrayList<>(trackedShows);
        filtered.removeIf(p -> !p.audioLanguages.contains(lang));
        return filtered;
    }

    /*
        overload the method to accept a boolean argument filter(boolean)
        if the boolean is true return the list of shows that are complete
        if the boolean is false return the list of shows that are ongoing
            ex: filter(true) -> return all the shows that are complete
     */

    public ArrayList<Show> filter(boolean complete){
        ArrayList<Show> filtered = new ArrayList<>(trackedShows);
        filtered.removeIf(p -> p.isCompleted != complete);
        return filtered;
    }

    public String toString(){
        return "Logged into " + username + " | Number of shows tracked: " + numberOfShowsWatched + "\nShows: " + trackedShows;
    }

    // different way to print where shows are all on a different line
//    public String toString(){
//        String showFormat = "\nShows:";
//        for(Show each : trackedShows){
//            showFormat += "\n\t" + each;
//        }
//        return "Logged into " + username + " | Number of shows tracked: " + numberOfShowsWatched + showFormat;
//    }

}
