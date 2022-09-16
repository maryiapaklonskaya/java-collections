import java.util.ArrayList;
import java.util.List;


public class List1 {

    public static void main(String[] args) {

    }

    public static void arrayList(String[] args) {

        final List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Doe");

        for (String name : names) {
            System.out.println(name);
        }
    }

}
