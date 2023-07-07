package week12.morning.season;

public class Spring extends Season{
    /*
        Create a class Spring
        child class of Season

        constructor: set values to variables

        methods:
            activity(): Go Outside
     */

    public Spring(double highestAvgTemp, double lowestAvgTemp) {
        super(highestAvgTemp, lowestAvgTemp);
    }

    @Override
    public void activity() {
        System.out.println("Go Outside");
    }
}
