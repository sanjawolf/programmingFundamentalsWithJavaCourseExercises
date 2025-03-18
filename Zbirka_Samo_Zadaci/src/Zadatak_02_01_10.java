import java.util.Scanner;

public class Zadatak_02_01_10 {

    public static void ucitaj(int [] a, int n){

        Scanner sc=new Scanner(System.in);

        String elementiTekst=sc.nextLine();

        String [] elementi=elementiTekst.split(" ");

        for(int i=0; i<n; i++){

            a[i]=Integer.parseInt(elementi[i]);
        }
    }

    public static void ispisi(int [] a, int n){

        for(int el: a) System.out.print(el+" ");
    }

    public static int suma(int [] a, int n){

        int sum=0;

        for(int el: a) sum+=el;

        return sum;
    }

    public static float prosek(int [] a, int n){

        return (float) suma(a, n)/n;
    }

    public static  int maksimum(int [] a, int n){

        int max=Integer.MIN_VALUE;

        for(int i=0; i<n; i++){

            if(a[i]>max) max=a[i];
        }

        return max;
    }

    public static int pozicija_minimum(int [] a, int n){

        int min=Integer.MAX_VALUE;

        int i;

        int temp=-1;

        for(i=0; i<n; i++){

            if(a[i]<min){

                min=a[i];

                temp=i;
            }

        }

        return temp;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Unesite dimenziju niza: ");

        int n=Integer.parseInt(sc.nextLine());

        if(n<=0 || n>1000) System.out.println("Greska: neispravan unos.");

        else{

            System.out.print("Unesite elemente niza: ");

            int [] a=new int[n];

            ucitaj(a, n);

            System.out.print("Vreme trcanja takmicara: ");

            ispisi(a, n);

            System.out.println();

            System.out.printf("Ukupno vreme: %d\n", suma(a, n));

            System.out.printf("Prosecno vreme trcanja: %.2f\n", prosek(a, n));

            System.out.printf("Maksimalno vreme trcanja: %d\n", maksimum(a, n));

            System.out.printf("Indeks pobednika: %d", pozicija_minimum(a, n));
        }

    }
}
