import java.util.Scanner;

public class Zadatak_02_01_26 {

    /*???????????????????????????????????????????????????????????????????????????????*/

    public static void ukrsti(int [] a, int [] b, int n, int [] c){

        c[0]=a[0];
        c[1]=b[0];
        c[2]=a[1];
        c[3]=b[1];
        c[4]=a[2];
        c[5]=b[2];

        for(int j=2; j<n; j+=2){

           for(int i=j-1; i<j; i++){

               c[j]=a[j-i];

               c[j+1]=b[j-i];
           }
        }

        System.out.println("Rezultujuci niz:");

        for(int el: c) System.out.printf("%d ", el);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite dimenziju nizova: ");

        int n=Integer.parseInt(sc.nextLine());

        if(n<=0 || n>100) System.out.println("Greska: neispravan unos.");

        else{

            System.out.print("Unesite elemente niza a: ");

            String tekstA=sc.nextLine();

            String [] elementiA=tekstA.split(" ");

            int [] nizA=new int[n];

            for(int i=0; i<n; i++){

                nizA[i]=Integer.parseInt(elementiA[i]);
            }

            System.out.print("Unesite elemente niza b: ");

            String tekstB=sc.nextLine();

            String [] elementiB=tekstB.split(" ");

            int [] nizB=new int[n];

            for(int i=0; i<n; i++){

                nizB[i]=Integer.parseInt(elementiB[i]);
            }

            int [] nizC=new int[2*n];

            ukrsti(nizA, nizB, n, nizC);
        }
    }
}
