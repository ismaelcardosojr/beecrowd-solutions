/*
In many languages a rule must be followed when writing any digital text: do not use white spaces before a comma or a period.

Write a program that, given an input text, removes any whitespace that is immediately succeeded by a comma or a period. If there is more than 
one such whitespace, just removes one of them.
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B3088 {

    private static final BufferedReader IN = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter OUT = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        while (true) {
            String phrase = IN.readLine();

            if (phrase == null) {
                break;
            }

            phrase = phrase.replace(" ,", ",");
            phrase = phrase.replace(" .", ".");
    
            OUT.write(phrase + "\n");
        }

        OUT.flush();
    }

}