package week10.evening.task3;

import java.util.ArrayList;
import java.util.List;

public class Show {
    public String name;
    public int numberOfSeason;
    public boolean isCompleted;
    public ArrayList<String> availableLanguages;

    public Show(String name, int numberOfSeason, boolean isCompleted) {
        this.name = name;
        this.numberOfSeason = numberOfSeason;
        this.isCompleted = isCompleted;
    }

    public Show(String name, int numberOfSeason, boolean isCompleted, ArrayList<String> availableLanguages) {
      /*  this.name = name;
        this.numberOfSeason = numberOfSeason;
        this.isCompleted = isCompleted;

       */
        this(name, numberOfSeason, isCompleted); //calling constractor
        this.availableLanguages = availableLanguages;
    }

    @Override
    public String toString() {
        return "Show{" +
                "name='" + name + '\'' +
                ", numberOfSeason=" + numberOfSeason +
                ", isCompleted=" + isCompleted +
                ", availableLanguages=" + availableLanguages +
                '}';
    }
}
