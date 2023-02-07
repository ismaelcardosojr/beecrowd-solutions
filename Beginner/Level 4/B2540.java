/*
Analógimôn Go! is a very popular game. The players of this game are divided in three teams: Team Valor, Team Instinct and Team Mystic, 
which are led by their leaders, Kandera, Esparky and Blanque, respectively. Of course, you belong to one of these teams!

The leader of your team is being accused of cheating by incorrectly managing the candies the team receives from the Professor. This fact 
created a big controversy among the players in the team: some players state that the leader really cheated, must suffer an impeachment and 
must leave his position as a leader, while other players state that he did not cheat, that the accusation is false and he must keep leading 
the team.

To solve this situation, a poll will be held with all N players in your team. Each player must vote if the impeachment must or must not occur. 
If the number of votes for the impeachment is greater than or equal to 2/3 (two thirds) of the total number of players in the team, the leader
will lost his position. Otherwise, the accusation will be filed and he will keep leading the team.

Given the votes of all players, determine the result of the poll.
*/

import java.util.Scanner;

public class B2540 {

    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);

        while (inp.hasNext()) {
            int totalImpeach = 0;

            double numPlayers = inp.nextDouble();

            inp.nextLine(); // cleaning the buffer
            String votes[] = inp.nextLine().split(" ");

            for (int i = 0; i < numPlayers; i++) {
                int iVote = Integer.parseInt(votes[i]);

                if (iVote == 1) totalImpeach++;
            }

            numPlayers *= 0.6666;

            System.out.println((totalImpeach >= numPlayers) ? "impeachment" : "acusacao arquivada");
        }

        inp.close();
    }
}