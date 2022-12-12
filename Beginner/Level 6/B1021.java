/* 
Read a value of floating point with two decimal places. This represents a monetary value. After this, calculate the smallest possible number of notes and 
coins on which the value can be decomposed. The considered notes are of 100, 50, 20, 10, 5, 2. The possible coins are of 1, 0.50, 0.25, 0.10, 0.05 and 0.01. 
Print the message “NOTAS:” followed by the list of notes and the message “MOEDAS:” followed by the list of coins.
*/

import java.io.IOException;
import java.util.Scanner;

public class B1021 {

    public static void main(String[] args) throws IOException {
        double value, coins;
        int valueInt, leftOver;
        Scanner input = new Scanner(System.in);

        value = input.nextDouble();

        valueInt = (int) value;
        coins = value - valueInt;

        System.out.println("NOTAS:");
        System.out.println(valueInt / 100 + " nota(s) de R$ 100.00");
        leftOver = valueInt - ((valueInt / 100) * 100);
        System.out.println(leftOver / 50 + " nota(s) de R$ 50.00");
        leftOver = leftOver - ((leftOver / 50) * 50);
        System.out.println(leftOver / 20 + " nota(s) de R$ 20.00");
        leftOver = leftOver - ((leftOver / 20) * 20);
        System.out.println(leftOver / 10 + " nota(s) de R$ 10.00");
        leftOver = leftOver - ((leftOver / 10) * 10);
        System.out.println(leftOver / 5 + " nota(s) de R$ 5.00");
        leftOver = leftOver - ((leftOver / 5) * 5);
        System.out.println(leftOver / 2 + " nota(s) de R$ 2.00");
        leftOver = leftOver - ((leftOver / 2) * 2);

        System.out.println("MOEDAS:");
        System.out.println(leftOver + " moeda(s) de R$ 1.00");
        System.out.println((int) (coins / 0.50) + " moeda(s) de R$ 0.50");
        coins = coins - ((int) (coins / 0.50) * 0.50);
        System.out.println((int) (coins / 0.25) + " moeda(s) de R$ 0.25");
        coins = coins - ((int) (coins / 0.25) * 0.25);
        System.out.println((int) (coins / 0.10) + " moeda(s) de R$ 0.10");
        coins = coins - ((int) (coins / 0.10) * 0.10);
        System.out.println((int) (coins / 0.05) + " moeda(s) de R$ 0.05");
        coins = coins - ((int) (coins / 0.05) * 0.05);

        if (coins == 0.009999999999999995) {
            coins = 0.01;
        }

        System.out.println((int) (coins / 0.01) + " moeda(s) de R$ 0.01");
    }
}