import java.util.Scanner;

public class Zadatak_02_01_16 {

    public static int sadrzi(int [] niz, int m){

        for(int i=0; i< niz.length; i++){

            if(niz[i]==m){

                return 1;
            }
        }

        return 0;
    }

    public static int prva_pozicija(int [] niz, int m){

        for(int i=0; i<niz.length; i++){

            if(niz[i]==m){

                return i;
            }
        }

        return -1;
    }

    public static int poslednja_pozicija(int [] niz, int m){

        for(int i= niz.length-1; i>=0; i--){

            if(niz[i]==m){

                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Unesite dimenziju niza: ");

        int n=Integer.parseInt(sc.nextLine());

        if(n<=0 || n>100) System.out.println("Greska: neispravan unos.");

        else{

            System.out.println("Unesite podatke: ");

            String podaciTekst=sc.nextLine();

            String [] podaci=podaciTekst.split(" ");

            int [] niz=new int[n];

            for(int i=0; i<n; i++){

                niz[i]=Integer.parseInt(podaci[i]);

            }

            System.out.println("Unesite vrednost m: ");

            int m=Integer.parseInt(sc.nextLine());

            if(sadrzi(niz, m)==1) System.out.printf("Nadmorska visina %d se nalazi medju podacima.\n", m);

            else System.out.printf("Nadmorska visina %d se ne nalazi medju podacima.\n", m);

            System.out.printf("Pozicija prvog pojavljivanja: %d\n", prva_pozicija(niz, m));

            System.out.printf("Pozicija poslednjeg pojavljivanja: %d\n", poslednja_pozicija(niz, m));
        }


    }
}
