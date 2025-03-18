import java.util.Scanner;

public class Zadatak_02_01_18 {

    public static int palindrom(char [] tekst){

        int n=tekst.length;

        for(int i=0; i<n/2; i++){

            String karakter1=(tekst[i]+"").toLowerCase();

            String karakter2=(tekst[n-i-1]+"").toLowerCase();

            if(karakter1.equals(karakter2)) return 1;
        }

        return 0;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite dimenziju niza: ");

        int n=Integer.parseInt(sc.nextLine());

        if(n<=0 || n>200) System.out.println("Greska: neispravan unos.");

        else{

            System.out.println("Unesite elemente niza: ");

            String tekst=sc.nextLine();

            char [] niz=tekst.toCharArray();

            if(palindrom(niz)==1 || n==1) System.out.println("Niz jeste palindrom.");
            else System.out.println("Niz nije palindrom.");
        }
    }
}
