import java.util.Scanner;

public class Zadatak_02_03_28 {

    public static void sifruj(String rec){

        char [] recArr=rec.toCharArray();

        for(int i=0; i<rec.length(); i++){

            char karakter=rec.charAt(i);

            if(karakter>='a' && karakter<'z' || karakter>='A' && karakter<'Z'){

                recArr[i]=(char)(karakter+1);

            }

            else if(karakter=='z')  recArr[i]='a';

            else if(karakter=='Z')  recArr[i]='A';
        }

        for(char c: recArr) System.out.printf("%c", c);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite nisku s: ");

        String s=sc.nextLine();

        if(s.length()<=20){

            System.out.print("Rezultat: ");

            sifruj(s);
        }
    }
}
