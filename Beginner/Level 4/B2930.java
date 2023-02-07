/*
Larissa is a very intelligent and studious scholar, so she is engaged in various activities. The end of the year, the month of hers final 
presentation, has arrived. She, very busy, needs to know if she can perform her presentation before Christmas! But prior to her presentation 
she must undergo a check with her oriental counselor, Prof. Takanada
*/

import java.util.Scanner;

public class B2930 {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        int deliverDay = in.nextInt();
        int submitDay = in.nextInt();

        int daysBeforeDeadline = submitDay - deliverDay;

        if (deliverDay > submitDay) System.out.println("Eu odeio a professora!");
        else if (daysBeforeDeadline >= 3) System.out.println("Muito bem! Apresenta antes do Natal!");
        else {
            System.out.println("Parece o trabalho do meu filho!");

            if (submitDay < 23 && deliverDay != submitDay) System.out.println("TCC Apresentado!");
            else System.out.println("Fail! Entao eh nataaaaal!");
        }

        in.close();
    }
}