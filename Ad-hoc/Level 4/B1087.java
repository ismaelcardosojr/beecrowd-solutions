/*
The game of Chess has several pieces with curious movements. One of them is the Queen, which can move any number of squares in any direction: 
in the same line, in the same column or in any of the diagonals.

The great Chess Master Kary Gasparov invented a new type of chess problem: given the position of a queen in an empty standard chess board 
(that is, an 8 x 8 board) how many moves are needed so that she reaches another given square in the board?

Kary found the solution for some of those problems, but is having a difficult time to solve some others, and therefore he has asked that you 
write a program to solve this type of problem.
*/

import java.io.IOException;
import java.util.Scanner;

public class B1087 {

    public static void main(String[] args) throws IOException {
        Scanner inp = new Scanner(System.in);

        int initialRow, initialColumn;
        int aimedRow, aimedColumn;
        int neededRows, neededColumns;
        boolean moveIsValid;
        int totalMoves;

        while (true) {
            moveIsValid = false;

            initialRow = inp.nextInt();
            initialColumn = inp.nextInt();
            aimedRow = inp.nextInt();
            aimedColumn = inp.nextInt();

            if (initialRow + initialColumn + aimedRow + aimedColumn == 0) {
                break;
            }

            neededRows = Math.abs(initialRow - aimedRow);
            neededColumns = Math.abs(initialColumn - aimedColumn);

            // movement in straight lines
            if ((neededRows == 0 && neededColumns != 0)
                || (neededRows != 0 && neededColumns == 0)) {
                moveIsValid = true;
            }

            // movement in the diagonals
            if (neededRows == neededColumns) {
                moveIsValid = true;
            }

            if (neededRows == 0 && neededColumns == 0) {
                totalMoves = 0;
            } else if (moveIsValid) {
                totalMoves = 1;
            } else {
                totalMoves = 2;
            }

            System.out.println(totalMoves);
        }

        inp.close();
    }
}