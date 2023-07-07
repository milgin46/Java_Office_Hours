package week12.evening.seasons;

public class Fall extends Season{
    public Fall( double highest_average_temperature, double lowest_average_temperature) {
        super("Fall", highest_average_temperature, lowest_average_temperature);
    }

    @Override
    public void activity() {
        System.out.println("Read A Book in Fall");
    }
}
