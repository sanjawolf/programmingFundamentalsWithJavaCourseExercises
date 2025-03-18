import java.util.Scanner;

public class Zadatak_02_01_14 {

    public static void ucitaj(float [] a, int n){

        Scanner sc=new Scanner(System.in);

        String elementiTekst=sc.nextLine();

        String [] elementi=elementiTekst.split(" ");

        for(int i=0; i<n; i++){

            a[i]=Float.parseFloat(elementi[i]);
        }
    }

    public static float zbir_pozitivnih(float [] a, int n, int k){

        int sum=0;

        float sumEl=0;

        for(int i=0; i<n; i++){

            if(a[i]>0){

                sum+=1;

                if(sum>k){

                    break;
                }

                else{

                    sumEl+=a[i];
                }
            }


        }

        return sumEl;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite dimenziju niza: ");

        int n=Integer.parseInt(sc.nextLine());

        if(n<=0 || n>100) System.out.println("Greska: neispravan unos.");

        else {

            System.out.print("Unesite elemente niza: ");

            float[] a = new float[n];

            ucitaj(a, n);

            System.out.print("Unesite vrednost k: ");

            int k=Integer.parseInt(sc.nextLine());

            if(n-1>=k && k>0){

                float zbirPoz=zbir_pozitivnih(a, n, k);

                System.out.printf("Zbir je: %.2f", zbirPoz);
            }

            else if(n-1<k) System.out.printf("Zbir je: %.2f", 0.00);

            else System.out.println("Greska: neispravan unos.");

        }
    }
}
