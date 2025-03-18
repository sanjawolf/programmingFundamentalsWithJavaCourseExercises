import java.util.Scanner;

public class Zadatak_01_04_31 {

    /*??????????????????????????????????????????????????????????????????????????????????*/

    public static void grafikon_v(int a, int b, int c, int d){

        for(int i=1; i<=a-1; i++){

            System.out.println("*");
        }

        System.out.print("*");
        System.out.print("*");

//        for(int i=1; i<=b; i++){
//
//            System.out.print("*");
//        }
        for(int i=c-1; i>=1; i--){

            System.out.println("*");
        }
//
//        for(int i=1; i<=d; i++){
//
//            System.out.print("*");
//
//            System.out.println();
//        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite brojeve: ");

        String brojeviTekst=sc.nextLine();

        String [] brojevi=brojeviTekst.split(" ");

        int a=Integer.parseInt(brojevi[0]);
        int b=Integer.parseInt(brojevi[1]);
        int c=Integer.parseInt(brojevi[2]);
        int d=Integer.parseInt(brojevi[3]);

        if(a>0 && b>0 && c>0 && d>0) grafikon_v(a, b, c, d);
        else System.out.println("Greska: neispravan unos.");
    }
}
