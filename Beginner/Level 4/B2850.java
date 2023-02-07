/*
Humberto has a smart parrot. When he has both legs on the ground, the parrot speaks Portuguese. When he lifts his left leg, he speaks in 
English. Finally, when he raises his right, he speaks French. Nico, Humberto's friend, was fascinated by the animal. In his excitement he 
asked, "And when he lift both of them?" Before Humberto could respond, the parrot shouted, "Oh, I'll fall, you idiot!"
*/

import java.util.Scanner;

public class B2850 {

    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);
        StringBuilder out = new StringBuilder();

        while (inp.hasNext()) {
            String in = inp.nextLine();

            if (in.equals("esquerda")) out.append("ingles");
            else if (in.equals("direita")) out.append("frances");
            else if (in.equals("nenhuma")) out.append("portugues");
            else out.append("caiu");

            System.out.println(out);

            out.setLength(0);
        }

        inp.close();
    }
}
