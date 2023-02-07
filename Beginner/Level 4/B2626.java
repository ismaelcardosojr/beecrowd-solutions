/*
Dodô, Leo e Pepper often spend the early hours of the morning chatting somewhere in the condominium Jardim Botânico IV. In the last few 
sessions, Dodo has been talking about the RPG game he and Leo are creating, and Leo (not surprisingly) has spoken about heavy metal and 
Pepper was fascinated by the story of Greek mythology told by Leo.

The boys decided to adopt a strategy to divide the sessions equally among the subjects, só each one to them can speculate as much as 
possible and arrive at unbilievable conclusions. They wall play “rock, paper and scissors” to decide the subject of today’s session, and 
then they will alternate the subjects in the next sessions. Given the moves of Dodo, Leo and Pepper, in this order, you must determine the 
subject of today’s session.
*/

import java.util.Scanner;

public class B2626 {

    public static boolean definirVencedor(String movimentoVencedor, String movimentoOponente1, String movimentoOponente2) {
        if ((movimentoVencedor.equals("pedra")
                && movimentoOponente1.equals("tesoura")
                && movimentoOponente2.equals("tesoura"))
            || (movimentoVencedor.equals("papel")
                && movimentoOponente1.equals("pedra")
                && movimentoOponente2.equals("pedra"))
            || (movimentoVencedor.equals("tesoura")
                && movimentoOponente1.equals("papel")
                && movimentoOponente2.equals("papel"))) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String rodada[];
        String movimentoDodo, movimentoLeo, movimentoPeppers;

        while (in.hasNext()) {
            rodada = in.nextLine().split(" ");

            movimentoDodo = rodada[0];
            movimentoLeo = rodada[1];
            movimentoPeppers = rodada[2];

            if (definirVencedor(movimentoDodo, movimentoLeo, movimentoPeppers)) {
                System.out.println("Os atributos dos monstros vao ser inteligencia, sabedoria...");
            } else if (definirVencedor(movimentoLeo, movimentoDodo, movimentoPeppers)) {
                System.out.println("Iron Maiden's gonna get you, no matter how far!");
            } else if (definirVencedor(movimentoPeppers, movimentoDodo, movimentoLeo)) {
                System.out.println("Urano perdeu algo muito precioso...");
            } else {
                System.out.println("Putz vei, o Leo ta demorando muito pra jogar...");
            }
        }

        in.close();
    }
}
