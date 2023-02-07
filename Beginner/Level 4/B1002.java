/*
The formula to calculate the area of a circumference is defined as A = π . R2. Considering to this problem that π = 3.14159:

Calculate the area using the formula given in the problem description.
*/

import java.io.IOException;
import java.util.Scanner;
 
public class B1002 {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
    
        double R = input.nextDouble();
        double A = 3.14159 * (R * R);
        
        System.out.printf("A=%.4f\n", A);
    }
}
