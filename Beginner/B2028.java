/* 
Hyam is a guy that loves sequences. He is finding interesting sequences that even Fibonacci would not have imagined. 
One day Hyam saw that given a number N, he could make a sequence like 0 1 2 2 3 3 3 4 4 4 …N N N … N. However, Hyam saw that each value that 
increased in the sequence number, the total quantity increases at a factorial rate. In this case, instead of multiplying, you add the total number of 
numbers to the sequence with the value of the next number in the sequence. For example, if N = 2. The correct sequence would be 0 1 2 2, which is 4 digits. 
Now, if N = 3, the next number in the sequence would have the value 3, so the total quantity of numbers in the sequence would bem the quantiy of numbers 
with N = 2, which is 4, plus the value of the next number in the sequence, in this case 3, giving you 7, since the correct sequence for N = 3 is 0 1 2 2 3 3 3.

Your task is make an algorithm that given a integer N, has as answer the total quantity of numbers of this sequence and below the complete sequence.
*/

import java.io.IOException;
import java.util.Scanner;

public class B2028 {

    public static void main(String[] args) throws IOException {
        Scanner inp = new Scanner(System.in);

        for (int caso = 1; inp.hasNext(); caso++) {
            StringBuilder output = new StringBuilder();
            output.append("0");
            int totalElements = 1;

            int number = inp.nextInt();

            for (int i = 1; i <= number; i++) {
                for (int count = 0; count < i; count++) {
                    output.append(" " + i);
                    totalElements++;
                }
            }

            if (number != 0)
                System.out.printf("Caso %d: %d numeros\n", caso, totalElements);
            else
                System.out.printf("Caso %d: %d numero\n", caso, totalElements);

            System.out.println(output.toString() + "\n");
        }

        inp.close();
    }
}