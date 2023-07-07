package week11.evening;

public class Workout {

    private String name;
    private double duration;
    private double burnedCalories;

    public Workout(String name, double duration, double burnedCalories) {
        setName(name);
        setDuration(duration);
        setBurnedCalories(burnedCalories);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name.isEmpty()){
            System.err.println("You can not use empty name");
            return;
        }

        boolean isValid=true;

        for (char c : name.toCharArray()) {
            if (!Character.isLetter(c) && c!=' ')
                isValid=false;
        }
        if (!isValid){
            System.err.println("Your name is not valid");
       return;
        }


        this.name = name;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {

        if (duration<=0){
            System.err.println("Yo can not use negative numbers");
            return;
        }
        this.duration = duration;
    }

    public double getBurnedCalories() {
        return burnedCalories;
    }

    public void setBurnedCalories(double burnedCalories) {

        if (burnedCalories>0 && burnedCalories <1000){
            this.burnedCalories = burnedCalories;
        }else {
            System.err.println("you ca not use the value");
        }

    }

    @Override
    public String toString() {
        return "Workout{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", burnedCalories=" + burnedCalories +
                '}';
    }
}
