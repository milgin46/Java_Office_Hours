package week06.morning;

public class T3Syllables {
    /*
    T3Syllables [methods, String, loops]

    Create a method that has a String parameter and returns how many syllables the given word has
        > the String given will have a "-" to separate the different syllables

    Ex:
        ja-va -> 2
        ap-ple -> 2
        ham-bur-ger -> 3
        de-li-ve-ry -> 4
        ball - 1
     */

    public static int countSyllables(String str){
        int syllables = str.isEmpty() ? 0 : 1;  // for all words 1 will be the starting value, expect for when the str is empty it will be 0

        for(int i = 0; i < str.length(); i++){ // i <= str.length() - 1
            if (str.charAt(i) == '-') {
                syllables++;
            }
        }

        return syllables; // return str.isEmpty() ? 0 : syllables;
    }

    public static void main(String[] args) {
        System.out.println("java " + countSyllables("ja-va"));
        System.out.println("hamburger " + countSyllables("ham-bur-ger"));
        System.out.println("delivery " + countSyllables("de-li-ve-ry"));
        System.out.println("ball " + countSyllables("ball"));
        System.out.println("(empty) " + countSyllables(""));
    }

}
