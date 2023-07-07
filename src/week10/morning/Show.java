package week10.morning;

import java.util.ArrayList;

public class Show {

    /*
        Create a class Show
        define these instance variables
            name
            number seasons
            boolean completed
                true - finished
                false - ongoing
            audio languages available (String ArrayList)
     */
    String name;
    int numberOfSeasons;
    boolean isCompleted;
    ArrayList<String> audioLanguages;

    /*
    create a constructor that will initialize the name and number of seasons, completed
    create a constructor that will initialize the name, number of seasons, completed, & all the available languages
     */

    public Show(String name, int numberOfSeasons, boolean isCompleted) {
        this.name = name;
        this.numberOfSeasons = numberOfSeasons;
        this.isCompleted = isCompleted;
        audioLanguages = new ArrayList<>();
    }

    public Show(String name, int numberOfSeasons, boolean isCompleted, ArrayList<String> audioLanguages) {
        this(name, numberOfSeasons, isCompleted);
        this.audioLanguages.addAll(audioLanguages);
    }

    // create a toString
    public String toString(){
        return name + " - " + numberOfSeasons + " seasons - " + (isCompleted ? "Completed" : "On Going") + " - Available in: " + audioLanguages;
    }

}
