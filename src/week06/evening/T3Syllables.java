package week06.evening;

public class T3Syllables {

    /*
    T3Syllables [methods, String, loops]

    Create a method that has a String parameter and returns how many syllables the given word has
        > the String given will have a "-" to separate the different syllables

    Ex:
        ja-va -> 2  1 dash 2 Syllables
        apple -> 1  0 dash 1 Syllables
        ham-bur-ger -> 3 2 dash 3 Syllables
        de-liv-ery-y -> 4
     */

    public static void main(String[] args) {

        int result = getNumberOfSyllables("ja-va");
        System.out.println("result = " + result);

    }

    public static int getNumberOfSyllables(String word) {
      /*
        word.charAt(0);
        word.charAt(1);
        word.charAt(2);
        word.charAt(3);

       */  int dashCounter = 0;


        if (!word.isEmpty()) {
            for (int i = 0; i < word.length(); i++) {
                char each = word.charAt(i);
                if (each == '-')
                    dashCounter++;

            }

            return dashCounter + 1;
        } else {
            return dashCounter;
        }

    }
}
