import java.util.*;

public class Collection {

    public static void main(String[] args) {

        whichIsFirst('z', 'b');

        //HASH SET - order of the items is not kept

//        final Set<Integer> numberSet = new HashSet<>();
//        //System.out.println(numberSet.isEmpty());
//        numberSet.add(12);
//        numberSet.add(27);
//        numberSet.add(1);
//
//        numberSet.forEach(element -> {
//            if (element % 2 == 0) { System.out.println(element); }
//        });

    }

    public static void mainTree(String[] args) {
        //TREE SET - natural order of numbers and deletes copies?

        final Set<Integer> numberSet = new TreeSet<>();
        //System.out.println(numberSet.isEmpty());
        numberSet.add(12);
        numberSet.add(27);
        numberSet.add(1);

        numberSet.forEach(element -> {
            if (element % 2 == 0) {
                System.out.println(element);
            }
        });
    }

    public static void mainLinkedHashSet(String[] args) {
        //LINKED HASH SET - hash table with a list linked table
        //keeps the order you put them in, but does not stores duplicates

        final Set<Integer> numberSet = new LinkedHashSet<>();
        //System.out.println(numberSet.isEmpty());
        numberSet.add(12);
        numberSet.add(27);
        numberSet.add(1);

        numberSet.forEach(element -> {
            if (element % 2 == 0) {
                System.out.println(element);
            }
        });

    }

    public static void whichIsFirst(char firstChar, char secondChar) {

        final Set<Character> charSet = new TreeSet<>();
        charSet.add(firstChar);
        charSet.add(secondChar);

        Object[] arr = charSet.toArray();

        System.out.print(arr[0] + " comes before " + arr[1] + " in the alphabet");

    }



}
