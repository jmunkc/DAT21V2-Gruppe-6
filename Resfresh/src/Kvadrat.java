public class Kvadrat {

    static String problemDescription = "Skriv en metode, der som parameter modtager et heltal. " +
            "Metoden skal udskrive et kvadrat på skærmen svarende til heltallet. " +
            "Udvid metoden, så den også modtager et tegn, som er det tegn, somprintes på skærmen";

    public static void printSquare(int numberInput, String symbolInput){

        int sides = numberInput;
        String symbolPrint = symbolInput;

        for (int i = 0; i < sides; i++){
            for(int j = 0; j < sides; j++){
                System.out.print(symbolPrint);
            }
            System.out.println("");
        }
    }

    //public static void printProblemDescription(){
      //  System.out.println(problemDescription);
    //}

}