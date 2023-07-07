package week12.morning.candy;

public class CandyFactory {
    public static void main(String[] args){

        Twix twix = new Twix(2, true);
        System.out.println(twix);
        System.out.println(Candy.largestConsumer);
        System.out.println(Twix.largestConsumer);
        System.out.println(twix.largestConsumer);

        Twix.largestConsumer = "Canada";

        // I am accessing this variables from all the classes just to show they are inherited to all of them
        System.out.println(Candy.largestConsumer);
        System.out.println(Twix.largestConsumer);
        System.out.println(HersheyBar.largestConsumer);
        System.out.println(HersheyKiss.largestConsumer);

        // hq is not accessible in Candy or Twix
//        Candy.hq;
//        Twix.hq;
        System.out.println(HersheyBar.hq);
        System.out.println(HersheyKiss.hq);

        System.out.println();
        HersheyBar.hq = "Virginia";
        System.out.println(HersheyBar.hq);
        System.out.println(HersheyKiss.hq);

        HersheyBar hersheyBar = new HersheyBar(20);
        System.out.println(hersheyBar);

        HersheyKiss hersheyKiss = new HersheyKiss(30);
        System.out.println(hersheyKiss);

    }
}
