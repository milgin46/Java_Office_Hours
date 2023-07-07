package week07.evening.staticVariable;

public class Cake {

    static int numberOfSlices;

    public void setInfo(int numberOfSlices){
        this.numberOfSlices=numberOfSlices;
    }

    public void eatCake(int numberOfSlice){
        numberOfSlices-=numberOfSlice;
    }
}
