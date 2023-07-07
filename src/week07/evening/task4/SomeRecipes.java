package week07.evening.task4;

public class SomeRecipes {

    public static void main(String[] args) {
        Recipe r1=new Recipe();
        r1.setInfo("Egg With Cheese","Egg, Cheese, Salt",4,4);
        System.out.println(r1);

        System.out.println(r1.costPerPerson());

        Recipe r2=new Recipe();
        r2.setInfo("Recipe A","A, B, C",2,20);

        System.out.println(r2.cost);


    }
}
