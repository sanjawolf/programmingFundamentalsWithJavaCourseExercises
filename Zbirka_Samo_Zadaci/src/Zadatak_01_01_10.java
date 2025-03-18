import java.util.Scanner;

public class Zadatak_01_01_10 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Unesite trocifreni broj: ");
        int number=Integer.parseInt(sc.nextLine());

        int jedinice=number%10;
        int dvocifreni_zavrsetak=number%100;
        int desetice=dvocifreni_zavrsetak/10;
        int stotine=number/100;

        System.out.println("Cifra jedinica: "+jedinice);
        System.out.println("Cifra desetica: "+desetice);
        System.out.println("Cifra stotina: "+stotine);
    }
}
