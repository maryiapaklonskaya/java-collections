import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SwapedStrings {

    public static void main(String[] args){
        String[] arr = {"aa", "ba", "ca", "ab", "bb", "bc"};
        toSwapWords(arr);
    }

    public static void toSwapWords(String[] arr){
        //creating a map for holding true\false for the keys (our initial Strings). Boolean changes if String was swapped
        Map<String, Boolean> mapWordAndBoolean = new LinkedHashMap<>();

        //creating a map for holding a key (our initial Strings) and its first letter
        Map<String, String> mapWordAndLetter = new LinkedHashMap<>();

        //creating a map for holding a key (our initial Strings) and its initial index in the initial array
        Map<String, Integer> mapWordAndIndex = new LinkedHashMap<>();

        String firstLetter = "";
        int i = 0;
        for(String element : arr){ //parcing initial array to all our maps and assigning with values
            firstLetter = element.substring(0, 1);
            mapWordAndBoolean.put(element, true);
            mapWordAndLetter.put(element, firstLetter);
            mapWordAndIndex.put(element, i);
            i++;
        }

        System.out.println("the initial array looks like: \t" + Arrays.toString(arr)); // array before changes

        mapWordAndLetter.forEach((key1, value1) -> {
            mapWordAndLetter.forEach((key2, value2) -> {
                if ((!key1.equals(key2)) && (value1.equals(value2)) && (mapWordAndBoolean.get(key1)) && (mapWordAndBoolean.get(key2))) {
                //(words should not be identical) && (first letters must be identical) && (for key1 boolean must be true) && (for key2 boolean must be true)

                    //swapping AND setting false for swapped elements
                    arr[mapWordAndIndex.get(key1)] = key2;
                    mapWordAndBoolean.put(key1, false);
                    arr[mapWordAndIndex.get(key2)] = key1;
                    mapWordAndBoolean.put(key2, false);
                }
            });
        });

        System.out.println("the final array looks like: \t" + Arrays.toString(arr));

    }
}