/*
Professor Archimedes needs your help to find out which is the most common notes between the notes that students took in his last race. The class has N students 
and your program must print the note that appears more often in N notes list. If more than more frequent note, you must print the biggest one! For example, 
if the class has N = 10 students and grades are [20, 25, 85, 40, 25, 90, 25, 40, 55, 40], the most common grades are 25 and 40, taking place three times each. 
Your program should then print 40.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class B2469 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> allGrades = new ArrayList<>();
        HashSet<Integer> onlyDistinctGrades = new HashSet<>();

        int mostFrequentGradeFrequency = 0;
        int mostFrequentGrade = 0;

        int totalStudents = in.nextInt();

        for (int i = 0; i < totalStudents; i++) {
            int newGrade = in.nextInt();

            allGrades.add(newGrade);
            onlyDistinctGrades.add(newGrade);
        }

        for (Integer thisGrade : onlyDistinctGrades) {
            int thisGradeFrequency = Collections.frequency(allGrades, thisGrade);

            if (thisGradeFrequency > mostFrequentGradeFrequency) {
                mostFrequentGradeFrequency = thisGradeFrequency;
                mostFrequentGrade = thisGrade;
            } else if (thisGradeFrequency == mostFrequentGradeFrequency) {
                mostFrequentGrade = Math.max(mostFrequentGrade, thisGrade);
            }
        }

        System.out.println(mostFrequentGrade);

        in.close();
    }
}