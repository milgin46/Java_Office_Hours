package week10.evening.task3;

import java.util.ArrayList;
import java.util.List;

public class ShowTracker {

    public String username;
    public String password;
    public int numberOfWatchedShows;
    public ArrayList<Show> trackedShows;

    public ShowTracker(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public ShowTracker(String username, String password, int numberOfWatchedShows) {
      this(username, password);
        this.numberOfWatchedShows = numberOfWatchedShows;
    }

    public ShowTracker(String username, String password, int numberOfWatchedShows, ArrayList<Show> trackedShows) {
        this(username, password, numberOfWatchedShows);
        this.trackedShows = trackedShows;
    }

    public void trackShow(Show show){
        boolean isContains=false;
        for (Show trackedShow : trackedShows) {
            if (trackedShow.name.equals(show.name)){
                isContains=true;
                break;
            }
        }
        if (isContains){
            System.out.println("You already tracked : \n"+ show);
        }else {
            trackedShows.add(show);
        }

    }

    public ArrayList<Show> filterBy(String language){
        ArrayList<Show> result=new ArrayList<>();

        for (Show trackedShow : trackedShows) {
            if (trackedShow.availableLanguages.contains(language)){
                result.add(trackedShow);
            }
        }

        return result;

    }

    public ArrayList<Show> filterBy(boolean isCompleted){
        ArrayList<Show> result=new ArrayList<>();

        for (Show trackedShow : trackedShows) {
            if (trackedShow.isCompleted==isCompleted){
                result.add(trackedShow);
            }
        }

        return result;

    }

    @Override
    public String toString() {
        return "ShowTracker{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", numberOfWatchedShows=" + numberOfWatchedShows +
                ", trackedShows=" + trackedShows +
                '}';
    }
}
