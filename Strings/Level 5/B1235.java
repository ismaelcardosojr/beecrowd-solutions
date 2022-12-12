/* 
Your printer has been infected by a virus and is printing gibberish. After staring at several printed pages for a while, you realize that it is printing 
every line inside-out. In other words, the left half of each line is being printed starting in the middle of the page and proceeding out toward the left margin.
Similarly, the right half of each line is being printed starting at the right margin and proceeding in toward the middle of the page.

For example, the line:
THIS LINE IS GIBBERISH

is being printed as:
I ENIL SIHTHSIREBBIG S

In the same way, the line " MANGOS " is being printed as "NAM  SOG".Your task is to unscramble a String line from its printed form back into its original order.
You can assume that line contains an even number of characters.
*/

import java.io.IOException;
import java.util.Scanner;

public class B1235 {

    public static void main(String[] args) throws IOException {
        Scanner inp = new Scanner(System.in);

        int testCases = inp.nextInt();
        inp.nextLine();

        for (int count = 0; count < testCases; count++) {
            String text = inp.nextLine();
            int stringSize = text.length();

            for (int i = ((stringSize - 1) / 2); i >= 0; i--) {
                System.out.print(text.charAt(i));
            }

            for (int i = (stringSize - 1); i >= (stringSize / 2); i--) {
                System.out.print(text.charAt(i));
            }

            System.out.println();
        }

        inp.close();
    }
}