package week11.evening.inheritance;

public class Restaurant {

    public static void main(String[] args) {
        FoodCourse foodCourse=new FoodCourse();
        foodCourse.name="Food Course";
        foodCourse.price=0.5;
        System.out.println(foodCourse);
        Entree entree=new Entree();
        entree.name="Entry Name";
        entree.price=10;
        entree.specialForEntry="Special For Entry";
        System.out.println(entree);


    }
}
