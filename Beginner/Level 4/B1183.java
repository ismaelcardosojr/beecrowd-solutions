/*
Read an uppercase character that indicates an operation that will be performed in an array M[12][12]. Then, calculate and print the sum or 
average considering only that numbers that are above the main diagonal of the array.
*/

import java.util.Scanner;

public class B1183 {

    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);
        double m[][] = new double[12][12], sum = 0;
        int totalSquares = 0;

        String answer = inp.nextLine();

        for (int line = 0; line < 12; line++) {
            for (int column = 0; column < 12; column++) {
                m[line][column] = inp.nextDouble();
            }
        }

        for (int line = 0, start = 1; line < 12; line++, start++) {
            for (int column = start; column < 12; column++) {
                sum += m[line][column];
                totalSquares++;
            }
        }

        if (answer.equals("S")) {
            System.out.printf("%.1f\n", sum);
        } else if (answer.equals("M")) {
            System.out.printf("%.1f\n", (sum / totalSquares));
        }

        inp.close();
    }
}