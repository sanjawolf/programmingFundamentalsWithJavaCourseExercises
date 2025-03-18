import java.util.Scanner;

public class Zadatak_02_01_25 {

    public static int [] obrce(int [] a){

        int n=a.length;

        int [] b=new int[n];

        for(int i=0; i<n; i++){

            b[i]=a[n-i-1];
        }

        return b;
    }

    public static int [] rotira_za_jedan(int [] a){

        int n=a.length;

        int [] b=new int[n];

        for(int i=0; i<n-1; i++){

            b[i]=a[i+1];
        }

        b[n-1]=a[0];

        return b;
    }

    public static int [] rotira_za_k(int [] a, int k){

        int n=a.length;

        int [] b=new int[n];

        for(int i=0; i<k; i++){

            b[i]=a[n-k+i];
        }

        for(int i=k; i<n; i++){

            b[i]=a[i-k];
        }


        return b;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite dimenziju niza: ");

        int n=Integer.parseInt(sc.nextLine());

        if(n<=0 || n>100) System.out.println("Greska: neispravan unos.");

        else{

            System.out.print("Unesite elemente niza: ");

            String tekst=sc.nextLine();

            String [] elementi=tekst.split(" ");

            int [] niz=new int[n];

            for(int i=0; i<n; i++){

                niz[i]=Integer.parseInt(elementi[i]);
            }

            System.out.print("Elementi niza nakon obrtanja: ");

            for(int el: obrce(niz)){

                System.out.printf("%d ", el);
            }

            System.out.println();

            System.out.print("Elementi niza nakon rotiranja za 1 mesto ulevo: ");

            for(int el: rotira_za_jedan(obrce(niz))){

                System.out.printf("%d ", el);
            }

            System.out.println();

            System.out.print("Unesite jedan pozitivan ceo broj: ");

            int k=Integer.parseInt(sc.nextLine());

            System.out.printf("Elementi niza nakon rotiranja za %d mesta ulevo: ", k);

            for(int el: rotira_za_k(rotira_za_jedan(obrce(niz)), k)){

                System.out.printf("%d ", el);
            }

        }
    }
}
