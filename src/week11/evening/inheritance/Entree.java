package week11.evening.inheritance;

public class Entree extends FoodCourse {

    public String specialForEntry;

    @Override
    public String toString() {
        return "Entree{" +
                "specialForEntry='" + specialForEntry + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
