package week12.morning.season;

public class CheckSeason {
    public static void main(String[] args) {

        Winter winter = new Winter(35, 0);
        System.out.println(winter);
        winter.activity();

        Summer summer = new Summer(110, 90);
        System.out.println(summer);
        summer.activity();

        Spring spring = new Spring(80, 75);
        System.out.println(spring);
        spring.activity();

        Fall fall = new Fall(70, 40);
        System.out.println(fall);
        fall.activity();

    }
}
