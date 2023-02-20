/*
Santa Claus classifies all the children of the world into two lists: the good ones and the naughty ones. He would like to know which of the 
children is the last in the good ones list, when sorting them in alphabetical order. To do that he asked his Cristhmas Elfs to write down 
all the good kids' names in a sheet of paper.

However, each elf wrote the names in a different way: first letter uppercase and then lowercase; all letters uppercase; all lowercase; and 
all kind of combinations between upper and lowercase letters.

Santa wants your help to tell which is the last name in the list given all the names of the good kids.
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;

public class B2023 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter((System.out)));
        ArrayList<String> goodKidsNames = new ArrayList<>();

        while (true) {
            String newName = in.readLine();

            if (newName == null) {
                break;
            }

            goodKidsNames.add(newName.toLowerCase() + "-" + newName);
        }

        goodKidsNames.sort(Comparator.naturalOrder());

        String lastNameVersions[] = goodKidsNames.get(goodKidsNames.size() - 1).split("-");

        out.write(lastNameVersions[1] + "\n");
        out.flush();
    }
}