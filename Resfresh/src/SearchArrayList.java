import java.util.ArrayList;

public class SearchArrayList {

    public static boolean doesArrayListContainString(ArrayList<String> listToCheck, String stringToCheck){

        boolean flag = false;

        if (listToCheck.contains(stringToCheck)) {

            flag = true;

            System.out.println("The string has been found");
        }

        else {
            listToCheck.add(stringToCheck);
        }


        return flag;
    }
}
