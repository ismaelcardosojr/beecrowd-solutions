/* 
In chats, it is very common among young people and adolescents use strings of letters, which often seem random to represent laughter.

Claudia is a young programmer who was intrigued by the sound of "digital laughter." Some of them she can not even pronounce! 
But she realized that some of them seem better convey the feeling of laughter than others. The first thing she noticed is that the consonants 
do not interfere in how digital laughter influence the feeling of transmission. The second thing she noticed is that the funniest digital 
laughter are those in which the sequences of vowels are the same when read in the natural order (from left to right) or in reverse order (from right to left), 
ignoring consonants. For example, "hahaha" and "huaauhahhuahau" are among the funniest laughs while "riajkjdhhihhjak" and "huehuehue" are not among the funniest.

Claudia is very busy with the statistical analysis of digital laughter and asked for his help to write a program that determines, to a digital laugh, 
if she is the funniest or not.
*/

import java.io.IOException;
import java.util.Scanner;

public class B2242 {

    public static boolean isVowel(char thisChar) {
        String vowels = "aeiou";

        for (int i = 0; i < vowels.length(); i++) {
            char thisVowel = vowels.charAt(i);

            if (thisChar == thisVowel)
                return true;
        }

        return false;
    }

    public static void main(String[] args) throws IOException {
        Scanner inp = new Scanner(System.in);
        StringBuilder laughterVowels = new StringBuilder();

        String testLaughter = inp.nextLine();

        for (int i = 0; i < testLaughter.length(); i++) {
            char thisChar = testLaughter.charAt(i);

            if (isVowel(thisChar))
                laughterVowels.append(thisChar);
        }

        String vowels = laughterVowels.toString();
        String reversedVowels = laughterVowels.reverse().toString();

        System.out.println((vowels.equals(reversedVowels)) ? "S" : "N");

        inp.close();
    }
}