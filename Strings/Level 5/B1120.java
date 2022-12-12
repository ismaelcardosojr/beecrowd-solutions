/* 
For years, all contracts of the Association of Contracts for Modernization (ACM) were typed using an old typewriter machine.

Recently Mr. Miranda, one of the accountants of the ACM, realized that the machine had a failure in one, and only one, numerical digit. 
More specifically, the flawed digit, when typed, is not printed on the sheet, as if the corresponding key was not pressed. 
He realized that this could have changed the numerical representation of contract values. Worried about accounting, Mr. Miranda wants to know, 
from the original values agreed for the contracts (which he kept in handwritten notes) which values are actually represented in the contracts. 
For example, if the failed digit in the machine is 5, an agreed value of 1500 would be represented in the corresponding contract as 100, 
because the digit 5 would not be printed. Note that Mr. Miranda wants to know the numeric value represented in the contract, ie, in the same machine, 
the number 5000 corresponds to the numeric value 0, not 000 (as it actually appears in the contract).
*/

import java.io.IOException;
import java.util.Scanner;

public class B1120 {

    public static void main(String[] args) throws IOException {
        Scanner inp = new Scanner(System.in);
        StringBuilder out = new StringBuilder();

        while (true) {
            char failedDigit = inp.next().charAt(0);
            char[] contractNum = inp.next().toCharArray();

            if (failedDigit == '0' && contractNum[0] == '0') break;

            for (char thisDigit : contractNum) {
                if (thisDigit != failedDigit) out.append(thisDigit);
            }

            if (out.length() == 0) System.out.println("0");
            else if (out.charAt(0) == '0') System.out.println(Long.parseLong(out.toString()));
            else System.out.println(out);

            out.setLength(0);
        }

        inp.close();
    }
}