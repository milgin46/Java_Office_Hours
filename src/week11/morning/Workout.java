package week11.morning;

public class Workout {
    /*
    Workout [Encapsulation, access modifiers, classes, objects, methods]

    Create a class Workout
    define and encapsulate these instance variables:
        name, duration, calories burned

    create a constructor to initialize the variables. Call the setters in the constructor

    in the setters only set the values if they are valid data based on these requirements:
        name: should have only letters and spaces, no other characters type. The name cannot be empty either

        duration: should be more than 0

        calories burned: should be more than 0 and less than 1000

    create another class to test the Workout objects
     */

    private String name;
    private int minutes;
    private int caloriesBurned;

    public Workout(String name, int minutes, int caloriesBurned) {
        setName(name);
        setMinutes(minutes);
        setCaloriesBurned(caloriesBurned);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { // ben19ch

        if(name.isEmpty()){
            return; // stops the method
        }

       boolean isValid = true; // true

       for(int i = 0; i < name.length(); i++){
           if(!Character.isLetter(name.charAt(i)) && name.charAt(i) != ' '){ // checks if the character is not a letter or not a space
               isValid = false;
               break;
           }
       }

       if(isValid){
           this.name = name;
       }

    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if(minutes > 0) {
            this.minutes = minutes;
        }
    }

    public int getCaloriesBurned() {
        return caloriesBurned;
    }

    public void setCaloriesBurned(int caloriesBurned) {
        if(caloriesBurned > 0 && caloriesBurned < 1000){
            this.caloriesBurned = caloriesBurned;
        }
    }

    @Override
    public String toString() {
        return "Workout{" +
                "name='" + name + '\'' +
                ", minutes=" + minutes +
                ", caloriesBurned=" + caloriesBurned +
                '}';
    }
}
