import java.util.Scanner;

public class Zadatak_01_02_10 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Unesite sifru: ");

        String text=sc.nextLine();

        char character1=text.charAt(0);

        char character2=text.charAt(1);

        char character3=text.charAt(2);

        String code;

        if((Character.isUpperCase(character1) || Character.isLowerCase(character1) || Character.isLetterOrDigit(character1)) && (Character.isUpperCase(character2) || Character.isLowerCase(character2) || Character.isLetterOrDigit(character2)) && (Character.isUpperCase(character3) || Character.isLowerCase(character3) || Character.isLetterOrDigit(character3))){

            code=text.toLowerCase();

            System.out.printf("Rezultat: %s", code);
        }

        else if(!Character.isLetterOrDigit(character1))  System.out.printf("Greska: %c je neispravan karakter.", character1);

        else if(!Character.isLetterOrDigit(character2))    System.out.printf("Greska: %c je neispravan karakter.", character2);

        else if(!Character.isLetterOrDigit(character3))    System.out.printf("Greska: %c je neispravan karakter.", character3);
    }
}
