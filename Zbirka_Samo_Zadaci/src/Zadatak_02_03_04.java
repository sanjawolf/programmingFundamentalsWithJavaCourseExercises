import java.util.Scanner;

public class Zadatak_02_03_04 {

    public static int samoglasnik(char c){

        if(c=='a' || c=='e' || c=='i' || c=='0' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U') return 1;
        else return 0;
    }

    public static int samoglasnik_na_kraju(String s){

        int n=s.length();

        char poslednji=s.charAt(n-1);

        if(samoglasnik(poslednji)==1) return 1;
        else return 0;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite nisku: ");

        String niska=sc.nextLine();

        if(samoglasnik_na_kraju(niska)==1) System.out.println("Niska se zavrsava samoglasnikom.");
        else System.out.println("Niska se ne zavrsava samoglasnikom.");
    }
}
