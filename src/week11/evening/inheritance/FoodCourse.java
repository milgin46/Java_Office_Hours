package week11.evening.inheritance;

public class FoodCourse {
   public String name;
   public double price ;

   @Override
   public String toString() {
      return "FoodCourse{" +
              "name='" + name + '\'' +
              ", price=" + price +
              '}';
   }
}
