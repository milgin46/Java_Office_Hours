package week04.evening;

public class T1Parking {

/**
create a program that will define a time variable. Use a 24 hour format. Based on the given time determine the cost of parking in the city

		If the time is between 6-12:
			fee: 7.50

		if the time is between 13 - 23 or 0 - 5
			fee is 15
 */
    public static void main(String[] args) {
        //define a time variable.

        byte time=15;
        double fee=0.0;
        //constraint time should be 0-23

        if (time>=0 && time<=23) {

            // If the time is between 6-12:
            if (time>=6 && time<=12){
                //we will do actions
                fee=7.5;
            } else {
                //we will do some actions

                fee=15;

            }    //else  the other conditions

        }else {
            System.out.println(time + " is not correct");
        }
        System.out.println("fee = " + fee);


    }







}


