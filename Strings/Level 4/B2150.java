/*
Since the Infinite Improbability Drive, many do not question about life on other planets, and deepen in the most unlikely questions, as, for example, is that 
beings from other planets using the same characters we write to? And if this is true, they will use the same vowels like us? With this in mind, many scientists 
have designed various types of alien alphabets, using our alphabet letters, and the digits 0 to 9, with their respective vowels. On this basis, they are asking 
for help to identify vowels in alien alphabets and make counts about.

Write a program that, given a sequence of vowels in a given alien alphabet, to count, in a text written with the same alphabet, how many alien vowels the text 
has.
*/

import java.io.IOException;
import java.util.Scanner;

public class B2150 {

    public static void main(String[] args) throws IOException {
        Scanner inp = new Scanner(System.in);

        while (inp.hasNext()) {
            int totalAlienVowels = 0;

            String alienAlphabet = inp.nextLine();
            String testPhrase = inp.nextLine();

            for (int i = 0; i < alienAlphabet.length(); i++) {
                char thisAlphabetLetter = alienAlphabet.charAt(i);

                for (int j = 0; j < testPhrase.length(); j++) {
                    char thisPhraseLetter = testPhrase.charAt(j);
                    if (thisAlphabetLetter == thisPhraseLetter) totalAlienVowels++;
                }
            }

            System.out.println(totalAlienVowels);
        }

        inp.close();
    }
}