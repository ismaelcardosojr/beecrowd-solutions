/* 
Mariazinha wants to solve an interesting problem. Given the population and growing rate of 2 cities (A and B), she would like to know how many years would 
be necessary to the smaller city (always A) to be greater than the larger city (always B) in population. Of course, she only wants to know the result for 
cities that the growing rate for city A is bigger than the growing rate for city B, therefore, she separated these test cases for you. Your job is to build 
a program that print the time in years for each test case.

However, in some cases the time can be so big and Mariazinha don't want to know the exact time for these cases. In this way, for these test cases, 
it is enough printing the message "Mais de 1 seculo", that means "More than a Century".
*/

import java.io.IOException;
import java.util.Scanner;

public class B1160 {

    public static void main(String[] args) throws IOException {
        Scanner inp = new Scanner(System.in);

        int cases = inp.nextInt();
        inp.nextLine(); // <-- cleaning the buffer.

        for (int count = 0; count < cases; count++) {
            int years;

            String inpLine = inp.nextLine();
            String[] splittedNum = inpLine.split(" ");

            int populationA = Integer.parseInt(splittedNum[0]);
            int populationB = Integer.parseInt(splittedNum[1]);
            double percentualGrowA = Double.parseDouble(splittedNum[2]);
            double percentualGrowB = Double.parseDouble(splittedNum[3]);

            for (years = 0; populationA <= populationB; ++years) {
                if (years > 100) break;

                populationA += ((populationA * percentualGrowA) / 100);
                populationB += ((populationB * percentualGrowB) / 100);
            }

            if (years > 100)
                System.out.println("Mais de 1 seculo.");
            else
                System.out.println(years + " anos.");
        }

        inp.close();
    }
}