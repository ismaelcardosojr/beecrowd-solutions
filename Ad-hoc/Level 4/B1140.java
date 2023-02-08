/*
Fiona has always loved poetry, and recently she discovered a fascinating poetical form. Tautograms are a special case of alliteration, which 
is the occurrence of the same letter at the beginning of adjacent words. In particular, a sentence is a tautogram if all of its words start 
with the same letter.

For instance, the following sentences are tautograms:
- Flowers Flourish from France
- Sam Simmonds speaks softly
- Peter pIckEd pePPers
- truly tautograms triumph

Fiona wants to dazzle her boyfriend with a romantic letter full of this kind of sentences. Please help Fiona to check if each sentence she 
wrote down is a tautogram or not.
*/

import java.io.IOException;
import java.util.Scanner;

public class B1140 {

    public static void main(String[] args) throws IOException {
        Scanner inp = new Scanner(System.in);

        String sentence, sentenceWords[];
        boolean tautogram;

        while (true) {
            tautogram = true;

            sentence = inp.nextLine().toLowerCase();

            if (sentence.equals("*")) {
                break;
            }

            sentenceWords = sentence.split(" ");

            for (int i = 0; i < sentenceWords.length - 1; i++) {
                char currentWordFirstLetter = sentenceWords[i].charAt(0);
                char nextWordFirstLetter = sentenceWords[i + 1].charAt(0);

                if (currentWordFirstLetter != nextWordFirstLetter) {
                    tautogram = false;
                    break;
                }
            }

            System.out.println((tautogram) ? "Y" : "N");
        }

        inp.close();
    }
}