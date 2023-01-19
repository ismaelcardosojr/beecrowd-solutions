/*
Mariazinha created an exercise for her sisters Paula and Marta: she distributes a text and asks both to correct this text, knowing that only the OBI and URI 
words may be written incorrectly, and the error can be only in the last letter.

Your task here is automatize this process, creating a program to make the correction of the texts distributed by Mariazinha in order to check the corrections 
of her sisters without much work.

Note that if "OB" or "UR" were part of a larger word (for example, "OBOS"), it should not be altered.
*/

import java.io.IOException;
import java.util.Scanner;

public class B2062 {

    public static void main(String[] args) throws IOException {
        Scanner inp = new Scanner(System.in);

        int totalWords = inp.nextInt();

        inp.nextLine(); // cleaning the buffer
        String textWords[] = inp.nextLine().split(" ");

        for (int i = 0; i < totalWords; i++) {
            String thisWord = textWords[i];
            int thisWordSize = thisWord.length();

            if (i != 0) {
                System.out.print(" ");
            }

            if (thisWord.startsWith("OB") && thisWordSize == 3) {
                System.out.print("OBI");
            } else if (thisWord.startsWith("UR") && thisWordSize == 3) {
                System.out.print("URI");
            } else {
                System.out.print(thisWord);
            }
        }

        System.out.print("\n");

        inp.close();
    }
}