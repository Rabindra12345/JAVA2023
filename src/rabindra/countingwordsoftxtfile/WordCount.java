package rabindra.countingwordsoftxtfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        // File path
        String filePath = "/home/oaker/Pictures/SHOW.TXT";

        // Map to store the word counts
        Map<String, Integer> wordCounts = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line into words
                String[] words = line.split(" ");
                for (String word : words) {
                    // Remove any non-alphanumeric characters
                    word = word.replaceAll("[^A-Za-z0-9]", "");

                    // Convert the word to lowercase
                    word = word.toLowerCase();

                    // Update the count for the word
                    if (wordCounts.containsKey(word)) {
                        wordCounts.put(word, wordCounts.get(word) + 1);
                    } else {
                        wordCounts.put(word, 1);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Print the word counts
        int total=0 ;
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
            total =total+entry.getValue();
        }
        
        System.out.println("TOTAL WORDS:" +total);

    }
}
