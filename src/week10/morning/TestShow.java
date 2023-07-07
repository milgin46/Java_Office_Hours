package week10.morning;

import java.util.ArrayList;
import java.util.Arrays;

public class TestShow {
    public static void main(String[] args) {

        /*
            Sample data to use, or use your own

    name - number of seasons - completed - available languages

    the last of us - 1 - false - english, spanish
    game of thrones - 8 - true - english, spanish, german
    family feud - 24 - false - english
    squid game - 1 false - korean, english, french, spanish, german
    you knock on my door(Sen Çal Kapimi) - 2 - true - turkish
         */

        Show lastOfUs = new Show("The Last Of Us", 1, false);
        System.out.println(lastOfUs);
        lastOfUs.audioLanguages.add("English");
        System.out.println(lastOfUs);

        ArrayList<String> gotLangs = new ArrayList<>(Arrays.asList("English", "Spanish", "German"));
        Show got = new Show("Game of Thrones", 8, true, gotLangs);
        System.out.println(got);

//        Show got = new Show("Game of Thrones", 8, true, new ArrayList<>(Arrays.asList("English", "Spanish", "German")));

        ShowTracker account = new ShowTracker("jbond007", "007secretagent", 100);
        account.trackedShows.add(lastOfUs);
        account.trackedShows.add(got);
        account.trackedShows.add(new Show("family feud", 24, false));
        System.out.println(account.filter("English"));

        account.trackShow(new Show("squid game", 1, false, new ArrayList<>(Arrays.asList("Korean", "English", "French", "Spanish", "German"))));
        System.out.println(account.trackedShows);

        System.out.println();
        System.out.println(account);

    }
}
