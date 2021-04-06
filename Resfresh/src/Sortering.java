import java.util.ArrayList;
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

    public static void sorterProblemet(){
        Scanner sorteringsScanner = new Scanner(System.in);
        System.out.println("Indtast 5 ord");
        String firstWord = sorteringsScanner.nextLine();
        String secondWord = sorteringsScanner.nextLine();
        String thirdWord = sorteringsScanner.nextLine();
        String fourthWord = sorteringsScanner.nextLine();
        String fifthWord = sorteringsScanner.nextLine();


        sorteringArrayList.add(sorteringsScanner.nextLine());

        sorteringArrayList.add(secondWord);
        sorteringArrayList.add(thirdWord);
        sorteringArrayList.add(fourthWord);
        sorteringArrayList.add(fifthWord);
        System.out.println(sorteringArrayList);
    }
    public static void sorterProblem1(){
        Scanner sorteringsScanner = new Scanner(System.in);
        System.out.println("Type 5 Strings");
            if (sorteringArrayList.size() = "")
        sorteringArrayList.add(sorteringsScanner.nextLine());
        System.out.println(sorteringArrayList);
    }

}

