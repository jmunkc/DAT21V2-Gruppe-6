import java.util.Scanner;

public class Sortering {

    public static void main(String[] args) {
    printProblemDescription();
    }

    //problembeskrivelse
    private final static String problemDescription = "Skriv en metode, der indlæser 5 tekststrenge fra tastaturet og udskriver dem på skærmen i alfabetisk faldende orden på skærmen";
    Scanner sorteringsScanner = new Scanner(System.in);


    //metode til at printe problembeskrivelse
    public static void printProblemDescription(){
        System.out.println(problemDescription);
    }

    public String sorterProblemet(){
        System.out.println("Indtast 5 ord");
        String firstWord = sorteringsScanner.nextLine();
        String secondWord = sorteringsScanner.nextLine();
        String thirdWord = sorteringsScanner.nextLine();
        String fourthWord = sorteringsScanner.nextLine();
        String fifthWord = sorteringsScanner.nextLine();

        return sorterProblemet();
    }

}

