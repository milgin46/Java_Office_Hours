package week12.evening.seasons;

public class Summer extends Season{


    public Summer(double highest_average_temperature, double lowest_average_temperature) {
        super("Summer", highest_average_temperature, lowest_average_temperature);
    }

    @Override
    public void activity() {
        System.out.println("Drink Lemonade in Summer");
    }
}
