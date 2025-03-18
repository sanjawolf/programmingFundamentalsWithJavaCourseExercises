import java.util.Scanner;

public class Zadatak_02_03_26 {

    public static void obrni(String s){

        StringBuilder t=new StringBuilder();

        for(int i=s.length()-1; i>=0; i--){

            char karakter=s.charAt(i);

            t.append(karakter);
        }

        System.out.print(t.toString());
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite nisku s: ");

        String s=sc.nextLine();

        if(s.length()<=20){

            System.out.print("Rezultat: ");

            obrni(s);
        }


    }
}
