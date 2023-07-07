package week12.evening.candies;

public class CandyFactory {

    public static void main(String[] args) {

        Take5 take5=new Take5(100,true);
        System.out.println(take5);

        Twix twix=new Twix(1000,false);
        System.out.println(twix);

        System.out.println(Candy.totalNumberOfCandy);

    }
}
