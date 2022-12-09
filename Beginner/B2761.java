/* 
Your teacher would like to make a program with the following characteristics:

Create an integer variable;
Create a real variable of simple precision;
Create a variable that stores a character;
Create a variable that stores a phrase of max 50 characters;
Read all variables in the order of the created form;
Print out all variables as read;
Print the variables, separating them by tabulation (8 spaces), in the order they were read;
Print the variables with exactly 10 spaces.
*/

import java.io.IOException;
import java.util.Scanner;

public class B2761 {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int I;
        float F;
        char C;
        String S1, cut[], S2;

        I = in.nextInt();
        F = in.nextFloat();
        C = in.next().charAt(0);
        S1 = in.nextLine();

        cut = S1.split("");
        S2 = "";

        for (int i = 1; i < cut.length; i++) {
            S2 += cut[i];
        }

        System.out.printf("%d%.6f%s%s\n", I, F, C, S2);
        System.out.printf("%d\t%.6f\t%s\t%s\n", I, F, C, S2);
        System.out.printf("%10d%10.6f%10s%10s\n", I, F, C, S2);

        in.close();
    }
}