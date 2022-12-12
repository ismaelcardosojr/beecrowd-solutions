/* 
There is a traditional industry in Brazil that produces musical equipment. Currently they are totally immersed with the era of Industry 4.0 and 
their main action is the creation of pedals of effects for guitar, that there are in an incredible diversity, each for a type of customer. 
This industry has implemented a system in which his client creates his own pedal through a 3D prototype and interactive, including with sounds, 
simulating the actual pedal. Therefore, after the client generates his model, the same one is sent to the company, where it will be manufactured.

To be fabricated, the pedal circuit is printed on a PCB(printed circuit board) which has a certain size. But with the creativity of the customers, 
the plates are taking unimaginable dimensions, this fact makes the plate available in the company does not serve. Since you are an excellent programmer 
and music lover, it is up to you to create a program in which given the dimensions of the client circuit and the size of the board available, tell whether 
or not you can use that board.
*/

import java.io.IOException;
import java.util.Scanner;

public class B2770 {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int comprimentoE, larguraE, areaE;
        int comprimentoC, larguraC, areaC;
        int casos;

        while (in.hasNext()) {
            comprimentoE = in.nextInt();
            larguraE = in.nextInt();
            casos = in.nextInt();

            areaE = comprimentoE * larguraE;

            for (int i = 0; i < casos; i++) {
                comprimentoC = in.nextInt();
                larguraC = in.nextInt();

                areaC = comprimentoC * larguraC;

                if ((areaE >= areaC && ((comprimentoE >= comprimentoC && larguraE >= larguraC)
                        || (comprimentoE >= larguraC && larguraE >= comprimentoC))))
                    System.out.println("Sim");
                else
                    System.out.println("Nao");
            }
        }

        in.close();
    }
}