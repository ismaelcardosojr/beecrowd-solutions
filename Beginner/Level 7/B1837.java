/* 
It has begun the IV UFFS Programming Contest! We hope you enjoy the next hours you are going to spend with us, as we hope you have a lot of fun! Good luck!

This is the 3rd year of the Programming Club, an extension program whose primary goal is to help the programmers of the Brazilian region known as 
Southern Border to get readier to face the computational challenges from both academic and corporate worlds. Our main strategy lies in promoting workshops 
and training sessions for Programming contests, not only for students of our institution (UFFS), but also for whoever wants to participate. 
Despite of many issues, we find ourselves very happy with the results we have been achieving. Having other institutions as partners, as UNOCHAPECÓ, URI and 
UNOESC, we collaborated to make Chapecó in the past two years the 2nd largest site of ICPC Brazilian Subregional Contest, which is another indicator of the 
enthusiasm our people has in Programming.

In order to warm you up for this particular contest, we shall ask you to write a program which calculates the quotient and the remainder of the division of 
two integers, can that be? Recall that the quotient and the remainder of the division of an integer a by a non-zero integer b are respectively the only 
integers q and r such that 0 ≤ r < |b| and: a = b × q + r
*/    

import java.io.IOException;
import java.util.Scanner;

public class B1837 {

    public static void main(String[] args) throws IOException {
        Scanner inp = new Scanner(System.in);
        int a, b, q, r;

        a = inp.nextInt();
        b = inp.nextInt();

        r = a % b;

        if (r < 0 && b < 0) r -= b;
        else if (r < 0) r += b;

        q = (a - r) / b;

        System.out.printf("%d %d\n", q, r);

        inp.close();
    }
}