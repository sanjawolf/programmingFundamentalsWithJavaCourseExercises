import java.util.Scanner;

public class Zadatak_01_04_29 {

    public static void romb(int n){

        for(int i=n-1; i>=0; i--){

            for (int j=1; j<=i; j++) System.out.print(" ");
            for (int j=1; j<=n; j++) System.out.print("*");
            System.out.println();
        }


    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite broj n: ");

        int n=Integer.parseInt(sc.nextLine());

        if(n>0) romb(n);
        else System.out.println("Greska: neispravan unos.");
    }
}
