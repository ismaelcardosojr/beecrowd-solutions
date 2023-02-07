/*
Fiddlesticks is a champion of League of Legends, he has as his ultimate ability "CrowStorm", it works as follows:

First Fiddlesticks chooses a strategic location and promptly he prepares to resurface in one direction within a certain distance, then it is 
rooted and channels the ultimate by just 1.5 seconds, after that time it resurfaces immediately at the target site with a flock of crows 
flying in the around and causing much damage.

Fiddlesticks want your help to find out if in a certain position it is possible to achieve an invader with his ultimate skill.

Note: Consider that Fiddlesticks always uses his ultimate exactly in the direction of ivasor and the invader always tries to flee in the 
opposite direction to Fiddlesticks, at a constant speed.
*/

import java.util.Scanner;

public class B2203 {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        while (in.hasNext() ) {
            int fiddle_X = in.nextInt();
            int fiddle_Y = in.nextInt();
            int invader_X = in.nextInt();
            int invader_Y = in.nextInt();
            int invaderSpeed = in.nextInt();
            int ultimateRadius = in.nextInt();
            int crowRadius = in.nextInt();

            double invaderMaxDistance = Math.sqrt(
                    Math.pow(invader_X - fiddle_X, 2f) + Math.pow(invader_Y - fiddle_Y, 2f)) + (invaderSpeed * 1.5f);
            double fiddleMaxDistance = ultimateRadius + crowRadius;

            System.out.println((fiddleMaxDistance >= invaderMaxDistance) ? "Y" : "N");
        }

        in.close();
    }
}
