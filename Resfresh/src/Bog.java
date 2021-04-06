import java.util.ArrayList;

public class Bog {
    static String problemDesription = "Skriv enklasse kaldet Bog, der indeholderISBN-nummer,titelog udgivelsesår.Skriv flg. metoder";
    String isbnNumber;
    String titel;
    int udgivelsesÅr;

    public Bog(String isbnNumber, String titel, int udgivelsesÅr){
        this.isbnNumber = isbnNumber;
        this.titel = titel;
        this.udgivelsesÅr = udgivelsesÅr;
    }

    //metode til print af opgave beskrivelse
    public static void printProblem(){
        System.out.println(problemDesription);
    }

    //getters:
    public String getIsbnNumber(){
        return this.isbnNumber;
    }
    public String getTitel(){
        return this.titel;
    }
    public int getUdgivelsesÅr(){
        return this.udgivelsesÅr;
    }

    //setters:
    public String setIsbnNumber(String isbnNumber){
    return this.isbnNumber;
    }

    public String setTitel(String titel){
        return this.titel;
    }

    public int setUdgivelsesår(int udgivelsesÅr){
        return this.udgivelsesÅr;
    }

    public String toString(){
        return toString();
    }

}
class Biliotek{
    public static void main(String[] args) {
        ArrayList<Bog> bogArrayList = new ArrayList<>();
        Bog bog1 = new Bog("4121", "Hello", 1921);
        Bog bog2 = new Bog("4222", "To",1999);
        Bog bog3 = new Bog("1939231","You", 1992);

        bogArrayList.add(bog1);
        bogArrayList.add(bog2);
        bogArrayList.add(bog3);

    }
}
