/*
TopCoder decided to automate the process of assigning levels of difficulty to the problems. TopCoder developers concluded that the difficulty
of the problem is related only to average length of the words in the problem statement. If the average length of the words of the statement 
is less than or equal to 3, the problem difficulty receives 250 points. If the average length of the words of the statement is 4 or 5, 
the problem difficulty receives 500 points. If the average length of utterance of words is greater than or equal to 6, the problem difficulty 
receives 1000 points.


Definitions:

- Symbol: A set of characters linked by spaces from both sides, or at the beginning of the description of the problem, or even the end of the 
description of the problem.
- Word: a symbol that contains only letters a-z or A-Z, and can be finished with a single point.
- Word length: number of letters in a word (a point is not a letter).


- Examples of symbols are words (quotes just to exemplify): "AB", "ab".
- Example of symbols that are not words: "ab..", "a.b", ".ab", "a.b.", "a2b.", ".".


The average length of the words is given by the sum of the sizes of the utterance of words divided by the number of words, the division is 
made by integers. If the word count is zero, then the average length of the words is zero.

Your task is given the problem statement, compute its classification of difficulty of the problem, which can be 250, 500, or 1000.
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B1243 {

    private static final BufferedReader IN = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter OUT = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        while (true) {
            String problem = IN.readLine();
            
            if (problem == null) {
                break;
            }

            String[] problemSymbols = problem.split(" ");

            int totalWords = 0, wordsLengthAvg = 0;

            for (String currentSymbol : problemSymbols) {
                int symbolLength = currentSymbol.length();
                boolean itsAWord = true;

                for (int i = 0; i < symbolLength; i++) {
                    char thisChar = currentSymbol.charAt(i);

                    if ("0123456789".contains(thisChar + "") || (thisChar == '.' && i != symbolLength - 1)) {
                        itsAWord = false;
                        break;
                    }
                }

                if (currentSymbol.endsWith(".")) {
                    symbolLength--;
                }

                if (itsAWord && symbolLength > 0) {
                    wordsLengthAvg += symbolLength;
                    totalWords++;
                }
            }

            wordsLengthAvg = (totalWords == 0) ? 0 : wordsLengthAvg / totalWords;

            if (wordsLengthAvg <= 3) OUT.write("250\n");
            else if (wordsLengthAvg >= 6) OUT.write("1000\n");
            else OUT.write("500\n");
        }
        
        OUT.flush();

        IN.close();
        OUT.close();
    }

}