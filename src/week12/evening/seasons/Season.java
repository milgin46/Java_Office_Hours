package week12.evening.seasons;

public class Season {

    String name;
    double highest_average_temperature; //snakecase
    double lowest_average_temperature; //snakecase


    public Season(String name, double highest_average_temperature, double lowest_average_temperature) {
        this.name = name;
        this.highest_average_temperature = highest_average_temperature;
        this.lowest_average_temperature = lowest_average_temperature;
    }

    public void activity(){
        System.out.println("You can do some activities in specific Season");
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", highest_average_temperature=" + highest_average_temperature +
                ", lowest_average_temperature=" + lowest_average_temperature +
                '}';
    }
}