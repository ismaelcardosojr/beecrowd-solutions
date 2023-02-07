/*
Kage Bunshin no Jutsu (or the "Shadow Clone Technique", for English speakers) is a ancient technique often used during ninja battles.

When used, the technique creates a copy identical to its user. That way, if a given ninja uses the technique, a copy of that ninja comes 
to existence, so there are two of the same ninja (the original one and his copy).

The technique is always executed by all ninjas existing in the moment. That way, if the technique is used again, there will be four ninjas 
in total (the two previous ones and two new copies), and so on.

There are N copies of a given ninja (including the original one). Your task is to determine how many times the technique was used.
*/

import java.util.Scanner;

public class B2544 {

    public static int logBase2(int ninjas) {
        return (int) (Math.log(ninjas) / Math.log(2));
    }

    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);

        while (inp.hasNext()) {
            int ninjas = inp.nextInt();
            int log = logBase2(ninjas);

            System.out.println(log);
        }

        inp.close();
    }
}
