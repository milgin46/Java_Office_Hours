package week07.evening.staticVariable;

public class EatingCake {

    public static void main(String[] args) {
        //person1 is making a cake we will eat together same cake
        Cake person1 = new Cake(); //we will at that cake
        person1.setInfo(10);
        person1.eatCake(2);
        System.out.println(person1.numberOfSlices);
        Cake person2 = new Cake();
        person2.eatCake(2);
        System.out.println(person1.numberOfSlices);

        Cake person3=new Cake();
        person3.eatCake(4);
        System.out.println(person1.numberOfSlices);

    }
}
