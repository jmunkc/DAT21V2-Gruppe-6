import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        // Method check SearchArrayList
        SearchArrayList.printProblemDescription();

        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");

        System.out.println(list);

        SearchArrayList.doesArrayListContainString(list, "one");
        SearchArrayList.doesArrayListContainString(list, "four");

        System.out.println(list);
    }
}
