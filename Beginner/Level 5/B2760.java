/* 
Your teacher would like to make a program with the following characteristics:

Create 3 variables to store a phrase of up to 100 characters;
Read a sentence for the first variable;
Read a sentence for the second variable;
Read a sentence for the third variable;
Print the first variable read in step 2, the second variable read in step 3, the third variable read in step 4. Be sure to skip line;
Print the first variable read in step 3, the second variable read in step 4, the third variable read in step 2. Be sure to skip line;
Print the first variable you read in step 4, the second variable you read in step 2, the third variable you read in step 3. Be sure to skip line;
Repeat procedure 5, printing only 10 characters of each variable.
*/

import java.io.IOException;
import java.util.Scanner;

public class B2760 {

    public static void main(String[] args) throws IOException {
        Scanner inp = new Scanner(System.in);
        StringBuilder out = new StringBuilder();

        String A, B, C, buffer;

        A = inp.nextLine();
        B = inp.nextLine();
        C = inp.nextLine();

        for (int i = 0; i < 4; i++) {
            if (i == 3) {
                if (A.length() > 10)
                    A = A.substring(0, 10);
                if (B.length() > 10)
                    B = B.substring(0, 10);
                if (C.length() > 10)
                    C = C.substring(0, 10);
            }

            out.append(A).append(B).append(C);
            System.out.println(out);

            out.setLength(0);

            buffer = A;
            A = B;
            B = C;
            C = buffer;
        }

        inp.close();
    }
}