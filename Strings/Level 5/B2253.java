/*
Rolien and Naej are the developers of a big programming portal. To help the new site registration system, they requested your help. Your job is write a code
that validates passwords that are registered on the portal, for that you should be aware for the following requirements:

- The password must contain at least one uppercase letter, one lowercase letter and a number;
- It can’t have any punctuation character, accent or space;
- Moreover, the password must be 6 to 32 characters.
*/

import java.io.IOException;
import java.util.Scanner;

public class B2253 {

    public static boolean validateUpperAndLowerCaseRule(String password) {
        char passwordChars[] = password.toCharArray();
        boolean noUpperCase = true;
        boolean noLowerCase = true;

        for (char thisChar : passwordChars) {
            if (Character.isUpperCase(thisChar)) {
                noUpperCase = false;
            }

            if (Character.isLowerCase(thisChar)) {
                noLowerCase = false;
            }
        }

        if (noUpperCase || noLowerCase) {
            return false;
        }

        return true;
    }

    public static boolean validateDigitRule(String password) {
        char passwordChars[] = password.toCharArray();

        for (char thisChar : passwordChars) {
            if (Character.isDigit(thisChar)) {
                return true;
            }
        }

        return false;
    }

    public static boolean validatePunctuationRule(String password) {
        char passwordChars[] = password.toCharArray();

        for (char thisChar : passwordChars) {
            if (!Character.isLetterOrDigit(thisChar)) {
                return false;
            }
        }

        return true;
    }

    public static boolean validateSpaceRule(String password) {
        if (password.contains(" ")) {
            return false;
        }

        return true;
    }

    public static boolean validateLengthRule(String password) {
        int passwordLength = password.length();

        if (passwordLength < 6 || passwordLength > 32) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        Scanner inp = new Scanner(System.in);

        while (inp.hasNext()) {
            String password = inp.nextLine();

            boolean hasUpperAndLowerCase = validateUpperAndLowerCaseRule(password);
            boolean hasDigit = validateDigitRule(password);
            boolean hasntPunctuation = validatePunctuationRule(password);
            boolean hasntSpace = validateSpaceRule(password);
            boolean hasProperLength = validateLengthRule(password);

            if (hasUpperAndLowerCase && hasDigit && hasntPunctuation && hasntSpace && hasProperLength) {
                System.out.println("Senha valida.");
            } else {
                System.out.println("Senha invalida.");
            }
        }

        inp.close();
    }
}