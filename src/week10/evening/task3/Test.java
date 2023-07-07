package week10.evening.task3;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Show lou=new Show("the last of us",1,false,new ArrayList<>(Arrays.asList("english","spanish")));
        Show got=new Show("game of thrones",8,true,new ArrayList<>(Arrays.asList("english","spanish","german")));

        ShowTracker showTracker=new ShowTracker("Adam","123",3,new ArrayList<>(Arrays.asList(lou,got)));

      //  System.out.println(showTracker);
        System.out.println(showTracker.trackedShows);
        Show ff=new Show("family feud",24,false,new ArrayList<>(Arrays.asList("englsh")));
        System.out.println("====after adding a new show===");
        showTracker.trackShow(ff);
        System.out.println(showTracker.trackedShows);
        System.out.println("==========get the completed shows=========");
        System.out.println(showTracker.filterBy(true));
        System.out.println("=====get the tracked shows which has an English language=====");
        System.out.println(showTracker.filterBy("english"));

    }
}
