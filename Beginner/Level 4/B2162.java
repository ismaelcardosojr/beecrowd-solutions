/*
Professor MC realized that at each 100 meter interval there is a peak in the Nlogony landscape. And that at exactly half way of each two 
peaks there is a valley. That means that at each 50 meters there is a valley or a peak and, alongside the landscape, there is not a peak 
followed by another peak neither there is a valley followed by another valley.

Professor MC got curious with that pattern and wants to know if this happens again to other landscapes. Your task is, given a landscape, 
to indicate if it has this pattern.
*/

import java.util.Scanner;

public class B2162 {

    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);
        boolean possibleOrNot = true;

        int totalMeasures = inp.nextInt();

        inp.nextLine(); // cleaning the buffer
        String inpLine[] = inp.nextLine().split(" ");

        boolean peakOrValley[] = new boolean[totalMeasures];
        int previousMeasureHeight = Integer.parseInt(inpLine[0]);

        for (int i = 1; i < totalMeasures; i++) {
            int measureHeight = Integer.parseInt(inpLine[i]);

            if (measureHeight > previousMeasureHeight) {
                peakOrValley[i] = true;
            }

            if (measureHeight == previousMeasureHeight || (peakOrValley[i - 1] == peakOrValley[i] && i != 1)) {
                possibleOrNot = false;
                break;
            }

            previousMeasureHeight = measureHeight;
        }

        if (possibleOrNot) System.out.println("1");
        else System.out.println("0");

        inp.close();
    }
}