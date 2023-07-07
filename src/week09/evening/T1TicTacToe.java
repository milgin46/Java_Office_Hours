package week09.evening;

public class T1TicTacToe {

    /*
    T1TicTacToe [multidimensional array]

    Create a program that will define a 2D array for a tic tac toe game. Check the board to see who won.
    X or O are the winners if they have 3 of the same character in a row. If there is not 3 X or O in a row print Tie instead
     */

    public static void main(String[] args) {

   //create one two dimensional array

   char[][] gameResult={
          // 0   1   2
           {'X','X','X'},  //0
           {'X','X','O'},  //1
           {'O','O','O'}  //2

   }  ;
    //array name        //rownumber     columnnumber
 //  gameResult              [1]            [1]           = 'A';
 //  gameResult              [0]            [2]           ='B';

   // I will create two variable for counting XXX and OOO in a row
        int numberOfXXX=0;
        int numberOfOOO=0;
                          //    3  array I have
        for (int i = 0; i < gameResult.length; i++) {//for row array for outside  i represent for row num

            String container="";  // I am deleting my value for each row
                            // 3 element I have
            for (int j = 0; j < gameResult[i].length; j++) { // j represent for col num

                container +=""+gameResult[i][j];

            }

            if (container.equals("XXX")){
                numberOfXXX++;
            }

            if (container.equals("OOO")){
               numberOfOOO++;
            }


        }

        System.out.println("numberOfXXX = " + numberOfXXX);
        System.out.println("numberOfOOO = " + numberOfOOO);

        if (numberOfXXX>numberOfOOO){
       System.out.println("X won");
   } else if (numberOfXXX<numberOfOOO) {
       System.out.println("O is win");
   }else {
       System.out.println("tie");
   }

        //I will compare number of XXX with number of OOO










    }
}
