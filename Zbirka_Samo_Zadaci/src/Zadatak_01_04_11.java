import java.util.Scanner;

public class Zadatak_01_04_11 {

    public static int sadrzi(int x, int c){

        String xTekst=x+"";

        String cTekst=c+"";

        if(xTekst.contains(cTekst))  return 1;

        else return 0;

//        for(int i=0; i<xTekst.length(); i++){
//
//            char karakter=xTekst.charAt(i);
//
//            if(karakter==cTekst.charAt(0)){
//
//                return 1;
//            }
//
//
//        }
//
//        return 0;


    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite broj i cifru: ");

        String tekst=sc.nextLine();

        String [] brojevi=tekst.split(" ");

        int x=Integer.parseInt(brojevi[0]);

        int c=Integer.parseInt(brojevi[1]);

        if(c<0 || c>10) System.out.println("Greska: neispravan unos.");

        else{

            if(sadrzi(x, c)==1) System.out.printf("Cifra %d se nalazi u zapisu broja %d.", c, x);
            else System.out.printf("Cifra %d se ne nalazi u zapisu broja %d.", c, x);
        }
    }
}
