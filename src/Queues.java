import javax.lang.model.element.Element;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Queues {

//    create a method to accept an arraylist of names
//    and count how many duplicates are in thr list after which
//    it should sort and return a non-duplicate list

    public static void main(String[] args) {
//        String[] str = new String[];
        createArrayList();

//        ArrayList<String> list = new ArrayList<String>();
//        list.add("a");
//        list.add("b");
//        list.add("c");
//        list.add("a");
//        list.add("a");
//        list.add("a");




    }

    public static void createArrayList(){
        ArrayList<String> names = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        String inputQuestion = "yes";

        do {
            System.out.println("insert name to create arraylist of names");
            String input = scan.nextLine();
            names.add(input);
            System.out.println("do you want to proceed? 'yes' or 'no':");
            inputQuestion = scan.nextLine();
        } while (inputQuestion.equals("yes"));

        System.out.println(names);
        checkDuplicates(names);
    }

    public static void checkDuplicates(ArrayList<String> input) {
        int countA;

        for (String element : input) {
            countA = Collections.frequency(input, element);
            System.out.println("the element " + element + " has " + countA + " duplicates");

        }

//        Set TreeSet

//        getFirst()
//        offer(Element e)
//        removeFirst()

    }



}
