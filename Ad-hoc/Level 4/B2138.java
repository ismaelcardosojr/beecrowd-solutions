/*
In Nlogonia, several programmers participate in a cryptography competition named "Decrypt it!", in which the one who decrypt more messages wins.

In the middle of the competition, you notice that to continue and decrypt a message, you must solve the following challenge: find the most frequent digit of a 
number with up to 1001 digits.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class B2138 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> allDigits = new ArrayList<>();
        HashSet<Integer> onlyDistinctDigits = new HashSet<>();

        while (true) {
            String testNum = in.readLine();
            if (testNum == null) break;

            int mostFrequentDigit = 0;
            int mostFrequentDigitFrequency = 0;

            for (int i = 0; i < testNum.length(); i++) {
                int newDigit = Integer.parseInt(testNum.substring(i, i + 1));

                allDigits.add(newDigit);
                onlyDistinctDigits.add(newDigit);
            }

            for (Integer thisDigit : onlyDistinctDigits) {
                int thisDigitFrequency = Collections.frequency(allDigits, thisDigit);

                if (thisDigitFrequency > mostFrequentDigitFrequency) {
                    mostFrequentDigitFrequency = thisDigitFrequency;
                    mostFrequentDigit = thisDigit;
                } else if (thisDigitFrequency == mostFrequentDigitFrequency) {
                    mostFrequentDigit = Math.max(thisDigit, mostFrequentDigit);
                }
            }

            System.out.println(mostFrequentDigit);

            allDigits.clear();
            onlyDistinctDigits.clear();
        }

        in.close();
    }
}