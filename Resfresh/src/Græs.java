import java.util.Scanner;
public class Græs {
    public static void main(String[] args) {
        System.out.println("hvor langt er dit græs i cm?");
        Scanner grassLength = new Scanner(System.in);
        int gL = grassLength.nextInt();


        System.out.println("Hvilken længde skal det have før det skal slås?");
        Scanner cutWhen = new Scanner(System.in);
        int cW = cutWhen.nextInt();

    }
}