package week05.evening;

public class T3SearchResults {

    /*
    Create a program that will have a String in a fixed format showing the results of a search. Based on that given format find the total number of search results and print them.

	Note: make the program as dynamic as possible for different sizes(it could be a number of 10 which is only 2 number digits or 100000 which is 6 number digits)

	Fixed format of the String:
		Total results found: $results. Sort, Filter, Ratings

	ex:
		"Total results found:3012. Sort, Filter, Ratings"
		-> 3012

		"Total results found:25. Sort, Filter, Ratings"
		-> 25

	Q: what is the datatype of the number we are getting in the end?
		Follow up, we will learn how to get this as an integer number in the future
     */


    public static void main(String[] args) {
                        //0123456
        String sentence= "teacher";
        //in order to get some part of the string we need to substring method

        System.out.println("sentence.substring(2,5) = " + sentence.substring(2, 5)); //ach
        System.out.println("sentence.substring(4,7) = " + sentence.substring(4, 7)); //her
        System.out.println("sentence.substring(1,5) = " + sentence.substring(1, 5)); //each        7-3 =4
        System.out.println("sentence.substring(sentence.length()-3) = " + sentence.substring(sentence.length() - 3));
        System.out.println("sentence.substring(4) = " + sentence.substring(4));
                                             //19
                        // Total results found: 25. Sort, Filter, Ratings
        String mySentence="Total results found: 3012. Sort, Filter, Ratings";

        //find the index of column
        int idexOfColumn = mySentence.indexOf(":");

        int indexOfFirstDigit=idexOfColumn+2;

        //find the index of .

        int indexOfDot = mySentence.indexOf(".");



        //get the part of te string substring()

        System.out.println(mySentence.substring(indexOfFirstDigit, indexOfDot));


    }
}
