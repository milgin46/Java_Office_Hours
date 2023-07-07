package week12.morning.candy;

public class Candy extends Object{
    /*
    Candy [inheritance, constructor, static]

    Create a class Candy

        declare these instance variables:
            - brand (String), quantity (int), contains peanuts (boolean)
                make brand and contains peanuts

        declare a static variables:
            - number of total candy in the world: 500,000
            - country with largest candy consumption: United States

        create a constructor to set all instance variables

        override toString
     */

    static int totalNumberInWorld = 500000;
    static String largestConsumer = "United States";

    String brand;
    int quantity;
    boolean hasPeanuts;

    public Candy(int quantity, boolean hasPeanuts) {
        this.brand = getClass().getSimpleName();
        this.quantity = quantity;
        this.hasPeanuts = hasPeanuts;
    }

    @Override
    public String toString(){
        return "I have " + quantity + " " + brand + " which " + (hasPeanuts ? "has" : "doesn't have") + " peanuts";
    }

}
