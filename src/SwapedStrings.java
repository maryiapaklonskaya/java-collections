import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SwapedStrings {

    public static void main(String[] args){
        String[] arr = {"aa", "ba", "ca", "ab", "bb", "bc"};
        //ab ab ca aa ba bc
        toSwapWords(arr);
    }

    //a b c a b b
    //a b c a b b

    public static void toSwapWords(String[] arr){
        Map<String, Boolean> mapWordAndBoolean = new LinkedHashMap<>();
        Map<String, String> mapWordAndLetter = new LinkedHashMap<>();
        Map<String, Integer> mapWordAndIndex = new LinkedHashMap<>();
        String firstLetter = "";
        int i = 0;

        for(String element : arr){
            firstLetter = element.substring(0, 1);
            mapWordAndBoolean.put(element, true);
            mapWordAndLetter.put(element, firstLetter);
            mapWordAndIndex.put(element, i);
            i++;
        }

        System.out.println("the initial array looks like: \t" + Arrays.toString(arr));

        mapWordAndLetter.forEach((key1, value1) -> {
            mapWordAndLetter.forEach((key2, value2) -> {
                if ((!key1.equals(key2)) && (value1.equals(value2)) && (mapWordAndBoolean.get(key1)) && (mapWordAndBoolean.get(key2))) {
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