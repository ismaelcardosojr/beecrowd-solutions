/*
Rafael hates rain, and to avoid getting wet he started to use a weather forecasting system. In this system he can predict if it's going to rain at the time 
he goes to work and/or at the time he comes back from work.

Rafael also hates to carry an umbrella when it's not raining. To avoid it, he's going to buy several umbrellas and store them at home and at the office, 
and he's only going to use it when it's raining. In other words, if it's raining at the time he goes to work, he'll take an umbrella that is at home, 
use it on the way to work, and leave it there. In a similar way, if it's raining at the time he comes back from work, he'll take an umbrella that is at the 
office, use it on the way home, and leave it there.

Given the meteorological forecasts, find out how many umbrellas Rafael must buy and store at home and at the office, in a way that he never gets wet and 
he never has to carry an umbrella if it's not raining.
*/

import java.io.IOException;
import java.util.Scanner;

public class B2813 {

    public static void main(String[] args) throws IOException {
        Scanner inp = new Scanner(System.in);

        int totalTestCases;
        String forecastH_W[], forecastH, forecastW;
        int totalUmbrellasH = 0, totalUmbrellasW = 0;
        int homeHas = 0, workHas = 0;
        
        totalTestCases = inp.nextInt();
        inp.nextLine(); // cleaning the buffer

        for (int i = 0; i < totalTestCases; i++) {
            forecastH_W = inp.nextLine().split(" ");

            forecastH = forecastH_W[0];
            forecastW = forecastH_W[1];

            if (forecastH.equals("chuva") && homeHas == 0) {
                totalUmbrellasH++;
                workHas++;
            } else if (forecastH.equals("chuva") && homeHas != 0) {
                homeHas--;
                workHas++;
            }

            if (forecastW.equals("chuva") && workHas == 0) {
                totalUmbrellasW++;
                homeHas++;
            } else if (forecastW.equals("chuva") && workHas != 0) {
                homeHas++;
                workHas--;
            }
        }

        System.out.println(totalUmbrellasH + " " + totalUmbrellasW);
        inp.close();
    }
}