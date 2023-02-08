/*
Daniela is a nurse in a large hospital, which causes her working shifts to constantly change. To make it worse, she has deep sleep, and a 
big difficulty to wake up using alarm clocks.

Recently she got a digital clock as a gift, with several different options of alarm sounds, and she hopes that it might help solve her 
problem. But lately, she's been very tired and wants to enjoy every single moment of rest. So she carries her new clock to every place she 
goes, and whenever she has some spare time, she tries to sleep, setting her alarm clock to the time when she needs to wake up. But, with so 
much anxiety to sleep, she ends up with some difficulty to fall asleep and enjoy some rest.

A problem that has been tormenting her is to know how many minutes of sleep she would have if she felt asleep immediately and woken up when 
the alarm clock ringed. But she is not very good with numbers, and asked you for help to write a program that, given the current time and 
the alarm time, find out the number of minutes she could sleep.
*/

import java.io.IOException;
import java.util.Scanner;

public class B1103 {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int currentHours, currentMinutes;
        int setHours, setMinutes;
        int totalMinutes;
        int currentH_minus_setH, currentM_minus_setM, hoursToMinutes;
        boolean equalHours, currentM_less_setM;

        while (true) {
            totalMinutes = 0;

            currentHours = in.nextInt();
            currentMinutes = in.nextInt();
            setHours = in.nextInt();
            setMinutes = in.nextInt();

            if (currentHours + currentMinutes + setHours + setMinutes == 0) {
                break;
            }

            equalHours = currentHours == setHours;
            currentM_less_setM = currentMinutes < setMinutes;

            currentH_minus_setH = Math.abs(currentHours - setHours);
            currentM_minus_setM = Math.abs(currentMinutes - setMinutes);
            hoursToMinutes = currentH_minus_setH * 60;

            if (equalHours) {
                totalMinutes = 1440;
            } else if (currentHours < setHours) {
                totalMinutes += hoursToMinutes;
            } else {
                totalMinutes += (1440 - hoursToMinutes);
            }

            if (equalHours && currentM_less_setM) {
                totalMinutes = currentM_minus_setM;
            } else if (currentM_less_setM) {
                totalMinutes += currentM_minus_setM;
            } else if (currentMinutes > setMinutes) {
                totalMinutes -= currentM_minus_setM;
            }

            System.out.println(totalMinutes);
        }

        in.close();
    }
}