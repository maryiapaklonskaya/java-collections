import java.util.HashMap;
import java.util.Map;

public class Anagrams {

    public static void main(String[] args){
//        areAnagrams("great", "grate");
        System.out.println(areAnagrams("knee", "keen"));

    }

    public static boolean myAreAnagrams(String word1, String word2) {
        boolean result = false;
        int count = 0;

        char[] input1 = new char[word1.length()];
        char[] input2 = new char[word2.length()];

        if(word1.length() == word2.length()) {
            for (int i = 0; i < word1.length(); i++) {
                input1[i] = word1.charAt(i);
                input2[i] = word2.charAt(i);
            }

            for (char c : input1) {
                for (char r : input2) {
                    if (c == r) {
                        count += 1;
                        System.out.println(c + " " + r + " " + count);
                        break;
                    }
                }
            }

            if (count == word1.length()) {
                result = true;
                System.out.println("anagrams");
            } else {
                System.out.println("not anagrams");
            }

        }
        return result;
    }

    public static boolean areAnagrams(String word1, String word2) {
        if(word1.length() != word2.length()){
            return false;
        }


        Map<Character, Integer> map1 = new HashMap<>(); //character is the character, while integer is frequency of the character

        for (int i = 0; i < word1.length(); i++) {
            Character letter = word1.charAt(i);

            if(map1.containsKey(letter)){
                map1.put(letter, map1.get(letter) + 1);

        } else {
                map1.put(letter, 1);
            }
        }

        for (int i = 0; i < word2.length(); i++) {
            Character letter = word2.charAt(i);

            if(map1.containsKey(letter)){
                if(map1.get(letter) == 0){
                    return false;
                }
                map1.put(letter, map1.get(letter) - 1);
            } else {
                return false;
            }
        }
        return true;
    }

}
