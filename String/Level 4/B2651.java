/*
Link is a famous hero and so receives several letters from his fans. But even being famous, everyone continues to call him Zelda.

Because of this Link is upset, so upset that every times he receives a letter he confers the manner that he fan referred to him in the letter, 
and in case he notices the "zelda" excerpt in the name he gets angry and throws the card away.

Your task is to determine if Link will be angry or not, becacuse of the way your fan has called you in the letter.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2651 {

    public static boolean containsIgnoreCase(String fanLetter, final String forbiddenTerm) {
        final int substringLength = forbiddenTerm.length();

        for (int i = substringLength; i <= fanLetter.length(); i++) {
            String substring = fanLetter.substring(i - substringLength, i);

            if (forbiddenTerm.equalsIgnoreCase(substring)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println(containsIgnoreCase(in.readLine(), "zelda") ? "Link Bolado" : "Link Tranquilo");
    }
}