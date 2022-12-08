/* 
Read the start time and end time of a game, in hours and minutes (initial hour, initial minute, final hour, final minute). 
Then print the duration of the game, knowing that the game can begin in a day and finish in another day.

Obs.: With a maximum game time of 24 hours and the minimum game time of 1 minute.
*/

import java.io.IOException;
import java.util.Scanner;

public class B1047 {

    public static void main(String[] args) throws IOException {
        int startH, startM, endH, endM;
        int hours = 0, minutes = 0;
        Scanner input = new Scanner(System.in);

        startH = input.nextInt();
        startM = input.nextInt();
        endH = input.nextInt();
        endM = input.nextInt();

        if (startH == endH) {
            if (startM > endM || startM == endM) {
                hours = 24;
            }
        } else if (startH < endH) {
            hours = endH - startH;
        } else {
            hours = 24 - (startH - endH);
        }

        if (startM == endM) {
            minutes = 0;
        } else if (startM < endM) {
            minutes = endM - startM;
        } else {
            minutes = 60 - (startM - endM);
            hours--;
        }

        System.out.println("O JOGO DUROU " + hours + " HORA(S) E " + minutes + " MINUTO(S)");

        input.close();
    }

}