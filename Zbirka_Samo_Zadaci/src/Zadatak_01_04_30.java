import java.util.Scanner;

public class Zadatak_01_04_30 {

    public static void grafikon_h(int a, int b, int c, int d){

        for(int i=1; i<=a; i++) System.out.print("*");
        System.out.println();
        for(int i=1; i<=b; i++) System.out.print("*");
        System.out.println();
        for(int i=1; i<=c; i++) System.out.print("*");
        System.out.println();
        for(int i=1; i<=d; i++) System.out.print("*");
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

        if(a>0 && b>0 && c>0 && d>0) grafikon_h(a, b, c, d);
        else System.out.println("Greska: neispravan unos.");
    }
}
