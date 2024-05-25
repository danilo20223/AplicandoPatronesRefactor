import java.util.ArrayList;
import java.util.List;

public class UpperCaseConverter {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("hello");
        words.add("world");
        words.add("java");
        words.add("programming");
        
        List<String> upperCaseWords = convertToUpperCase(words);
        
        for (int i = 0; i < upperCaseWords.size(); i++) {
            System.out.println(upperCaseWords.get(i));
        }
    }

    public static List<String> convertToUpperCase(List<String> words) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < words.size(); i++) {
            result.add(words.get(i).toUpperCase());
        }
        return result;
    }
}
