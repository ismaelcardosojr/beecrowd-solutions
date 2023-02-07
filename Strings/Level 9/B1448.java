/*
Every kid certainly played Chinese Whispers at least once with other kids. It is a game in which one person whispers a message to another, which is passed 
through a line of people until the last player announces the message to the entire group. Little John invented a variation of this game.

In this game, there are two teams and a judge. In each team, the kids play as in the original game: each kid whispers the message to another, and the last kid 
announces the message he/she heard. The initial message is told to the first kid of each team by the judge. This message is the same for both teams. Also, 
this message contains n characters (letters, spaces, punctuation, etc. included). The length of the message is known by all the kids, thus the messages 
announced by the last kids of each team also have n characters.

The team that announces the most similar message to the original one, wins. The "similarity" of a message is equal to the number of positions in which the 
character in the original message and the one in the announced message is the same. If this number is equal for both teams, find the first position for which 
one team announced the correct character, and the other didn't. If there's still a tie, the game result is a draw.

For example, if the initial message was "O rato roeu a roupa do rei.", the first team announced "O ator morreu, garoupa rei.", and the second team announced 
"O pato moeu garoupa dorlei.", the second teams wins, because there are 21 positions in which the character is the same for the second team, and only 9 
positions for the first one.

Like the ICPC judges, the judges of this game are lazy, too. They asked you to write a program that decides the winning team.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1448 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int totalInstances = Integer.parseInt(in.readLine());

        for (int i = 1; i <= totalInstances; i++) {
            int team_1_Score = 0, team_2_Score = 0;
            int tiebreaker = 0;
            boolean alreadyExecuted = false;

            String initialMessage = in.readLine();
            String team_1_Message = in.readLine();
            String team_2_Message = in.readLine();

            for (int j = 0; j < initialMessage.length(); j++) {
                char initialMessageChar = initialMessage.charAt(j);
                boolean team_1_GotItRight = false, team_2_GotItRight = false;

                if (initialMessageChar == team_1_Message.charAt(j)) {
                    team_1_GotItRight = true;
                    team_1_Score++;
                }

                if (initialMessageChar == team_2_Message.charAt(j)) {
                    team_2_GotItRight = true;
                    team_2_Score++;
                }

                if (team_1_GotItRight && !team_2_GotItRight && !alreadyExecuted) {
                    alreadyExecuted = true;
                    tiebreaker = 1;
                } else if (team_2_GotItRight && !team_1_GotItRight && !alreadyExecuted) {
                    alreadyExecuted = true;
                    tiebreaker = 2;
                }
            }

            System.out.println("Instancia " + i);

            if (team_1_Score > team_2_Score) System.out.println("time 1");
            else if (team_2_Score > team_1_Score) System.out.println("time 2");
            else if (tiebreaker == 1) System.out.println("time 1");
            else if (tiebreaker == 2) System.out.println("time 2");
            else System.out.println("empate");

            System.out.println();
        }

        in.close();
    }
}