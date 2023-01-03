/*
Computers have made their way into a significant percentage of the homes in the world, and as programmers we are responsible for designing user interfaces that
everyone can use. User interfaces need to be flexible so that if a user makes some non-fatal error, the interface can still figure out what the user meant.

Your task is to write a program which processes a text input representing an integer, however, because this is a friendly user interface, we cut the user a 
little more slack:

1. If the user types the letter "O" or "o", we assume that they meant the digit "0".
2. If the user types the letter "l", we assume that they meant the digit "1".
3. Commas and spaces are allowed, but are not processed (ignore them).

If the user has still not entered a valid non-negative integer (even with the rules above), print the string "error". Overflow (a value greater than 2147483647) 
is considered invalid and "error" should be printed.

Note: an empty string does not represent a valid integer.
*/

import java.io.IOException;
import java.util.Scanner;

public class B1287 {

    public static boolean validateOriginalText(String originalText) {
        if (originalText.isBlank() || originalText.contains("-")) {
            return true;
        }

        return false;
    }

    public static String handleWrongInput(String textBeingHandled) {
        // Handling wrong representation of the number 0:
        textBeingHandled = textBeingHandled.replace("o", "0");
        textBeingHandled = textBeingHandled.replace("O", "0");

        // Handling wrong representation of the number 1:
        textBeingHandled = textBeingHandled.replace("l", "1");

        // Handling commas and spaces:
        textBeingHandled = textBeingHandled.replace(",", "");
        textBeingHandled = textBeingHandled.replace(" ", "");

        return textBeingHandled;
    }

    public static Integer convertStringToInt(String stringBeingConverted) {
        try {
            return Integer.parseInt(stringBeingConverted);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner inp = new Scanner(System.in);

        while (inp.hasNextLine()) {
            String originalText = inp.nextLine();
            String handledText = handleWrongInput(originalText);

            boolean originalTextIsInvalid = validateOriginalText(originalText);
            Integer conversionResult = convertStringToInt(handledText);

            if (originalTextIsInvalid || conversionResult == null) {
                System.out.println("error");
                continue;
            }

            System.out.println(conversionResult);
        }

        inp.close();
    }
}