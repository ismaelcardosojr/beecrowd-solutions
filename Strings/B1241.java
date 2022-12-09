/* 
Paulinho have again in your hands another problem. Now the teacher asked him to make a new program to verify from two big numbers A and B, 
if B corresponds to the last digit of A.
*/

import java.io.IOException;
import java.util.Scanner;

public class B1241 {

    public static void main(String[] args) throws IOException {
        Scanner inp = new Scanner(System.in);

        int totalTestCases = inp.nextInt();

        for (int i = 0; i < totalTestCases; i++) {
            String firstBigNum = inp.next();
            String secondBigNum = inp.next();

            System.out.println((firstBigNum.endsWith(secondBigNum)) ? "encaixa" : "nao encaixa");
        }

        inp.close();
    }
}