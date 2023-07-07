package week12.morning.season;

public class Fall extends Season{
    /*
        Create a class Fall
        child class of Season

        constructor: set values to variables

        methods:
            activity(): Read A Book
     */

    public Fall(double highestAvgTemp, double lowestAvgTemp) {
        super(highestAvgTemp, lowestAvgTemp);
    }

    @Override
    public void activity() {
        System.out.println("Read a Book");
    }
}
