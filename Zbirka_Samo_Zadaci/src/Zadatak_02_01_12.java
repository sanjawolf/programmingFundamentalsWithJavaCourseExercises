import java.util.Scanner;

public class Zadatak_02_01_12 {

    public static void ucitaj(int [] a, int n){

        Scanner sc=new Scanner(System.in);

        String elementiTekst=sc.nextLine();

        String [] elementi=elementiTekst.split(" ");

        for(int i=0; i<n; i++){

            a[i]=Integer.parseInt(elementi[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite dimenziju niza: ");

        int n=Integer.parseInt(sc.nextLine());

        if(n<=0 || n>100) System.out.println("Greska: neispravan unos.");

        else{

            System.out.print("Unesite elemente niza: ");

            int [] a=new int[n];

            ucitaj(a, n);

            int max=Integer.MIN_VALUE;

            int temp=-1;

            for(int i=0; i<n; i++){

                if(a[i]>max){

                    max=a[i];

                    temp=i;
                }
            }

            int sum=0;

            for(int i=0; i<temp; i++){

                if (a[i]%2==0) sum+=1;
            }

            System.out.printf("Rezulat: %d", sum);


        }
    }
}
