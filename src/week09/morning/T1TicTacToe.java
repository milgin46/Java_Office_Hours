package week09.morning;

import java.util.Arrays;

public class T1TicTacToe {
    /*
    T1TicTacToe [multidimensional array]

    Create a program that will define a 2D array for a tic tac toe game. Check the board to see who won.
    X or O are the winners if they have 3 of the same character in a row. If there is not 3 X or O in a row print Tie instead

     */

    public static void main(String[] args) {

        char[][] board = {
                {'-', 'O', 'X'},
                {'-', 'O', 'X'},
                {'X', 'O', '-'},
        };

        String winner = "";

        for(int i = 0; i < board.length; i++){
            String row = Arrays.toString(board[i]).replace(", ", "").replace("[", "").replace("]", "");
            String colm = "" + board[0][i] + board[1][i] + board[2][i];

            if(row.equals("XXX") || colm.equals("XXX")){
                winner = "X";
            } else if(row.equals("OOO") || colm.equals("OOO")){
                winner = "O";
            }
        }

        String dig1 = "" + board[0][0] + board[1][1] + board[2][2];
        String dig2 = "" + board[2][0] + board[1][1] + board[0][2];

        if(dig1.equals("XXX") || dig2.equals("XXX")){
            winner = "X";
        } else if(dig1.equals("OOO") || dig2.equals("OOO")){
            winner = "O";
        }

        if(winner.isEmpty()){
            System.out.println("Tie");
        } else {
            System.out.println(winner + " player wins");
        }

    }


}

        /*
            3 ways to win
            same characters (x or o)
                in a row
                in a colm
                in a diagonal
             for - each 1d array
              row: check each array board[i]
              colm:
                    [0][0] [1][0] [2][0]
                    [0][1] [1][1] [2][1]
              dig : hard code maybe
         */

