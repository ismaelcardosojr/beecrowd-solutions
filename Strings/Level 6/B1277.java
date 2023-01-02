/*
The students at your university have lately picked up the annoying habit of missing classes. 
To fix this problem your board has decided to only allow students with 75% or higher attendance to sit for the exams.

From a list of students' names and their respective attendance records, print out the list of students who did not attend to enough classes and will be denied 
to sit for exams.

Each test case is composed of three input lines:

- The first line of a test case will contain an integer N (0 ≤ N ≤ 100) indicating the number of students in the class.
- The second line will contain N student names with up to 50 chars each, separated by a single space character. All names will contain only uppercase or 
lowercase letters (‘A’-‘Z’,‘a’-‘z’).
- The third line will contain N attendance records, corresponding to their respective students from the previous line. The attendance records will be separated 
by a single space character, and contain only ‘A’, ‘P’ and ‘M’ characters. A ‘P’ indicates that the student was present in a class, ‘A’ shows that he was 
absent (he did not attend) and ‘M’ shows that he was absent for a class but submitted a doctor's note then that class is not counted when calculating his 
attendance percentage. An attendance record will contain at least one ‘A’ or ‘P’ character.
*/

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class B1277 {

    public static final int minAttendancePercentage = 75;

    public static ArrayList<String> getStudentsWithoutMinAttendance(int totalStudents, String[] studentsNames, String[] studentsAttendanceRecords) {
        ArrayList<String> studentsWithoutMinAttendance = new ArrayList<>();

        for (int i = 0; i < totalStudents; i++) {
            String thisAttendance = studentsAttendanceRecords[i];
            String studentNameThisAttendance = studentsNames[i];

            char allRecords[] = thisAttendance.toCharArray();
            int totalClasses = allRecords.length;
            int studentPresence = 0;

            for (char thisRecord : allRecords) {
                if (thisRecord == 'P') studentPresence++;
                if (thisRecord == 'M') totalClasses--;
            }

            int studentAttendancePercentage = (studentPresence * 100) / totalClasses;

            if (studentAttendancePercentage < minAttendancePercentage) {
                studentsWithoutMinAttendance.add(studentNameThisAttendance);
            }
        }

        return studentsWithoutMinAttendance;
    }

    public static void printStudentsWithoutMinAttendance(ArrayList<String> studentsWithoutMinAttendance) {
        for (int j = 0; j < studentsWithoutMinAttendance.size(); j++) {
            String thisName = studentsWithoutMinAttendance.get(j);
            boolean isTheFirstName = (j == 0);

            if (isTheFirstName) System.out.print(thisName);
            else System.out.print(" " + thisName);
        }

        System.out.print("\n");
    }

    public static void main(String[] args) throws IOException {
        Scanner inp = new Scanner(System.in);

        int totalTestCases = inp.nextInt();

        for (int i = 0; i < totalTestCases; i++) {
            int totalStudents = inp.nextInt();

            inp.nextLine(); // cleaning the buffer
            String studentsNames[] = inp.nextLine().split(" ");
            String studentsAttendanceRecords[] = inp.nextLine().split(" ");

            ArrayList<String> studentsWithoutMinAttendance = getStudentsWithoutMinAttendance(totalStudents, studentsNames, studentsAttendanceRecords);
            printStudentsWithoutMinAttendance(studentsWithoutMinAttendance);
        }

        inp.close();
    }
}