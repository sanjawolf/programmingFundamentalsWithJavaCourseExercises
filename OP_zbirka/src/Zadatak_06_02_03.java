import java.util.Scanner;

public class Zadatak_06_02_03 {

    public static String kapitalizuj(String s){

        s=(s.charAt(0)+"").toUpperCase()+s.substring(1);

        return s;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesi tekst: ");

        String text=sc.nextLine();

        System.out.printf("Tekst sa velikim pocetnim slovom je: %s", kapitalizuj(text));
    }
}
