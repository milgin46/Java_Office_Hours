package week12.morning.candy;

public class HersheyBar extends Candy{
    /*
        Create a class HersheyBar
        inherits Candy class

        create a constructor that calls the parent constructor

     */

    static String hq = "Hershey Pennsylvania";

    public HersheyBar(int quantity) {
        super(quantity, false); // hardcoding hasPeanuts to false
    }
}
