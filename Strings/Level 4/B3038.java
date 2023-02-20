/*
Mister Klaus receives the most diverse letters from children all over the world. Every year, with no exceptions, he selects some of the cooler
Christmas letters to give them more attention. This year, one of these letters caught the eye of Klaus for a particular reason the letter was
encrypted! Inside the envelope, there was the letter with the Christmas request and an attached note that said:

"Mister Santa Klaus: I imagine that you must receive thousands of Christmas letters every year, and maybe it must be annoying to read all of
them without a challenge. I hope that my letter brings you a bit of fun! I changed all word vowels by symbols. Use this table to correctly
read my request!"

a = @
e = &
i = !
o = *
u = #

Let's help Santa to translate this letter?
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B3038 {

    private static final BufferedReader IN = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter OUT = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        while (true) {
            String encryptedLetter = IN.readLine();

            if (encryptedLetter == null) {
                break;
            }

            char[] allSymbols = "@&!*#".toCharArray();
            char[] allReplacements = "aeiou".toCharArray();

            for (int i = 0; i < allSymbols.length; i++) {
                char currentVowel = allSymbols[i];
                char currentVowelReplacement = allReplacements[i];

                if (encryptedLetter.contains(currentVowel + "")) {
                    encryptedLetter = encryptedLetter.replace(currentVowel, currentVowelReplacement);
                }
            }

            OUT.write(encryptedLetter + "\n");
        }

        OUT.flush();

        IN.close();
        OUT.close();
    }
}