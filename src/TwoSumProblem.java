import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TwoSumProblem {

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 5, 5, 5};
        System.out.println("the result of the twoSum function is: ---> " + twoSum(nums, 10) + " <---");

    }

    public static int twoSum(int[] numsArray, int sumOfPair){
        int i = 0;
        Map<Integer, Integer> mapNumbers = new HashMap<>();
        Set<String> resultCombinations = new HashSet<>();
        for (Integer element : numsArray){
            mapNumbers.put(i, element);
            i++;
        }

        System.out.println(mapNumbers.size());
        System.out.println(mapNumbers);

        mapNumbers.forEach((key1, value1) -> {
            mapNumbers.forEach((key2, value2) -> {
                if((key1 != key2) && ((value1 + value2) == sumOfPair)){

                    resultCombinations.add("id: " + key2 + " the values ---> " + value1 + " + " + value2 + " == 10");
                    mapNumbers.put(key2, 0);

                }
            });
        });
        System.out.println(mapNumbers);

        resultCombinations.forEach((element) -> {
            System.out.println(element);
        });

        System.out.println(resultCombinations.size());


        return resultCombinations.size();
    }

}
