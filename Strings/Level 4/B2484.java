/*
In the 22st century, a devastating disease reached more than half the world population. The government is desperate for a cure because there's 
a high risk that the disease will decimate the entire population. The hospitals are crowded and the grief in people's eyes is remarkable.

At this time, few people have free access to the internet, but you are one of them. As you scour the web, you've found some scattered texts 
about an amulet of a magic word written in the shape of a triangle that heals lethal diseases. Skeptic but hopeful, you remembered that Mr. 
Severino's library had a somewhat unusual book with an unusual cover.

Then you went to the library immediately. Once there, you read only the book preface and confirmed everything you've read about the amulets 
in the web, then you gave yourself a mission: spread magic words in the web in the shape of a triangle in order to warn people that there may 
be a cure for the disease. Hence, if amulets with magic words end up being made in large scale and these are given to people, the disease may 
be annihilated and the population saved.

In order to complete this mission, you must start with the simplest move: write a program that takes a word as input and outputs it as a 
triangle, just like the book's cover.
*/

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class B2484 {

    public static void main(String[] args) throws IOException {
        Scanner inp = new Scanner(System.in);
        ArrayList<Character> wordChars = new ArrayList<>();
        StringBuilder out = new StringBuilder();

        while (inp.hasNext()) {
            int paddingNum = 0;
            
            String word = inp.nextLine();

            for (int i = 0; i < word.length(); i++) {
                char newChar = word.charAt(i);
                wordChars.add(newChar);
            }

            for (int i = 0; i < word.length(); i++) {
                out.setLength(0);

                for (int j = 0; j < wordChars.size(); j++) {
                    char thisChar = wordChars.get(j);

                    if (j != 0) {
                        out.append(" ");
                    }

                    out.append(thisChar);
                }

                if (i == 0) {
                    paddingNum = out.length();
                }

                System.out.printf("%" + (paddingNum--) + "s\n", out);
                wordChars.remove(wordChars.size() - 1);
            }

            System.out.print("\n");
            wordChars.clear();
        }

        inp.close();
    }
}