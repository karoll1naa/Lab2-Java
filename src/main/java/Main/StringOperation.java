package Main;

import java.util.Arrays;
import java.util.Comparator;

public class StringOperation {
    int recordBook = 5543;
    int C3 = recordBook % 3; // 2
    int C17 = recordBook % 17; // 1

    public void sortSentences(StringBuffer text) {
        try {
            String inputText = text.toString();
            String[] sentences = inputText.split("(?<=\\.)");
            Arrays.sort(sentences, Comparator.comparingInt(s -> s.split("\\s+").length));
            System.out.println("Sentences in order of increasing number of words: ");
            for (String sentence : sentences) {
                System.out.println(sentence.trim());
            }
        } catch(Exception e){
            System.err.println("Oops, something went wrong: " + e.getMessage());
        }
    }
}
