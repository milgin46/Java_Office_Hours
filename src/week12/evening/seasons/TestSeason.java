package week12.evening.seasons;

public class TestSeason {
    public static void main(String[] args) {

        Winter winter=new Winter(12,-2);
        winter.activity();

        Summer summer=new Summer(45,25);
       summer.activity();

       Spring spring=new Spring(20,1);
       spring.activity();
    }
}
