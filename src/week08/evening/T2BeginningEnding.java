package week08.evening;

public class T2BeginningEnding {
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
            //convert al letters into the lover case
            each = each.toLowerCase(); //anna

            //I will get the first letter
            char firstLetter = each.charAt(0);
         //   String firstLetter = each.charAt(0)+"";

            //I will get the last letter
            char lastLetter = each.charAt(each.length() - 1);
          //  String lastLetter = each.charAt(each.length() - 1)+ "";

            // I will compare the letters if same I will increment my counter

          //  if (firstLetter.equals(lastLetter)) {
            if (firstLetter == lastLetter) {
                counter++;
            }


        }
        System.out.println(counter);


    }
}
