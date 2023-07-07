package week11.evening.staticpac;

public class Cake {

    public static int numberOfSlices=10;


    public void eatCake(int numberOfEaten){
        numberOfSlices-=numberOfEaten;
    }
}
