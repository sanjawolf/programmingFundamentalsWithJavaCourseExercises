import java.util.Scanner;

public class Zadatak_02_03_13 {

    public static void kopiranje(String s, int n){

        String t="";

        for(int i=0; i<n; i++){

            char karakter=s.charAt(i);

            t=t.concat(karakter+"");
        }

        System.out.print(t);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite nisku: ");

        String s=sc.nextLine();

        System.out.print("Unesite broj n: ");

        int n=Integer.parseInt(sc.nextLine());

        if(s.length()>20 || n>s.length()) System.out.println("Greska: neispravan unos.");

        else{

            System.out.print("Rezultujuca niska: ");

            kopiranje(s, n);
        }
    }
}
