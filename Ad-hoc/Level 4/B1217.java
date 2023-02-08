/*
Ms. Parcinova, Mangojata's mom, asked to help her to calculate the consumption of fruit in the house and the amount spent per day on these 
fruits. Mangojata now must to do a program from a table that his mother was using for annotations by almost a year. In this table, Ms. 
Parcinova noted the amount of days and then the spent money each day with these fruits, considering always one KG of each fruit.
*/

import java.io.IOException;
import java.util.Scanner;

public class B1217 {

    public static void main(String[] args) throws IOException {
        Scanner inp = new Scanner(System.in);

        int totalCases;
        double amountSpentAVG = 0, kgConsumedAVG = 0;
        String[] fruitsConsumed;

        totalCases = inp.nextInt();

        for (int i = 1; i <= totalCases; i++) {
            amountSpentAVG += inp.nextDouble();

            inp.nextLine(); // cleaning the buffer
            fruitsConsumed = inp.nextLine().split(" ");

            kgConsumedAVG += fruitsConsumed.length;

            System.out.printf("day %d: %d kg\n", i, fruitsConsumed.length);
        }

        System.out.printf("%.2f kg by day\n", kgConsumedAVG / totalCases);
        System.out.printf("R$ %.2f by day\n", amountSpentAVG / totalCases);

        inp.close();
    }
}