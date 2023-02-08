/*
Mangojata is learning Computer Programming. She finds everything very easy, very simple. She is going to make a small program that reads the 
names of your friends and the distance from his home to each of them. Therefore, she simply want to calculate what is the average distance 
between her house and her friends house (in meters). But Aristoclenes, a much more experienced programmer warned her that sometimes what seems 
simple can have some details, depending on the programming language used for implementation.
*/

import java.io.IOException;
import java.util.Scanner;

public class B1216 {

    public static void main(String[] args) throws IOException {
        Scanner inp = new Scanner(System.in);
        
        double distance, totalDistance = 0, friend = 0;

        while (inp.hasNext()) {
            inp.nextLine(); // unused info by my solution

            distance = inp.nextInt();

            totalDistance += distance;
            friend++;

            inp.nextLine(); // cleaning the buffer
        }

        System.out.printf("%.1f\n", totalDistance / friend);

        inp.close();
    }
}