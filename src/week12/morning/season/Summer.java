package week12.morning.season;

public class Summer extends Season{
    /*
        Create a class Summer
        child class of Season

        constructor: set values to variables

        methods:
            activity(): Drink Lemonade
     */

    public Summer(double highestAvgTemp, double lowestAvgTemp) {
        super(highestAvgTemp, lowestAvgTemp);
    }

    @Override
    public void activity() {
        System.out.println("Drink Lemonade");
    }
}
