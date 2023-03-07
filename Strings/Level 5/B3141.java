/*
It is not just Tobias who has a birthday these days. Mine also occurs at that time and every year I always have the same question, what is my 
age?

I entered college just before the age that people normally enter and it is common for people to be a little scared when I say how old I am. 
They always think I was older. This only increases my age crisis and my doubts about my current age.

I imagine that I am not the only person who takes some time thinking about the answer to the question “how old are you?”, So to help me and 
these people who also suffer from this age doubt, I ask that you write a program that gives the person's current day and date of birth tell 
how old he is.


Input:

The problem entry has 3 lines.

The first line has an N string (3 ≤ |N| ≤ 50) with the person's name and is formed only by lowercase or uppercase letters (‘A’ - ‘Z’, ‘a’ - ‘z’) 
and space characters.

The second line has a string A with the current date in the format "DD/MM/YYYY" and the last line contains a string B with the date of birth, 
also in the format "DD/MM/YYYY". The date of birth is guaranteed to occur before the current date and both dates are valid between 01/01/0001
and 12/31/9999.


Output:

Your program should produce a line with the message "Você tem X anos N." (without quotes), where X is the person's age and N is their name. 
If the current date coincides with the person's birthday, you should print "Feliz aniversario!" (without quotes) one line before printing the 
answer.
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B3141 {

    private static final BufferedReader IN = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter OUT = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String username = IN.readLine();
        String[] currentDate = IN.readLine().split("/");
        String[] birthDate = IN.readLine().split("/");

        int currentDay = Integer.parseInt(currentDate[0]);
        int currentMonth = Integer.parseInt(currentDate[1]);
        int currentYear = Integer.parseInt(currentDate[2]);

        int birthDay = Integer.parseInt(birthDate[0]);
        int birthMonth = Integer.parseInt(birthDate[1]);
        int birthYear = Integer.parseInt(birthDate[2]);

        int userAge = currentYear - birthYear;
        userAge -= currentMonth < birthMonth || (currentMonth == birthMonth && currentDay < birthDay) ? 1 : 0;

        StringBuilder result = new StringBuilder(currentDay == birthDay && 
                                                 currentMonth == birthMonth ? "Feliz aniversario!\n" : "");
        result.append("Voce tem ").append(userAge).append(" anos ").append(username).append(".\n");

        OUT.write(result.toString());
        OUT.flush();
    }

}