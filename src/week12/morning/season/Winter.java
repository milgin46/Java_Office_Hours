package week12.morning.season;

public class Winter extends Season{
    /*
        Create a class Winter
        child class of Season

        constructor: set values to variables

        methods:
            activity(): Print Use Fireplace
     */

    public Winter(double highestAvgTemp, double lowestAvgTemp) {
        super(highestAvgTemp, lowestAvgTemp);
    }

    @Override
    public void activity() {
        System.out.println("Use Fireplace");
    }
}
