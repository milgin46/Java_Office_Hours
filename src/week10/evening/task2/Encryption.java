package week10.evening.task2;

public class Encryption {

    public  String message;

    public int modifyNumber;

    public int factorNumber;

    //shortcut
    //mac command+N
    //windows alt +insert


    public Encryption(String message) {
        this.message = message;
    }


    public Encryption(String message, int modifyNumber, int factorNumber) {
      //  this.message = message;
        this(message);
        this.modifyNumber=modifyNumber;
        this.factorNumber = factorNumber;
        encrypt();
        //shortcut  for creating method
        //mac option+enter
        //windows alt+enter
    }

    public void encrypt(){
        String ecncrypted="";

        for (char c : message.toCharArray()) {
            int result=(c+modifyNumber)*factorNumber;
            ecncrypted+=result+" ";
        }

        System.out.println(ecncrypted.trim());


    }
    public static String decrypt(String message,int modifyNumber,int factorNumber){

        String decrypted="";
        //        message: 252 234 258 242 270 104 236 262 260 240
        for (String s : message.split(" ")) {
            int dec = Integer.parseInt(s);
                        // in order to get the ascii code od char
            char ch=(char) (dec/factorNumber-modifyNumber);

            decrypted+=ch;

        }
        return decrypted;

    }


}
