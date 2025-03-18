import java.util.Scanner;

public class Zadatak_01_04_20 {

    public static int armstrong(int x){

        String xTekst=x+"";

        int n=xTekst.length();

        int sum=0;

        for(int i=0; i<n; i++){

            int cifra=Integer.parseInt(xTekst.charAt(i)+"");

            sum+=Math.pow(cifra, n);
        }

        if(sum==x) return 1;
        else return 0;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite broj: ");

        int x=Integer.parseInt(sc.nextLine());

        if(x<=0) System.out.println("Greska: neispravan unos.");
        else{

            int armstrongov=armstrong(x);

            if(armstrongov==1) System.out.println("Broj je Armstrongov.");
            else System.out.println("Broj nije Armstrongov.");
        }


    }
}
