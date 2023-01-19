/*
Given an initial setup, the World War II German encryption machine Enigma replaced each letter typed on the keyboard with some other letter. 
The replacement was quite complex, but the machine had a vulnerability: a letter would never replace itself! This vulnerability was exploited by Alan Turing, 
who worked on cryptanalysis at Enigma during the war. The objective was to find the initial configuration of the machine using the assumption that the message 
contained a certain common communication expression, such as the word ARMADA. These expressions were called cribs. If the encrypted message was, for example, 
FDMLCRDMRALF, the job of testing the possible configurations of the machine was simplified because the word ARMADA, if it were in that encrypted message, 
could only be in two positions. The other five positions could not correspond to the ARMADA crib because at 
least one letter of the crib matches its correspondent in the encrypted message; since Enigma would never substitute a letter for itself, these five positions 
could be dropped in testing.

In this problem, given a ciphertext and a crib, your program must compute the number of possible positions for the crib in the ciphertext.
*/

import java.io.IOException;
import java.util.Scanner;

public class B2880 {

    public static boolean getCribFitting(String cipherPart, String crib) {
        for (int i = 0; i < cipherPart.length(); i++) {
            char thisCipherChar = cipherPart.charAt(i);
            char thisCribChar = crib.charAt(i);

            if (thisCipherChar == thisCribChar) return false;
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        Scanner inp = new Scanner(System.in);

        String cipherText = inp.nextLine();
        String crib = inp.nextLine();

        int cribLength = crib.length();
        int cribPossibleFittings = 0;

        for (int i = cribLength; i <= cipherText.length(); i++) {
            String cipherPart = cipherText.substring(i - cribLength, i);
            boolean cribFits = getCribFitting(cipherPart, crib);

            if (cribFits) cribPossibleFittings++;
        }

        System.out.println(cribPossibleFittings);
        inp.close();
    }
}