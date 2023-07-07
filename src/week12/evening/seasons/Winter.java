package week12.evening.seasons;

public class Winter extends Season{
    public Winter( double highest_average_temperature, double lowest_average_temperature) {
        super("Winter", highest_average_temperature, lowest_average_temperature);
    }

    @Override
    public void activity() {
        System.out.println("Use Fireplace in Winter");
    }
}
