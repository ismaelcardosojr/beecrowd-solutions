/* 
Analógimôn Go! is a very popular game. During his quest, the player travels across many cities capturing virtual little monsters called analógimôns. 
You just entered a city that contains the very last analógimôn you still don’t have!

The city can be described as a grid with N rows and M columns. You are at a given position in the city, while the last analógimôn is at another position 
in the same city. In one second, you can move (exactly) one position to the north, to the south, to the west or to the east. Considering that the analógimôn 
does not move at all, you task is to determine the minimum amount of time you need to reach it.

The following figure shows the first sample input, and shows a path that can be made in 5 seconds. There are other paths that can be used that take the same 
amount of time, but there is no path that takes less time than this one.
*/

import java.io.IOException;
import java.util.Scanner;

public class B2520 {

    public static int countSecs(int playerPosition, int analogimonPosition) {
        int secs = 0;

        while (playerPosition != analogimonPosition) {
            secs++;

            if (playerPosition > analogimonPosition)
                playerPosition--;
            else if (playerPosition < analogimonPosition)
                playerPosition++;
        }

        return secs;
    }

    public static void main(String[] args) throws IOException {
        Scanner inp = new Scanner(System.in);

        int rows, columns, city[][];
        int playerRow, playerColumn;
        int analogimonRow, analogimonColumn;
        int seconds;

        playerRow = playerColumn = analogimonRow = analogimonColumn = 0;

        while (inp.hasNext() ) {
            rows = inp.nextInt();
            columns = inp.nextInt();

            city = new int[rows][columns];
    
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    city[i][j] = inp.nextInt();
    
                    if (city[i][j] == 1) {
                        playerRow = i;
                        playerColumn = j;
                    } else if (city[i][j] == 2) {
                        analogimonRow = i;
                        analogimonColumn = j;
                    }
                }
            }

            seconds = countSecs(playerRow, analogimonRow);
            seconds += countSecs(playerColumn, analogimonColumn);
    
            System.out.println(seconds);

            inp.close();
        }
    }
}