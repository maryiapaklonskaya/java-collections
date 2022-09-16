import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapElement {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Maryia");
        names.add("Maryia");
        names.add("Maryia");
        names.add("Maryia");
        names.add("Vlad");
        names.add("Vlad");
        names.add("Andrew");
        names.add("Andrew");
        names.add("Andrew");
        names.add("Kristine");
        countDuplicates(names);



//        final Map<Integer, String> ageToNames = new HashMap<>();
//
//        ageToNames.put(11, "Andrew");
//
//        ageToNames.remove(22);
//
//        System.out.println(ageToNames.get(11));
//
//        for (final Integer key : ageToNames.keySet()) {
//            System.out.println("key is map: " + key);
//
//        }
//        for (final String value : ageToNames.values()) {
//            System.out.println("key is map: " + value);
//        }
//
//        for (final Map.Entry<Integer, String> ageToName : ageToNames.entrySet()){
//            System.out.println("value in map is: " + ageToName.getKey() + " is " + ageToName.getValue());
//        }
//
//        ageToNames.forEach((key, value) -> {
//            System.out.println("key is " + key + " and the value is " + value);
//        });


    }




    public static void countFrequency(ArrayList<String> input) {
        int count;
        final Map<String, Integer> namesStorage = new HashMap<>();

        for (String element : input) {
            count = Collections.frequency(input, element);
            namesStorage.put(element, count);
        }
        System.out.println(namesStorage);
    }

    static void countDuplicates(ArrayList<String> list){
        Map<String, Integer> map = new HashMap<>();

        for(String item : list) {
            if(map.containsKey(item)){
                map.put(item, map.get(item) + 1);
            }
            else{
                map.put(item, 1);
            }
        }

        map.forEach((key, value) -> {
            System.out.println("name " + key + " appears " + value  + " times");
        });
    }






}
