/*
You are in command of a document system that uses tags numeric code to render documents for printing. There are a lot of documents with text 
based tags, you must analyze and convert to numeric tags for entry into the system. A tag is initiated by a character '<', which may be 
followed by letters, numbers, spaces or bars, and the tag to complete a character '>'. The tags can not be nested into each other.

The following tags are not valid:
">HI", "<a<b>c>", "<a b c><", "<a<b>".

The following tags are valid:
"/=<>HI", "/<>H=I<>/", "<><><><>", "<a=/><b==//bb><c223>", "<a b c>".

For comparisons between the characters should be disregarded case sensitive.
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B1254 {

    private static final BufferedReader IN = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter OUT = new BufferedWriter(new OutputStreamWriter(System.out));

    private static boolean seekOpening(String document, int regexStart) {
        for (int i = regexStart - 1; i >= 0; i--) {
            char currentChar = document.charAt(i);

            if (currentChar == '<') return true;
            else if (currentChar == '>') break;
        }

        return false;
    }

    private static boolean seekClosing(String document, int position) {
        for (int j = position; j < document.length(); j++) {
            char currentChar = document.charAt(j);

            if (currentChar == '>') return true;
            else if (currentChar == '<') break;
        }

        return false;
    }

    public static void main(String[] args) throws IOException {
        while (true) {
            String tag = IN.readLine();

            if (tag == null) {
                break;
            }

            String replacement = IN.readLine();
            String document = IN.readLine();

            for (int i = tag.length(); i <= document.length(); i++) {
                int regexStart = i - tag.length();
                String regex = document.substring(regexStart, i);

                if (regex.equalsIgnoreCase(tag)) {
                    boolean hasOpening = seekOpening(document, regexStart);
                    boolean hasClosing = seekClosing(document, i);

                    if (hasOpening && hasClosing) {
                        document = document.substring(0, regexStart) + replacement
                                 + document.substring(regexStart + tag.length());
                    }
                }
            }

            OUT.write(document + "\n");
        }

        OUT.flush();

        IN.close();
        OUT.close();
    }

}