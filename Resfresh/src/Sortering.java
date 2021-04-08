import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sortering {
    static ArrayList<String> sorteringArrayList = new ArrayList<>();

    public static void main(String[] args) {
     sorterProblem1();
    }
    //problembeskrivelse
    private final static String problemDescription = "Skriv en metode, der indlæser 5 tekststrenge fra tastaturet og udskriver dem på skærmen i alfabetisk faldende orden på skærmen";

    //metode til at printe problembeskrivelse

    public static void printProblemDescription(){
        System.out.println(problemDescription);
        }

    public static void sorterProblem1(){
        Scanner sorteringsScanner = new Scanner(System.in);
        System.out.println("Type 5 Strings");
        for (int i = 0; i < 5; i++){
            sorteringArrayList.add(sorteringsScanner.nextLine());
        }
        System.out.println("This is your chosen Strings in alphabetical order");
        Collections.sort(sorteringArrayList);
        System.out.println(sorteringArrayList);
        System.out.println("This is your chosen Strings in reversed alphabetical order");
        Collections.reverse(sorteringArrayList);
        System.out.println(sorteringArrayList);
    }

}

