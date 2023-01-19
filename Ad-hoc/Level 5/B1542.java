/*
You've started competing against your friend to see who can read more books in less time. Your friend used to read 
much more fast than you, until the day you realized that he'd read only small books.

So, you've decided counting how many pages each book has. And decided to increase the amount of pages read per day. 
Now you read 5 pages per day and finish 16 days before, if you were reading 3 pages per day. In this case, how many 
pages has the book?
*/

import java.io.IOException;
import java.util.Scanner;

public class B1542 {

    public static void main(String[] args) throws IOException {
        Scanner inp = new Scanner(System.in);

        while (true) {
            int oldPagesADay = inp.nextInt();

            if (oldPagesADay == 0) break;

            int sparedDays = inp.nextInt();
            int newPagesADay = inp.nextInt();

            int bookPages = (oldPagesADay * sparedDays * newPagesADay) / (newPagesADay - oldPagesADay);
            System.out.print(bookPages);

            if (bookPages == 1) System.out.println(" pagina");
            else System.out.println(" paginas");
        }

        inp.close();
    }
}