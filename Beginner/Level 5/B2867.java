/*
Given two integers, n and m, how many digits have nm?

Examples:

2 and 10 - 210 = 1024 - 4 digits
3 and 9 - 39 = 19683 - 5 digits
*/

import java.io.IOException;
import java.util.Scanner;

public class B2867 {

    public static void main(String[] args) throws IOException {
        Scanner inp = new Scanner(System.in);

        int totalTestCases;
        int base, exponent;
        double result;

        totalTestCases = inp.nextInt();

        for (int i = 0; i < totalTestCases; i++) {
            base = inp.nextInt();
            exponent = inp.nextInt();

            result = 1 + (Math.log10(base) * exponent);

            System.out.printf("%.0f\n", Math.floor(result));
        }

        inp.close();
    }
}