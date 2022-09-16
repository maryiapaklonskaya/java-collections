import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TrueFalseCharacters {
        public static void main(String[] args) {
            String[] chars = {"a", "b", "c", "a", "b"};
            trueFalseString(chars);
        }

        public static void trueFalseString(String[] charsArray){
            Map<String, Boolean> mapChars = new HashMap<>();
            for (String element : charsArray){
                if(mapChars.containsKey(element)){
                    mapChars.put(element, true);
                } else {
                    mapChars.put(element, false);
                }
            }

            System.out.println(mapChars.size());
            System.out.println(mapChars);
        }
    }
