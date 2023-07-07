package week10.evening.task2;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
      /*  Encryption encryption=new Encryption("james bond");
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter modify number");
        encryption.modifyNumber=scanner.nextInt();
        System.out.println("enter factor number");
        encryption.factorNumber= scanner.nextInt();
        encryption.encrypt();

       */
        Encryption encryption=new Encryption("james bond",20,2);
        System.out.println(encryption.message);


                                                      //j   a    m   e  s  space b   o  n   d
        System.out.println(Encryption.decrypt("252 234 258 242 270 104 236 262 260 240", 20, 2));


    }
}
