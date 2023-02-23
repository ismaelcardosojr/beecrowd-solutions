/*
Bullshit Bingo is a game to make lectures, seminars or meetings less boring. Every player has a card with 5 rows and 5 columns. Each of the 
25 cells contains a word (the cell in the middle has always the word BINGO written in it). Whenever a player hears a word which is written 
on his card, he can mark it. The cell in the middle is already marked when the game starts. If a player has marked all the words in a row, 
a column or a diagonal, he stands up and shouts BULLSHIT. After this, the game starts over again.

Sitting in a lecture, you observe that some students in the audience are playing Bullshit Bingo. You wonder what the average number of 
different words is until BULLSHIT is exclaimed. For the purpose of this problem, a word consists of letters of the English alphabet 
(a to z or A to Z). Words are separated by characters other than letters (for example spaces, digits or punctuation). Do the comparison 
of words case-insensitively, i.e., Bingo is the same word as bingo. When counting the number of different words, ignore the word BULLSHIT 
(indicating the end of the game), and consider only the words of the current game, i.e., if a word has already occurred in a previous game, 
you may still count it in the current game. If the last game is unfinished, ignore the words of that game.


The input file consists of the text of the lecture, with BULLSHIT occurring occasionally. The first game starts with the first word in the 
input. Each occurrence of BULLSHIT indicates the end of one game.

You may assume, that:

- the word BULLSHIT occurs only in uppercase letters
- every word has at most 25 characters, and each line has at most 100 characters
- there are at most 500 different words before a game ends
- the players follow the rules, so there is no need to check if a game is valid or not


The output consists of one number: the average number of different words needed to win a game. Write the number as a reduced fraction in the 
format shown below. Reduced fraction means that there should be no integer greater than 1 which divides both the numerator and denominator. 
For example if there were 10 games, and the number of different words in each game summed up to 55, print 11 / 2.
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class B1664 {

    private static final BufferedReader IN = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter OUT = new BufferedWriter(new OutputStreamWriter(System.out));

    private static long getGCD(long totalWords, long totalGames) {
        while (totalGames != 0) {
            long rest = totalWords % totalGames;

            totalWords = totalGames;
            totalGames = rest;
        }

        return totalWords;
    }

    private static String reduceFraction(long totalWords, long totalGames) {
        long gcd = getGCD(totalWords, totalGames);
        return (totalWords / gcd) + " / " + (totalGames / gcd) + "\n";
    }

    public static void main(String[] args) throws IOException {
        StringBuilder currentWord = new StringBuilder();
        HashSet<String> gameDistinctWords = new HashSet<>();

        final String TO_GET_LAST_WORD = " ";
        final int BULLSHIT_LENGTH = 8;

        long totalWords = 0, totalGames = 0;

        while (true) {
            String lecture = IN.readLine();

            if (lecture == null) {
                break;
            }

            lecture = lecture.toLowerCase() + TO_GET_LAST_WORD;

            int bullshitIndex = lecture.indexOf("bullshit");
            boolean wordIdentified = false;

            for (int i = 0; i < lecture.length(); i++) {
                char currentChar = lecture.charAt(i);

                if (i == bullshitIndex) {
                    totalWords += gameDistinctWords.size();
                    totalGames++;

                    bullshitIndex = lecture.indexOf("bullshit", bullshitIndex + 1);
                    gameDistinctWords.clear();

                    i += BULLSHIT_LENGTH;
                    continue;
                }

                if (Character.isLetter(currentChar)) {
                    wordIdentified = true;

                    currentWord.append(currentChar);
                } else if (wordIdentified) {
                    wordIdentified = false;

                    gameDistinctWords.add(currentWord.toString());
                    currentWord.setLength(0);
                }
            }
        }

        OUT.write(reduceFraction(totalWords, totalGames));
        OUT.flush();

        IN.close();
        OUT.close();
    }

}