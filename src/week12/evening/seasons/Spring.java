package week12.evening.seasons;

public class Spring extends Season{
    public Spring(double highest_average_temperature, double lowest_average_temperature) {
        super("Spring", highest_average_temperature, lowest_average_temperature);
    }

    @Override
    public void activity() {
        System.out.println("Go Outside in Spring");
    }
}
