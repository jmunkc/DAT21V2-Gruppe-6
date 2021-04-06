import java.util.ArrayList;
import java.util.Iterator;

public class SearchArrayList {

    public static boolean doesArrayListContainString(ArrayList<String> listToCheck, String stringToCheck){

        boolean flag = false;

        for(String element : listToCheck) {

            if (element.contains(stringToCheck)) {

                flag = true;

                System.out.println("The string has been found");

            }

            else {
                listToCheck.add(stringToCheck);
            }
        }


        return flag;
    }
}
