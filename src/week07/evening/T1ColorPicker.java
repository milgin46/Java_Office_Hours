package week07.evening;

import java.util.Scanner;

public class T1ColorPicker {
/*
T1ColorPicker [loop, Scanner, String]

    Create a program that will allow the user to select three unique colors.
    Ask the user to enter their colors one at a time. Verify the color hasn't been selected already. If the color is unique add it to the final selection otherwise tell the user the colors should be unique and allow them to reenter a different color. The number of iterations is not fixed

    Ex flow:
        Enter color 1:
            > red
        red added
        Enter color 2:
            > red
        red is already selected
        Enter color 2:
            > green
        green added
        Enter color 3:
            > red
        red is already selected
        Enter color 3:
            > green
        green is already selected
        Enter color 3:
            > orange
        orange added

        Here are the colors you picked: red, green, orange

 */

    public static void main(String[] args) {


        pickColor();


    }

    public static void pickColor() {
        Scanner scanner=new Scanner(System.in);
        boolean flag=true;
        String answers="";
        int times=1;
        while (flag){
            System.out.println("Enter color " + times);
            String answer=scanner.next();
            /*
             Enter color 1:
            > red
        red added
             */
            if (!answers.contains(answer)){
                answers+=answer +", ";
                System.out.println("answers = " + answers);
                System.out.println(answer+ " added");
                times++;
            }else {
                //red is already selected
                System.out.println(answer+ " is already selected");

            }

            if (times==4){
                flag=false;
                //break
            }



        }
//Here are the colors you picked: red, green, orange
        System.out.println("Here are the colors you picked: " + answers.substring(0,answers.length()-2));
scanner.close();
    }
}
