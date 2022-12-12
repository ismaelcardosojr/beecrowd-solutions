/* 
Samu Elmito loves creating peculiar games to challenge his friends. This time, he made a game called "Jogo do Operador" (Operation Game), 
in which he creates basic expresssions and each player must choose an expression and fill the gap with the correct operation to validate it. 
The players may choose 1 out of 3 operations: addition, subtraction and multiplication. However, if the player thinks there's no operation among the 
3 operations that validates the expression, he can anwser Impossible.

Your task is simple: given the expressions and the players' answer, determine which players won't proceed to the next phase of the game.
*/

import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class B2493 {
    public static void main(String[] args) throws IOException {
        Scanner inp = new Scanner(System.in);
        StringBuilder out = new StringBuilder();
        List<String> playersNames = new ArrayList<>();

        int testCases, totalLosers;
        String[] challenges, answers;

        while (inp.hasNext()) {
            out.setLength(0);
            playersNames.clear();
            totalLosers = 0;

            testCases = inp.nextInt();
            inp.nextLine();

            challenges = new String[testCases];
            answers = new String[testCases];

            for (int i = 0; i < testCases; i++) {
                challenges[i] = inp.nextLine();
            }

            for (int i = 0; i < testCases; i++) {
                String name, operator;
                int chosenExpression;

                answers = inp.nextLine().split(" ");
                name = answers[0];
                chosenExpression = Integer.parseInt(answers[1]);
                operator = answers[2];

                String[] expression, operando2_result;
                int operando1, operando2, result;

                expression = challenges[chosenExpression - 1].split(" ");
                operando1 = Integer.parseInt(expression[0]);
                operando2_result = expression[1].split("=");
                operando2 = Integer.parseInt(operando2_result[0]);
                result = Integer.parseInt(operando2_result[1]);

                if ((operator.equals("+") && operando1 + operando2 != result)
                        || (operator.equals("-") && operando1 - operando2 != result)
                        || (operator.equals("*") && operando1 * operando2 != result)) {
                    playersNames.add(name);

                    totalLosers++;
                } else if (operator.equals("I") && (operando1 + operando2 == result || operando1 - operando2 == result
                        || operando1 * operando2 == result)) {
                    playersNames.add(name);

                    totalLosers++;
                }
            }

            if (totalLosers == testCases)
                System.out.println("None Shall Pass!");
            else if (totalLosers == 0)
                System.out.println("You Shall All Pass!");
            else {
                playersNames.sort(Comparator.naturalOrder());

                for (int i = 0; i < playersNames.size(); i++) {
                    if (i == 0)
                        System.out.print(playersNames.get(i));
                    else
                        System.out.print(" " + playersNames.get(i));
                }

                System.out.println();
            }
        }

        inp.close();
    }
}