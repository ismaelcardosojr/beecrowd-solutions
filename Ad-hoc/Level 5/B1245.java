/*
The Boots and Shoes supplies division of the Army purchased a large number of pairs of boots of various sizes for his soldiers. However, a 
failure of the packaging factory contracted, not all supplied boxes containing a pair of boots correct, with two boots of the same size, one 
for each foot. The sergeant told the recruits withdraw all boots all the boxes to repack them, this time correctly.

When the sergeant discovered that you knew programming, he asked with the usual kindness you write a program that, given a list containing 
the description of each boot delivered, determines how many pairs of boots could be formed in total.
*/

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class B1245 {

    public static void main(String[] args) throws IOException {
        Scanner inp = new Scanner(System.in);
        ArrayList<String> boots = new ArrayList<>();

        while (inp.hasNext()) {
            int totalPairs = 0;

            int testCases = inp.nextInt();
            inp.nextLine(); // cleaning the buffer

            for (int i = 0; i < testCases; i++) {
                String newBoot = inp.nextLine();

                boots.add(newBoot);

                String newBootAspects[] = newBoot.split(" ");

                int newBootNum = Integer.parseInt(newBootAspects[0]);
                char newBootFeet = newBootAspects[1].charAt(0);

                for (int j = 0; j < boots.size(); j++) {
                    String otherBootAspects[] = boots.get(j).split(" ");

                    int otherBootNum = Integer.parseInt(otherBootAspects[0]);
                    char otherBootFeet = otherBootAspects[1].charAt(0);

                    if (newBootNum == otherBootNum && newBootFeet != otherBootFeet) {
                        totalPairs++;

                        boots.remove(newBoot);
                        boots.remove(j);

                        break;
                    }
                }
            }

            System.out.println(totalPairs);

            boots.clear();
        }

        inp.close();
    }
}