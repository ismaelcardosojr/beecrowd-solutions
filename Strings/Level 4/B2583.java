/*
The great hero Chapolout will help an inventor, and there he meets his son-in-law, who had evil intentions. To tempt him to change his mind, 
Chapolout tells the story of Tausfo and Mephistophetrist. Tausfo was a man of very advanced age, and he was in love with a woman much younger 
than he. One day, he receives the visit of Mephistophetrist, a demon who Offers him a tool, called Chirrin Chirrion, which brought or removed 
things as they were told. To bring something, he had to say what he wanted, followed by the word Chirrin, and to drive away something, he had 
to say what he did not want, followed by the word Chirrion. Any other word said, would not take effect. After so much use, Mephistophetrist 
returns and says he will take his soul with him, unless he returns everything he had asked for. Help Tausfo! Write a program that - given the 
uses of the tool - bring together everything Tausfo has acquired with Chirrin Chirrion.


Consider that before he possessed nothing, that a Chirrion will only have effect if he has such a thing dictated, and that a Chirrin will only 
have effect if he does not yet possess such thing, that is, he can not have two Copies of the same thing.


For each test case, print out the word TOTAL, followed by the list of things Tausfo has in alphabetical order.
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class B2583 {

    private static final BufferedReader IN = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter OUT = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        HashSet<String> distinctThings = new HashSet<>();

        int casesAhead = Integer.parseInt(IN.readLine());

        for (int c = 0; c < casesAhead; c++) {
            int usesAhead = Integer.parseInt(IN.readLine());

            for (int u = 0; u < usesAhead; u++) {
                String[] wish = IN.readLine().split(" ");

                String wishedThing = wish[0];
                String wishType = wish[1];

                if (wishType.equals("chirrin")) {
                    distinctThings.add(wishedThing);
                } else if (wishType.equals("chirrion")) {
                    distinctThings.remove(wishedThing);
                }
            }

            OUT.write("TOTAL\n");

            distinctThings.stream().sorted().forEach(currentThing -> {
                try {
                    OUT.write(currentThing + "\n");
                } catch (IOException e) {}
            });

            OUT.flush();

            distinctThings.clear();
        }
    }

}