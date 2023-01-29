/*
The inhabitants of the planet Uno have a terrible numbers detection problem with more than one digit, so that, for everything that will make transform any 
integer value in a one-digit number by performing successive sums of the number until it is reduced a digit. For example, the number 999999999991, the planet 
Uno, summing up all the numbers, resulting in 9 + 9 + 9 + 9 + 9 + 9 + 9 + 9 + 9 + 9 + 9 + 1 = 100. Since the number 100 has more than one digit, 
the process repeats, resulting in 0 + 0 + 1 = 1 One of the great difficulties that people have is to compare two numbers and see which one is greater, 
under the rules of the planet.

Write a program that, given two integers, identify which one is the biggest one-digit number.

Each test case begins with two integers N and M ( 0 ≤ N ≤ 10^100, 0 ≤ M ≤ 10^100 ), indicating the two numbers to be compared.
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B1867 {

    public static int reduceNumDigits(String originalNum) {
        if (originalNum.length() == 1) {
            return Integer.parseInt(originalNum);
        }

        int alteredNum = 0;
        
        while (originalNum.length() != 1) {
            alteredNum = 0;

            for (int i = 0; i < originalNum.length(); i++) {
                int thisDigit = Integer.parseInt(originalNum.substring(i, i + 1));
                alteredNum += thisDigit;
            }

            originalNum = String.valueOf(alteredNum);
        }

        return alteredNum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String integers[] = in.readLine().split(" ");

            String firstNum = integers[0];
            String secondNum = integers[1];

            if (firstNum.equals("0") && secondNum.equals("0")) {
                break;
            }

            int firstInt = reduceNumDigits(firstNum);
            int secondInt = reduceNumDigits(secondNum);
            int largestNum = Math.max(firstInt, secondInt);

            if (firstInt == secondInt) out.write("0\n");
            else if (largestNum == firstInt) out.write("1\n");
            else out.write("2\n");

            out.flush();
        }

        in.close();
    }
}