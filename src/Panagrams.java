import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Panagrams {

    public static void main(String[] args) {
        System.out.println(isPanagram("the quick brown fox jumps over the lazy dog"));

    }

    public static boolean myIsPanagram(String sentence){
        Map<Character, Integer> map = new HashMap<>();
        if(sentence.length() < 26) { return false;}

        for(int i = 0; i < sentence.length(); i++){
            Character letter = sentence.charAt(i);
            if(letter.equals(' ')) {
            } else if(map.containsKey(letter)){
                map.put(letter, map.get(letter) + 1);
            } else {
                map.put(letter, 1);
            }
        }
        map.forEach((key, value) -> {
            System.out.println(key + " " + value + " " + map.size());});

        return map.size() == 26;
    }

    public static boolean isPanagram(String sentence){
        Set<Character> set = new HashSet<>();
        if(sentence.length() < 26) { return false;}

        for(int i = 0; i < sentence.length(); i++){
            Character letter = sentence.charAt(i);
            //!!!!!!!!!
            System.out.println(Character.isLetter(letter));
            //!!!!!!!!!
            if(letter.equals(' ')) {
            } else {
                set.add(letter);
            }
        }
        set.forEach((key) -> {
            System.out.println(key + " " + set.size());});

        return set.size() == 26;
    }

}
