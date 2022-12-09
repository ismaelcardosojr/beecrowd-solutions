/* 
A sentence is called dancing if its first letter is uppercase and the case of each subsequent letter is the opposite of the previous letter. 
Spaces should be ignored when determining the case of a letter. For example, "A b Cd" is a dancing sentence because the first letter ('A') is uppercase, 
the next letter ('b') is lowercase, the next letter ('C') is uppercase, and the next letter ('d') is lowercase.
*/

import java.io.IOException;
import java.util.Scanner;

public class B1234 {

    public static void main(String[] args) throws IOException {
        Scanner inp = new Scanner(System.in);

        while (inp.hasNext()) {
            String testSentence = inp.nextLine();

            for (int i = 0, count = 0; i < testSentence.length(); i++, count++) {
                String thisChar = testSentence.substring(i, i + 1);

                if (thisChar.equals(" ")) {
                    System.out.print(thisChar);

                    count--;
                    continue;
                }

                if (count % 2 == 0)
                    System.out.print(thisChar.toUpperCase());
                else
                    System.out.print(thisChar.toLowerCase());
            }

            System.out.print("\n");
        }

        inp.close();
    }
}