/* 
You have been asked to build a simple encryption program. This program should be able to send coded messages without someone been able to read them. 
The process is very simple. It is divided into two parts.

First, each uppercase or lowercase letter must be shifted three positions to the right, according to the ASCII table: letter 'a' should become letter 'd', 
letter 'y' must become the character '|' and so on. Second, each line must be reversed. After being reversed, all characters from the half on (truncated) 
must be moved one position to the left in ASCII. In this case, 'b' becomes 'a' and 'a' becomes '`'.

For example, if the resulting word of the first part is "tesla", the letters "sla" should be moved one position to the left. However, if the resulting 
word of the first part is "t#$A", the letters "$A" are to be displaced.
*/

import java.io.IOException;
import java.util.Scanner;

public class B1024 {

    public static void main(String[] args) throws IOException {
        Scanner inp = new Scanner(System.in);
        StringBuilder encryptedMessage = new StringBuilder();

        int totalTestCases = inp.nextInt();
        inp.nextLine(); // <-- cleaning buffer

        for (int count = 0; count < totalTestCases; count++) {
            char[] originalMessage = inp.nextLine().toCharArray();
            int messageTruncatedHalf = Math.round(originalMessage.length / 2f);

            for (int i = 0; i < originalMessage.length; i++) {
                char thisChar = originalMessage[i];
                int charDecimal = thisChar;

                if (Character.isLetter(thisChar)) charDecimal += 3;

                if (i < messageTruncatedHalf) charDecimal -= 1;

                char encryptedChar = (char) charDecimal;
                encryptedMessage.append(encryptedChar);
            }

            System.out.println(encryptedMessage.reverse());

            encryptedMessage.setLength(0);
        }

        inp.close();
    }
}