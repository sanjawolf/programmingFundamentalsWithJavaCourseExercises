import java.util.Scanner;

public class Zadatak_02_01_13 {

    public static void ucitaj(int [] a, int n){

        Scanner sc=new Scanner(System.in);

        String elementiTekst=sc.nextLine();

        String [] elementi=elementiTekst.split(" ");

        for(int i=0; i<n; i++){

            a[i]=Integer.parseInt(elementi[i]);
        }
    }

    public static int zbir(int[] a, int n, int i, int j){

        int sum=0;

        for(int k=i; k<=j; k++) sum+=a[k];

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite dimenziju niza: ");

        int n=Integer.parseInt(sc.nextLine());

        if(n<=0 || n>100) System.out.println("Greska: neispravan unos.");

        else {

            System.out.print("Unesite elemente niza: ");

            int[] a = new int[n];

            ucitaj(a, n);

            System.out.print("Unesite vrednosti za i i j: ");

            String elementiTekst=sc.nextLine();

            String [] elementi=elementiTekst.split(" ");


            int i=Integer.parseInt(elementi[0]);

            int j=Integer.parseInt(elementi[1]);

            if(n<j+1) System.out.println("Greska: neispravan unos.");

            else{

                System.out.printf("Zbir je: %d", zbir(a, n, i, j));
            }

        }


    }
}
