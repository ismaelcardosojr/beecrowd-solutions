/*
In this issue you will find a set of several words, and you have to say if the set is good or bad (Conjunto Bom or Conjunto Ruim, respectively).
By definition, a set is bad when one word of this set is a prefix of another word. Otherwise, this is considered a good set.

For example, {abc, dae, abcde} is a bad set, because abc is a prefix of abcde. When two words are equal, we defined that one word is a prefix 
of the other.
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class B2087 {

    private static final BufferedReader IN = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter OUT = new BufferedWriter(new OutputStreamWriter(System.out));

    private static boolean isAnotherWordPrefix(String searchWord, ArrayList<String> allWords) {
        for (int i = allWords.size() - 1; i >= 0 ; i--) {
            String currentWord = allWords.get(i);

            int shortestWordLength = Math.min(currentWord.length(), searchWord.length());
            boolean prefixCaught = true;

            for (int j = 0; j < shortestWordLength; j++) {
                char currentWordChar = currentWord.charAt(j);
                char checkedWordChar = searchWord.charAt(j);

                if (currentWordChar != checkedWordChar) {
                    prefixCaught = false;
                    break;
                }
            }

            if (prefixCaught) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        ArrayList<String> allWords = new ArrayList<>();

        while (true) {
            int totalWordsAhead = Integer.parseInt(IN.readLine());

            if (totalWordsAhead == 0) {
                break;
            }

            boolean setIsGood = true;

            for (int i = 0; i < totalWordsAhead; i++) {
                String newWord = IN.readLine();

                if (i != 0 && setIsGood) {
                    setIsGood = isAnotherWordPrefix(newWord, allWords);
                }

                allWords.add(newWord);
            }

            OUT.write(setIsGood ? "Conjunto Bom\n" : "Conjunto Ruim\n");

            allWords.clear();
        }

        OUT.flush();
    }
    
}