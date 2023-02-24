/* 
Read four numbers (N1, N2, N3, N4), which one with 1 digit after the decimal point, corresponding to 4 scores obtained by a student. 
Calculate the average with weights 2, 3, 4 e 1 respectively, for these 4 scores and print the message "Media: " (Average), followed by the calculated result. 
If the average was 7.0 or more, print the message "Aluno aprovado." (Approved Student). If the average was less than 5.0, print the message: 
"Aluno reprovado." (Reproved Student). If the average was between 5.0 and 6.9, including these, the program must print the message:
"Aluno em exame." (In exam student).

In case of exam, read one more score. Print the message "Nota do exame: " (Exam score) followed by the typed score. 
Recalculate the average (sum the exam score with the previous calculated average and divide by 2) and print the message 
“Aluno aprovado.” (Approved student) in case of average 5.0 or more) or "Aluno reprovado." (Reproved student) in case of average 4.9 or less. 
For these 2 cases (approved or reproved after the exam) print the message "Media final: " (Final average) followed by the final average for this student 
in the last line.
*/

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class B1040 {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.0");
        double N1, N2, N3, N4, N5, media;

        N1 = input.nextDouble();
        N2 = input.nextDouble();
        N3 = input.nextDouble();
        N4 = input.nextDouble();

        media = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10;

        System.out.println("Media: " + df.format(media));

        if (media >= 7) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");

            N5 = input.nextDouble();

            System.out.println("Nota do exame: " + df.format(N5));
            media = (media + N5) / 2;
            
            if (media >= 5) {
                System.out.println("Aluno aprovado.");
                System.out.println("Media final: " + media);
            } else {
                System.out.println("Aluno reprovado.");
                System.out.println("Media final: " + media);
            }
        }

        input.close();
    }
}