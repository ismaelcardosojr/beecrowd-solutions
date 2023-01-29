/*
Now that Mangojata solved some problems using getline, she is able to take a step forward. She is about to make a new program to help her sister, Overlaine. 
Overlaine is a seller of shoes and by a neglect, mixed all shoes of each box. Now she wants to inform any number N and count how many shoes of this size (N) 
exists inside a specific box. The problem is that Overlaine have no any idea how many shoes are in each box. The only thing we know is that each footwear may 
be numbered 20-44, and may be male or female.

Print a blank line between the outputs for two consecutive test cases.
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B1218 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder result = new StringBuilder();

        for (int thisCase = 1; true; thisCase++) {
            int totalEqualPairs = 0;
            int equalFemininePairs = 0, equalMasculinePairs = 0;

            String shoeSizeRequired = in.readLine();
            if (shoeSizeRequired == null) break;

            String shoePairs[] = in.readLine().split(" ");

            for (int i = 0; i < shoePairs.length; i += 2) {
                String currentShoeSize = shoePairs[i];
                char currentShoeGender = shoePairs[i + 1].charAt(0);

                if (currentShoeSize.equals(shoeSizeRequired)) {
                    totalEqualPairs++;

                    if (currentShoeGender == 'F') equalFemininePairs++;
                    else equalMasculinePairs++;
                }
            }

            if (thisCase != 1) {
                result.append("\n");
            }

            result.append("Caso " + thisCase + ":\n");
            result.append("Pares Iguais: " + totalEqualPairs + "\n");
            result.append("F: " + equalFemininePairs + "\n");
            result.append("M: " + equalMasculinePairs + "\n");

            out.write(result.toString());
            out.flush();

            result.setLength(0);
        }

        in.close();
    }
}