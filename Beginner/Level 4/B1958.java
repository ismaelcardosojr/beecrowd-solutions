/*
Floating point numbers can be very long to show. In these cases, it is convenient to use the scientific notation.

You must write a program that, given a floating point number, shows this number in scientific notation: always show the mantissa sign; 
always show the mantissa with 4 decimal places; use the character 'E' between the mantissa and the exponent; always show the exponent sign; 
and show the exponent with at least 2 digits.
*/

import java.util.Scanner;

public class B1958 {

    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);
        
        double num = inp.nextDouble();

        System.out.printf("%+.4E\n", num);

        inp.close();
    }
}
