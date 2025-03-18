import java.util.Scanner;

public class Zadatak_01_04_09_d {

    public static int fibonaci(int n){

        int [] niz=new int[n+1];

        niz[0]=0;
        niz[1]=1;

        for(int i=2; i<=n; i++){

            niz[i]=niz[i-1]+niz[i-2];
        }


        return niz[n];
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite broj n: ");

        int n=Integer.parseInt(sc.nextLine());

        if(n<0){

            System.out.println("Greska: neispravan unos.");
        }

        else {

            System.out.printf("F[%d]=%d", n, fibonaci(n));
        }



    }
}
