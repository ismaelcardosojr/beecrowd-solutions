/*
Your teacher would like to make a program with the following characteristics:

Read a date in the DD/MM/YY format;
Print the date in MM/DD/YY format;
Print the date in the YY/MM/DD format ;
Print the date in DD-MM-YY format.
*/

import java.util.Scanner;

public class B2764 {

    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);

        String[] date = inp.nextLine().split("/");

        String day = date[0];
        String month = date[1];
        String year = date[2];

        System.out.printf("%s/%s/%s\n", month, day, year);
        System.out.printf("%s/%s/%s\n", year, month, day);
        System.out.printf("%s-%s-%s\n", day, month, year);

        inp.close();
    }
}