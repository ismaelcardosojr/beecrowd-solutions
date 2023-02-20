/*
Grace Murray Hopper, also known as "COBOL Grandma", was a Systems Analyst and US Navy Admiral in the 1940s and 1950s. Grace created the 
Flow-Matic programming language that served as the foundation for the creation of COBOL, in addition, she also participated in the creation 
of the first COBOL compiler. Also known to have been the creator of the term BUG occasionally when she discovered a problem in its computer 
and realized that it was a dead insect in the valve, since at that time the computers were formed by valves. Since then the term BUG has been 
used for errors. Grace Hopper is one of the most important women in the history of female participation in computing, taking her name at one 
of the most important conferences, Grace Hopper Celebration of Women in Computing.

In this problem are given five words in each test line separated by hyphen. For each line the word 'GRACE HOPPER' will be printed if the 
letters that form the word COBOL are found in the beginning or end of each word in order. If it does not find, the word 'BUG' will be printed.
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B2728 {

    private static final BufferedReader IN = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter OUT = new BufferedWriter(new OutputStreamWriter(System.out));

    private static boolean doesFormTermThroughWords(String[] words) {
        String searchedTerm = "cobol";

        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];

            String firstChar = currentWord.substring(0, 0 + 1);
            String lastChar = currentWord.substring(currentWord.length() - 1, currentWord.length());
            String searchedChar = searchedTerm.substring(i, i + 1);

            if (!firstChar.equalsIgnoreCase(searchedChar) && !lastChar.equalsIgnoreCase(searchedChar)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        while (true) {
            String phrase = IN.readLine();

            if (phrase == null) {
                break;
            }

            String[] phraseWords = phrase.split("-");
            boolean phraseHasTerm = doesFormTermThroughWords(phraseWords);

            OUT.write((phraseHasTerm) ? "GRACE HOPPER\n" : "BUG\n");
        }

        OUT.flush();

        IN.close();
        OUT.close();
    }
}