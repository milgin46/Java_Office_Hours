package week12.evening.candies;

public class Candy {

    String brand;
    int quantity;
    boolean containsPeanuts;

    static  int totalNumberOfCandy=500_000;
    static String largestCandyConsumptionOfCountry="USA";

    public Candy(int quantity, boolean containsPeanuts) {
        this.brand = getClass().getSimpleName();
        this.quantity = quantity;
        this.containsPeanuts = containsPeanuts;
    }


    @Override
    public String toString() {
        return  "My Candy has "+
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", containsPeanuts=" + containsPeanuts;
    }
}
