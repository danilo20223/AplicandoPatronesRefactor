import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCounter {
    
    public static int countLinesWithWord(String filePath, String word) {
        int count = 0;
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(word)) {
                    count++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String filePath = "example.txt";
        String word = "example";
        int count = countLinesWithWord(filePath, word);
        System.out.println("Number of lines with the word '" + word + "': " + count);
    }
}
