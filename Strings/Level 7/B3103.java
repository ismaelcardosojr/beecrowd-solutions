/*
Neymar is a very smart boy and loves numbers, he has several little pieces with digits from 0 to 9. He lives assembling many different numbers
with these figures, for example: If Neymar goes to his box where his pieces are kept and picks them up 5, being {5, 8, 6, 8, 0}, it can form 
the numbers 56808, 68805, 88065 among others. It is important to emphasize that the number 08685 is not valid, nor any other number that 
starts with leading zeros.

One day Neymar formed a number that he particularly liked a lot and said that it would be his lucky number, so he left the number formed on 
his bed and said he would get his cell phone to take a picture of that number so he would never forget it.

When he was returning to his room, he slipped and fell on the bed, totally messing up his number. Neymar was very sad, as he had not memorized
what the number was, but he knew a clue: His lucky number was the smallest possible number formed by the figures that were initially messed up.

As the boy is very nervous and sad, he is not able to think straight and form his lucky number again, can you help him?

You will be given a random number that formed after the mess of the digits and you must inform Neymar what your lucky number is.
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;

public class B3103 {

    private static final BufferedReader IN = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter OUT = new BufferedWriter(new OutputStreamWriter(System.out));

    private static ArrayList<Character> getLuckyNumber(ArrayList<Character> digits) {
        digits.sort(Comparator.naturalOrder());
        
        char firstDigit = digits.get(0);

        if (firstDigit == '0') {
            for (int i = 1; i < digits.size(); i++) {
                char nextDigit = digits.get(i);

                if (nextDigit != '0') {
                    digits.set(0, nextDigit);
                    digits.set(i, firstDigit);

                    break;
                }
            }
        }
        
        return digits;
    }

    public static void main(String[] args) throws IOException {
        ArrayList<Character> digits = new ArrayList<>();

        int totalCases = Integer.parseInt(IN.readLine());

        for (int caseNum = 0; caseNum < totalCases; caseNum++) {
            String number = IN.readLine();

            for (int i = 0; i < number.length(); i++) {
                digits.add(number.charAt(i));
            }

            digits = getLuckyNumber(digits);

            for (Character currentDigit : digits) {
                OUT.write(currentDigit);
            }

            digits.clear();

            OUT.write("\n");
        }

        OUT.flush();

        IN.close();
        OUT.close();
    }

}