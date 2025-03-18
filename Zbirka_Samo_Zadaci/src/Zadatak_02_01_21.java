import java.util.Scanner;

public class Zadatak_02_01_21 {

    /*???????????????????????????????????????????????????????????????*/

    public static int duzina(int [] niz){

        int n=niz.length;

        int sum=0;

        for(int i=0; i<n-1; i++){

            if(niz[i]==niz[i+1]) sum+=1;
        }

        return sum;
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

            System.out.printf("");
        }
    }
}
