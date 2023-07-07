package week06.evening;

public class T2SwapFirstLast {
    /*
    T2SwapFirstLast [methods, String]

    Create a method that has a String parameter and returns a String with the first and last character swapped

    Ex:
        code -> eodc
        ab -> ba
        fa -> af
     */

    public static void main(String[] args) {
        //    01  word.length()-1
        //handle with one character homework
        String result = swapFirstWithLast("af");
        System.out.println("result = " + result);
    }

    public static String swapFirstWithLast(String word) {
        //get the first letter
        char first = word.charAt(0);
        //get te last letter
        char last = word.charAt(word.length() - 1);

        //we will get the between first and last letter
        //ABCDE
        String sub = word.substring(1, word.length() - 1);

        //I will put inside the another variable

        String result = last + sub + first;

        //I will return
        return result;


    }


}
