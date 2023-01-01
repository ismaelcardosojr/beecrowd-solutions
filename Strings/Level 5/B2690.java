/*
A new set of authentication will be implemented at the Federal Institute of South of Minas, Muzambinho campus, so users will not have much difficulty, 
plus you... Well, the new authentication service is safe, without bugs and headaches even though we are at the end of the semester. 
It will allow your password to have spaces, but not numbers or special characters. The update always occurs during the vacation period, 
so tpdps adjustments are made and in the end please all users. As a trainee at the school's support center, your duty is to implement the new authentication. 
For now the new standard for user names is being studied.

As we can see for each set of letters we will have a specific number. Make a bad program to do this conversion of the letters to the numbers, 
and since you will not access the passwords of the students, make an algorithm so that the same one does the process alone using its own test cases.

Note: Your test cases can not exceed 20 character and the output, 12 digits.
*/

import java.io.IOException;
import java.util.Scanner;

public class B2690 {

    public static final int passwordMaxLength = 12;

    public static char getNewChar(char oldChar) {
        if (oldChar == 'G' || oldChar == 'Q'
                || oldChar == 'a' || oldChar == 'k' || oldChar == 'u') {
            return '0';
        }

        if (oldChar == 'I' || oldChar == 'S'
                || oldChar == 'b' || oldChar == 'l' || oldChar == 'v') {
            return '1';
        }

        if (oldChar == 'E' || oldChar == 'O' || oldChar == 'Y'
                || oldChar == 'c' || oldChar == 'm' || oldChar == 'w') {
            return '2';
        }

        if (oldChar == 'F' || oldChar == 'P' || oldChar == 'Z'
                || oldChar == 'd' || oldChar == 'n' || oldChar == 'x') {
            return '3';
        }

        if (oldChar == 'J' || oldChar == 'T'
                || oldChar == 'e' || oldChar == 'o' || oldChar == 'y') {
            return '4';
        }

        if (oldChar == 'D' || oldChar == 'N' || oldChar == 'X'
                || oldChar == 'f' || oldChar == 'p' || oldChar == 'z') {
            return '5';
        }

        if (oldChar == 'A' || oldChar == 'K' || oldChar == 'U'
                || oldChar == 'g' || oldChar == 'q') {
            return '6';
        }

        if (oldChar == 'C' || oldChar == 'M' || oldChar == 'W'
                || oldChar == 'h' || oldChar == 'r') {
            return '7';
        }

        if (oldChar == 'B' || oldChar == 'L' || oldChar == 'V'
                || oldChar == 'i' || oldChar == 's') {
            return '8';
        }

        if (oldChar == 'H' || oldChar == 'R'
                || oldChar == 'j' || oldChar == 't') {
            return '9';
        }

        return oldChar;
    }

    public static void main(String[] args) throws IOException {
        Scanner inp = new Scanner(System.in);
        StringBuilder newPassword = new StringBuilder();

        int totalTestCases = inp.nextInt();
        inp.nextLine(); // cleaning the buffer

        for (int i = 0; i < totalTestCases; i++) {
            String oldPassword = inp.nextLine();

            for (int j = 0; j < oldPassword.length(); j++) {
                if (newPassword.length() == passwordMaxLength) {
                    break;
                }

                char oldChar = oldPassword.charAt(j);
                char newChar = getNewChar(oldChar);

                if (newChar != oldChar) {
                    newPassword.append(newChar);
                }
            }

            System.out.println(newPassword);
            newPassword.setLength(0);
        }

        inp.close();
    }
}