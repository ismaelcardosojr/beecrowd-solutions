/*
Before the Hispanic colonization and then the English one, the region of San Antonio was dominated by Indians ahmoc-axhozupeck, ancestors of 
the Sioux and Apaches. Ethnicity was completely destroyed by the colonists in the eighteenth century, making impossible the task of 
deciphering their large panels.

The Department of Archaeology at Baylor University devotes much of his research to the panels of Ahmoc Indians. Surprisingly the Indians 
already knew the Hindu numerals, but they did not use it for calculations (after all trade in that civilization did not exist). Baylor 
archaeologists suspect that the panels full of numbers were merely decorative. Also suspect that some patterns that recurred were signatures 
of the artists in order to ensure the authenticity of the panel.

Your task in this problem is to see if the panels are true, ie, if, indeed, contain the signature of the artist that the archaeologist 
suspected to be the author.
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B2049 {

    private static final BufferedReader IN = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter OUT = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        for (int instance = 1; true; instance++) {
            String artistSignature = IN.readLine();

            if (artistSignature.equals("0")) {
                break;
            }

            String sequenceNumber = IN.readLine();

            if (instance != 1) {
                OUT.write("\n");
            }

            OUT.write("Instancia " + instance);
            OUT.write((sequenceNumber.contains(artistSignature)) ? "\nverdadeira\n" : "\nfalsa\n");
        }

        OUT.flush();

        IN.close();
        OUT.close();
    }
}