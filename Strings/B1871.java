/* 
One day Prof. Humberto José Roberto made ​​the following question: If the zero to the left of a number has no value, why would other positions of a number? 
Analyzing as follows, it asks for your help, to add two integer values​, the result is displayed according to his reasoning, that is, without the zeros. 
For example, to add 15 + 5, the result would be 20, but with this new idea, the new result would be 2, and to add 99 + 6, the result would be 105, 
but with this new idea, the new result would be 15.

Write a program that, given two integers without the digit zero, some the same and, if the result has a zero digit, which remove them before display.
*/

import java.io.IOException;
import java.util.Scanner;

public class B1871 {

    public static void main(String[] args) throws IOException {
        Scanner inp = new Scanner(System.in);
        int firstOperando, secondOperando;
        int sum;

        while (true) {
            firstOperando = inp.nextInt();
            secondOperando = inp.nextInt();

            if (firstOperando + secondOperando == 0) break;

            sum = firstOperando + secondOperando;
            char[] resultDigits = String.valueOf(sum).toCharArray();

            for (char thisDigit : resultDigits) {
                if (thisDigit != '0') System.out.print(thisDigit);
            }

            System.out.print("\n");
        }

        inp.close();
    }
}