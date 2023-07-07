package week05.evening;

import java.util.Scanner;

public class T5Angles {
    /*

	Create a program that will ask the user to enter 3 angles. Add to sum of the angles and print what type of shape is made from the angles.
		If the angles add up to 180 print triangle.
		If the angles add up to 360 print circle
		For any other angle print: Cannot determine
     */

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        //We will get the first angle
        System.out.println("please enter first angle");
      //  int first=60;  //we were doing like this
        int first= scanner.nextInt();  //60 // we will get from the keyboard after running our code

        //We will get the second one
        System.out.println("please enter second angle");
        int second= scanner.nextInt();

        //we will get third one

        System.out.println("please enter third angle");
        int third= scanner.nextInt();

        //I will try  to find sum of that angles

        int sum=first+second+third;



        if (sum==180){ //if sum of angles are 180 we will say triangle
            System.out.println("triangle");
        } else if (sum==360) { //if sum of angles are 360 we will say circle
            System.out.println("circle");
        }else {  //else we will say Cannot determine
            System.out.println("Cannot determine");
        }







    }
}
