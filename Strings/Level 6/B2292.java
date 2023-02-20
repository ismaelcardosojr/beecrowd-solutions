/*
In Nlogonia are made LED panels for christmas that work like fairy lights. Those panels are composed of N lamps placed horizontally side to 
side. And those panels have an especific behavior: soon as it is plugged, some lamps light up instantly . After that the lamp placed at the 
extreme left (the first one) switches between on and off after each flash. All the other lamps switch if the one placed at it's left turns 
off.

Vitor, a boy who lives in Nlogonia, has a big curiosity and wants to know if given the number of switches of the first lamp, what is the 
panel's final configuration.
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B2292 {

    private static final BufferedReader IN = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter OUT = new BufferedWriter(new OutputStreamWriter(System.out));

    private static final char ON = 'O';
    private static final char OFF = 'X';

    public static void main(String[] args) throws IOException {
        int totalCases = Integer.parseInt(IN.readLine());

        for (int caseNum = 0; caseNum < totalCases; caseNum++) {
            String[] panelInitialConfig = IN.readLine().split(" ");

            char[] panel = panelInitialConfig[0].toCharArray();
            long currentLampSwitches = Long.parseLong(panelInitialConfig[1]);

            for (int i = 0; i < panel.length; i++) {
                long timesCurrentLampSwitchedOff = currentLampSwitches / 2;

                if (panel[i] == ON && currentLampSwitches % 2 != 0) {
                    timesCurrentLampSwitchedOff++;
                    OUT.write(OFF);
                } else if (panel[i] == OFF && currentLampSwitches % 2 != 0) {
                    OUT.write(ON);
                } else {
                    OUT.write(panel[i]);
                }

                currentLampSwitches = timesCurrentLampSwitchedOff;
            }

            OUT.write("\n");
        }

        OUT.flush();

        IN.close();
        OUT.close();
    }

}