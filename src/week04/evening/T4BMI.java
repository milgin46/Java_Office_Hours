package week04.evening;

public class T4BMI {

    public static void main(String[] args) {
        // we will define two variable mass and the height

        int mass=90;

        double height=1.8;

        //we will define a variable for BMI

        double BMI=0.0;

        // mass should be more than 40 and less than 185

        //height should be more than 1.2 and less than 2.5

        if ((mass>40&&mass<185)&&(height>1.2&&height<2.5)){//if conditoion is correct

            // we will calculate the BMI

          //BMI = mass / height^2

            BMI=mass/(height*height);

            if (BMI>=30){
                System.out.println("Obese");
            } else if (BMI>=25 && BMI<=29.9) {
                System.out.println("Overweight");
            } else if (BMI>=18.5 && BMI<=24.9) {
                System.out.println(" Normal weight");
            }else {
                System.out.println("Underweight");
            }

        }else { //if condition is not correct
            //print the "Sorry we cannot calculate the BMI with these metrics"

            System.out.println("Sorry we cannot calculate the BMI with these metrics");


        }




    }
}
