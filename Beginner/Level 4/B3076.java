/*
After a very good history class - suceeding a very poor math class - some students from a specific school are in doubt on a simple problem. 
The teacher asked them about the numeric value (for the sake of simplicity, it must be in decimal and should contain arabic algarisms) of 
the century of a given year but, as only few students got it, she decided to ask you to help creating a program that does exactly this for 
educational purposes.

For those who not remember this history class, the century 1, for example, means the years among 1 and 100, the century 2 the years among 
101 and 200, the century 3 the years among 201 and 300 and so on.
*/

import java.util.Scanner;

public class B3076 {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        while (in.hasNext() ) {
            int year = in.nextInt();
            int century = year / 100;

            if (year % 100 != 0) century++;

            System.out.println(century);
        }

        in.close();
    }
}
