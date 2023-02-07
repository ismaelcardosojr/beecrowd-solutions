/*
Your English teacher loves to bring new stuff to the class, and today it wasn't different. There is a city, according to your teacher, where the people take
really seriously the way they talk to each other. In particular, when two people are talking, they think a lot in the sentence that they are going to say
before they say it, so that they can ensure their sentence will be a “full sentence”, or maybe an “almost full sentence”.

Considering our 26 letters alphabet, a sentence is “full” if, and only if, it has all the letters of our alphabet in it. In a similar way, a sentence is
“almost full” if, and only if, it is not “full”, but has at least half of the letters of our alphabet in it. When a sentence is not “full” neither “almost 
full”, it is “poorly designed”.

Your teacher gave you a really hard task: given several sentences exchanged between several people from the quoted city, say in which of the given categories 
each sentence fits in.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1551 {

    public static int countPhraseDistinctLetters(String testPhrase) {
        int phraseDistinctLetters = 0;

        for (int decimalASCII = 97; decimalASCII < 123; decimalASCII++) {
            char thisLetter = (char) decimalASCII;

            if (testPhrase.contains(thisLetter + "")) {
                phraseDistinctLetters++;
            }
        }

        return phraseDistinctLetters;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int totalCases = Integer.parseInt(in.readLine());

        for (int i = 0; i < totalCases; i++) {
            String testPhrase = in.readLine();

            int phraseDistinctLetters = countPhraseDistinctLetters(testPhrase);

            if (phraseDistinctLetters == 26) System.out.println("frase completa");
            else if (phraseDistinctLetters >= 13) System.out.println("frase quase completa");
            else System.out.println("frase mal elaborada");
        }

        in.close();
    }
}