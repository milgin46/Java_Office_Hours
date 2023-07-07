package week10.evening;

public class InterviewQuestion2 {

    public static void main(String[] args) {

        /*
        we will have a method it will return true if the first and lat letter is same
         */

       boolean res= sameLetter("dede");

    }

    private static boolean sameLetter(String word) {
       return word.charAt(0)==word.charAt(word.length()-1);
    }
}
