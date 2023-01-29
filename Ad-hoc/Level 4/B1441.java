/*
Consider the sequence formed by starting from a positive integer H and iterating with N = 1, 2, . . . the following definition until H = 1:

H​ = { 1/2 × H, if H is even;

H​ = { 3 × H + 1, if H is odd.

For instance, if we start with H = 5 the following sequence is generated: 5, 16, 8, 4, 2, 1. If we start with h0 = 11, the sequence generated is 11, 34, 17, 
52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1.

As you can see from these examples, the numbers go up and down, but eventually comes down to end in 1 (at least for all numbers that have ever been tried). 
These sequences are called Hailstone sequences because they are similar to the formation of hailstones, which get carried upward by the winds over and over 
again before they finally descend to the ground.

In this problem, given a positive integer, your task is to compute the highest number in the Hailstone sequence which starts with the given number.
*/

import java.util.Scanner;

public class B1441 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        while (true) {
            int start = inp.nextInt();
            if (start == 0) break;

            int hailstone = start, highestNum = 1;

            while (hailstone != 1) {
                if (hailstone > highestNum) highestNum = hailstone;

                if (hailstone % 2 == 0) hailstone /= 2;
                else hailstone = 3 * hailstone + 1;
            }

            System.out.println(highestNum);
        }

        inp.close();
    }
}