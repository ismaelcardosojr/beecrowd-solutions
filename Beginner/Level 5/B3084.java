/* 
Ezequiel have an old and valuable clock, but some of its characteristics got lost over time. The pointers still marks the hours and minutes correctly, 
but the markers and numbers became unreadable.

Ezequiel uses an auxiliary instrument to observe the angles formed by the hour and minute pointers. He asks you to help writing a program that indicates 
the hour and the minute at the moment of measurement. You must consider that both angles measured at the time 00:00 are equal to zero and both pointers only 
moves when a corresponding time unit (hour or minute) is completed.
*/

import java.io.IOException;
import java.util.Scanner;

public class B3084 {

    public static void main(String[] args) throws IOException {
        Scanner inp = new Scanner(System.in);
        int angleH, hours;
        double angleM, minutes;

        while (inp.hasNext()) {
            angleH = inp.nextInt();
            angleM = inp.nextDouble();

            hours = angleH / 30;
            minutes = angleM * 0.167f;

            System.out.printf("%02d:%02d\n", hours, (int) minutes);
        }

        inp.close();
    }
}