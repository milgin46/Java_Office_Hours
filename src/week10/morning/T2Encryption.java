package week10.morning;

public class T2Encryption {
    /*

    T2Encryption [class, instance, static, loop, String]
        Create a class Encryption
        define these instance variables
            message (String)
            modify number
            factor number
    */

    public String message;
    public int modifyNum;
    public int factorNum;

    /*
    create a constructor that will initialize the message
    create a constructor that will initialize the message, modify number, and factor number
        call the encrypt method here
    */

    public T2Encryption(String message){
        this.message = message;
    }

    public T2Encryption(String message, int modifyNum, int factorNum) {
        this(message);
        this.modifyNum = modifyNum;
        this.factorNum = factorNum;
        encrypt();
    }

    /*
    create a method encrypt (instance)
        return: void
        parameters: none

        To encrypt every character of the message we will take the modified number and add it to ascii value of each character. Then we will multiply the result by the factor number. Separate the resulting number of each character by a space. After encrypting the message reassign the message variable to the encrypted version

        Ex:
            message = "james bond"
            modify num: 20
            factor num: 2

            message: 252 234 258 242 270 104 236 262 260 240
    */

    public void encrypt(){
        String encrypted = "";

        for(char each : message.toCharArray()){
            encrypted += (each + modifyNum) * factorNum + " ";
        }

        message = encrypted.trim();
    }


    /*
    create a method decrypt (static)
        return: String
        parameters: message, modify number, factor number

        Given the modify and factor numbers decrypt the message and return the decrypted String. Do the reverse steps we did for encrypting

        Ex:
        message: 252 234 258 242 270 104 236 262 260 240
        modify num: 20
        factor num: 2

        -> james bond

     */

    public static String decrypt(String message, int modifyNum, int factorNum){
        String[] eachPart = message.split(" ");
        String actualMessage = "";

        for(String each : eachPart){
            actualMessage += (char)(Integer.parseInt(each) / factorNum - modifyNum);
        }
        return actualMessage;
    }

    public String toString(){
        return message;
    }
}
