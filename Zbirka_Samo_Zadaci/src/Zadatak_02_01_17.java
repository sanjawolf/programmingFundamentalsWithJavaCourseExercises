import java.util.Scanner;

public class Zadatak_02_01_17 {

    /*?????????????????????????????????????????????????????????????????????*/

    public static int duplikati(int [] a, int n, int [] b) {

        int m=0;

        for(int i=0; i<n; i++){

            for(int j=i+1; j<n; j++){

                if(a[i]==a[j]){

                    m+=1;
                    break;
                }
            }
        }

        return m;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Unesite dimenziju niza: ");

        int n=Integer.parseInt(sc.nextLine());

        if(n<=0 || n>600) System.out.println("Greska: neispravan unos.");

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

//            if(sadrzi(niz, m)==1) System.out.printf("Nadmorska visina %d se nalazi medju podacima.\n", m);
//
//            else System.out.printf("Nadmorska visina %d se ne nalazi medju podacima.\n", m);
//
//            System.out.printf("Pozicija prvog pojavljivanja: %d\n", prva_pozicija(niz, m));
//
//            System.out.printf("Pozicija poslednjeg pojavljivanja: %d\n", poslednja_pozicija(niz, m));
        }
    }
}
