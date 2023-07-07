package week06.morning;

public class T4CharacterSet {
    /*
    T4CharacterSet [methods, loops]

    Create a method that has a String parameter and returns a String.
    Based on the given String a different set of characters will be returned
    use these to determine which set of characters is returned:

    based on the defined parameter return a String will all of the characters in the range

    uppercase -> ABCDEFGHIJKLMNOPQRSTUVWXYZ
    lowercase -> abcdefghijklmnopqrstuvwxyz
    digit -> 123456789
    special -> !"#$%&'()*+,-.
     */

    public static String getCharacterSet(String group){

        String allCharacters = "";
        char start;
        char end;

        switch (group.toLowerCase()){
            case "uppercase":
                start = 'A';
                end = 'Z';
                break;
            case "lowercase":
                start = 'a';
                end = 'z';
                break;
            case "digits":
            case "numbers":
                start = '0';
                end = '9';
                break;
            case "special":
                start = '!';
                end = '.';
                break;
            default:
                return "Invalid group";
        }

        for(char letter = start; letter <= end; letter++){ // 'A'  end = 'Z'
           // System.out.print ((int)letter + " ");
            allCharacters += letter;
        }

        //System.out.println();

        return allCharacters;
    }

    public static void main(String[] args) {
        System.out.println(getCharacterSet("UPPERcase"));
        System.out.println(getCharacterSet("lowercase"));
        System.out.println(getCharacterSet("digits"));
        System.out.println(getCharacterSet("numbers"));
        System.out.println(getCharacterSet("SPECIAL"));
        System.out.println(getCharacterSet("java"));  // the loop never runs
    }

}
