import java.math.BigDecimal;
import java.util.Scanner;

public class Zadatak_02_01_05 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite broj autobusa: ");

        int n=Integer.parseInt(sc.nextLine());

        if(n<=0 || n>200) System.out.println("Greska: neispravan unos.");

        else{

            System.out.println("Unesite vreme putovanja: ");

            String tekst=sc.nextLine();

            String [] brojevi=tekst.split(" ");

            int[] niz=new int[n];

            for(int i=0; i<n; i++){

                niz[i]=Integer.parseInt(brojevi[i]);
            }

            System.out.println("Unesite vrednosti k, t i m: ");

            String kTMTekst=sc.nextLine();

            String [] kTM=kTMTekst.split(" ");

            int k=Integer.parseInt(kTM[0]);

            int t=Integer.parseInt(kTM[1]);

            int m=Integer.parseInt(kTM[2]);

            if(t<=n){

                for(int i=k-1; i<=t-1; i++){

                    niz[i]+=m;
                }

                System.out.println("Vreme putovanja nakon izmena: ");
                for(int el: niz) System.out.print(el+" ");
            }

            else System.out.println("Greska: neispravan unos.");
        }

    }
}
