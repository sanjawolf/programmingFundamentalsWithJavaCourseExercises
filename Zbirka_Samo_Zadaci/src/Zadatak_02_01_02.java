import java.math.BigDecimal;
import java.util.Scanner;
import java.util.Stack;

public class Zadatak_02_01_02 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite dimenziju niza: ");

        int n=Integer.parseInt(sc.nextLine());

        if(n<=0 || n>100) System.out.println("Greska: neispravan unos.");

        else{

            System.out.println("Unesite elemente niza: ");

            String tekst=sc.nextLine();

            String [] brojevi=tekst.split(" ");

            BigDecimal [] niz=new BigDecimal[n];

            for(int i=0; i<n; i++){

                niz[i]=new BigDecimal(brojevi[i]);
            }

            for(int i=0; i<n; i++){

                if(niz[i].compareTo(new BigDecimal(0))<0){

                    niz[i]=niz[i].multiply(niz[i]);
                }
            }

            System.out.print("Rezultujuci niz: ");
            for(BigDecimal el: niz) System.out.print(el+" ");
        }


    }
}
