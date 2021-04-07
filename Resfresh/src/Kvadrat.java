public class Kvadrat {

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

}