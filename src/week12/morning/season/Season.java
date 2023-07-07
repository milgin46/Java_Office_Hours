package week12.morning.season;

public class Season {
    /*
        Create a class Season

        instance variables
            - name
            - highest average temperature
            - lowest average temperature

        constructor:
            - initialize all fields

        methods:
            - activity(), toString()
            override activity in sub classes
     */
    String name;
    double highestAvgTemp;
    double lowestAvgTemp;

    public Season(double highestAvgTemp, double lowestAvgTemp) {
        this.name = getClass().getSimpleName();
        this.highestAvgTemp = highestAvgTemp;
        this.lowestAvgTemp = lowestAvgTemp;
    }

    public void activity(){
        System.out.println("Activity in season");
    }

    public String toString(){
        return name + " has temperatures between " + highestAvgTemp + " - " + lowestAvgTemp;
    }

}
