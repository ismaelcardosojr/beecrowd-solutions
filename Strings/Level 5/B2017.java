/*
The problem is simple. Given a string(x) and 5 other strings, find the string with the least edit distance with x.

If the value of this edit distance is greater than k, print -1.
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B2017 {

    private static final BufferedReader IN = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter OUT = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        final int TOTAL_COMPARISONS = 5;

        String ref = IN.readLine();
        int editLimit = Integer.parseInt(IN.readLine());

        int smallestEditCount = 100000;
        int smallestECTermIndex = 0;

        for (int c = 1; c <= TOTAL_COMPARISONS; c++) {
            String term = IN.readLine();

            int shortestLength = Math.min(ref.length(), term.length());
            int editCount = (ref.length() == shortestLength) ? 0 : ref.length() - term.length();

            for (int i = 0; i < shortestLength; i++) {
                char refChar = ref.charAt(i);
                char termChar = term.charAt(i);
    
                if (refChar != termChar) {
                    editCount++;
                }
            }

            if (editCount < smallestEditCount) {
                smallestEditCount = editCount;
                smallestECTermIndex = c;
            }
        }

        OUT.write(smallestEditCount > editLimit ? "-1" : smallestECTermIndex + "\n" + smallestEditCount);
        OUT.write("\n");

        OUT.flush();
    }

}