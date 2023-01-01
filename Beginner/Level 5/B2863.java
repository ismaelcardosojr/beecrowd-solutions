/*
Umil Bolt is an excellent runner. His specialty is the 100-meter race. Every day, he makes a battery of attempts to run this test in an ever faster time. 
It can be seen that, depending on the number of attempts, its performance improves or worsens. About this, he asks for your help to calculate the fastest 
attempt of each daily battery.
*/

import java.io.IOException;
import java.util.Scanner;

public class B2863 {

    public static void main(String[] args) throws IOException {
        Scanner inp = new Scanner(System.in);

        int totalTestCases;
        double batteryAttempt, fastestAttempt;

        while (inp.hasNext()) {
            fastestAttempt = 1000;
            totalTestCases = inp.nextInt();

            for (int i = 0; i < totalTestCases; i++) {
                batteryAttempt = inp.nextDouble();

                if (batteryAttempt < fastestAttempt) {
                    fastestAttempt = batteryAttempt;
                }
            }

            System.out.println(fastestAttempt);
        }

        inp.close();
    }
}