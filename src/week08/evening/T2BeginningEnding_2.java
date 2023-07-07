package week08.evening;

import utils.StringUtils;

public class T2BeginningEnding_2 {
    /*

T2BeginningEnd [array, loop, String]

    Create a program that will define a String array with some name values. Determine how many of the names begin with and end with the same character.

    Ex:
        {Anna, Mike, Aliya, Remus, Gina, Hannah, Nathan, Otto, Kevin, Kelly}

        -> 5

    Bonus challenge: Collect all the names that start and end with the same character into an array

     */

    public static void main(String[] args) {

        // we will have one array
        String[] array = {"Anna", "Mike", "Aliya", "Remus", "Gina", "Hannah", "Nathan", "Otto", "Kevin", "Kelly"};

        // I need to check each value from the array
        int counter = 0;
        for (String each : array) {
            //I need to check my word first and last letters
            if (StringUtils.isFirstAndLastLetterSame(each))
                counter++;
        }

        System.out.println(counter);


    }



}
