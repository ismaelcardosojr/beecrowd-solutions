/*
Sinc analogue-dial telephones, it was customary in some countries to associate some letters with dial numbers, so that one could assign a 
telephone number to a easily memorized word.

This practice is not very common in Brazil, but there are some companies that use it, an example is an insurance company, which discloses as 
a telephone number: "333-PORTO". By making an association between letters and numbers, the actual telephone number is: "33376786" (the '-' 
symbol is discarded). Currently, as telephones accept voice dialing, dictating a number stored in letters and words requires a translation. 
You have been prompted for a program that receives text representing a phone number and returns the actual phone number.


For each entry the output is a telephone dial number, on a single line, which can also contain the '*' and '#' symbols as dial numbers. 
Any letter must be translated into the corresponding number, any other symbols are simply discarded.
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class B2678 {

    private static final BufferedReader IN = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter OUT = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final HashMap<Character, Integer> DIALER = bootDialer();

    private static HashMap<Character, Integer> bootDialer() {
        HashMap<Character, Integer> dialer = new HashMap<>();

        for (int dec = 65, key = 2, letterCount = 1; dec < 91; dec++, letterCount++) {
            char letter = (char) dec;
            int countLimit = (key == 7 || key == 9) ? 4 : 3;

            dialer.put(letter, key);

            if (letterCount == countLimit) {
                letterCount = 0;
                key++;
            }
        }

        return dialer;
    }

    public static void main(String[] args) throws IOException {
        while (true) {
            String telephone = IN.readLine();

            if (telephone == null) {
                break;
            }

            telephone = telephone.toUpperCase();

            for (int i = 0; i < telephone.length(); i++) {
                char currentChar = telephone.charAt(i);

                if (Character.isDigit(currentChar) || "*#".contains(currentChar + "")) {
                    OUT.write(currentChar);
                } else if (Character.isLetter(currentChar)) {
                    OUT.write(DIALER.get(currentChar) + "");
                }
            }

            OUT.write("\n");
        }

        OUT.flush();
    }

}