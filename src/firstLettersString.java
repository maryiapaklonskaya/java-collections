import java.util.HashMap;
import java.util.Map;

public class firstLettersString {

    public static void main(String[] args) {
        String[] words = {"salt", "tea", "soda", "toast", "water"};
        firstLettersInAString(words);
    }

    public static void firstLettersInAString(String[] arr){

        Map<String, String> results = new HashMap<>();
        String firstLetter = "";

        for(String word : arr) {
            firstLetter = word.substring(0, 1);

            if (results.containsKey(firstLetter)) {
                results.put(firstLetter, results.get(firstLetter) + word);
            } else {
                results.put(firstLetter, word);
            }
        }

        System.out.println(results);

    }
}
