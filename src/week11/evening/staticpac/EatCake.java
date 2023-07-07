package week11.evening.staticpac;

public class EatCake {

    public static void main(String[] args) {
        Cake person1=new Cake();
        System.out.println(person1.numberOfSlices);
        person1.eatCake(3);
        System.out.println(person1.numberOfSlices);
        Cake person2=new Cake();
        person2.eatCake(4);
        System.out.println(person2.numberOfSlices);


    }
}
