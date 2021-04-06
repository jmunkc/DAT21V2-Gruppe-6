import java.util.ArrayList;

public class SearchArrayList {

    private static final String problemDescription = "" +
            "Skriv en metode med navnet doesArraylistContainString," +
            "der modtager 2 parametrer: en arraylist og en streng. " +
            "Metoden returnere en boolean: \n" +
            "* Hvis strengen ikke findes i arraylisten indsættes " +
            "strengen og metoden returnere false \n" +
            "* Hvis strengen findes i arraylisten returnere metoden " +
            "true og printer \"the string has been found\"";

    public static void printProblemDescription(){
        System.out.println(problemDescription);
    }

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
