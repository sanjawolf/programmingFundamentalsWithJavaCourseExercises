import java.util.Scanner;

public class Zadatak_02_01_35 {

    public static int [] ubacuje_na_kraj(int rB, int[] red){

        int n=red.length;

        int [] noviRed=new int[n+1];

        for(int i=0; i<n; i++){

            noviRed[i]=red[i];

        }

        noviRed[n]=rB;

        return noviRed;
    }

    public static int [] ubacuje_na_pocetak(int rB, int[] red){

        int n=red.length;

        int [] noviRed=new int[n+1];

        noviRed[0]=rB;

        for(int i=1; i<=n; i++){

            noviRed[i]=red[i-1];

        }

        return noviRed;
    }

    public static int [] ubacuje_na_k(int rB, int[] red, int k){

        int n=red.length;

        int [] noviRed=new int[n+1];

        for(int i=0; i<k; i++){

            noviRed[i]=red[i];

        }

        noviRed[k]=rB;

        for(int i=k+1; i<n+1; i++){

            noviRed[i]=red[i-1];

        }

        return noviRed;
    }

    public static int [] izbacuje_na_k(int[] red, int k){

        int n=red.length;

        int [] noviRed=new int[n-1];

        int temp=-1;

        for(int i=0; i<n; i++){

            if(red[i]==k) temp=i;

        }

        for(int i=0; i<temp; i++){

            noviRed[i]=red[i];

        }

        for(int i=temp; i<n-1; i++){

            noviRed[i]=red[i+1];

        }

        return noviRed;
    }
    public static int [] izbacuje_prvog(int[] red){

        int n=red.length;

        int [] noviRed=new int[n-1];

        for(int i=0; i<n-1; i++){

            noviRed[i]=red[i+1];

        }

        return noviRed;
    }

    public static int [] izbacuje_poslednjeg(int[] red){

        int n=red.length;

        int [] noviRed=new int[n-1];

        for(int i=0; i<n-1; i++){

            noviRed[i]=red[i];

        }

        return noviRed;
    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite trenutni broj klijenata: ");

        int n=Integer.parseInt(sc.nextLine());

        if(n<=0 || n>2000) System.out.println("Greska: neispravan unos.");

        else{

            System.out.print("Unesite niz sa rednim brojevima klijenata: ");

            String tekst=sc.nextLine();

            String [] elementi=tekst.split(" ");

            int [] niz=new int[n];

            for(int i=0; i<n; i++){

                niz[i]=Integer.parseInt(elementi[i]);
            }

            System.out.print("Unesite klijenta kojeg treba ubaciti u niz: ");

            int rBUK=Integer.parseInt(sc.nextLine());

            System.out.print("Niz nakon ubacivanja klijenta: ");

            for(int el: ubacuje_na_kraj(rBUK, niz)) System.out.printf("%d ", el);

            System.out.println();

            System.out.print("Unesite prioritetnog klijenta kojeg treba ubaciti u niz: ");

            int rBUP=Integer.parseInt(sc.nextLine());

            System.out.print("Niz nakon ubacivanja klijenta: ");

            for(int el: ubacuje_na_pocetak(rBUP, ubacuje_na_kraj(rBUK, niz))) System.out.printf("%d ", el);

            System.out.println();

            System.out.print("Unesite prioritetnog klijenta kojeg treba ubaciti u niz i njegovu poziciju: ");

            String klijentPozicija=sc.nextLine();

            String [] kPTekst=klijentPozicija.split(" ");

            int rBU=Integer.parseInt(kPTekst[0]);

            int k=Integer.parseInt(kPTekst[1]);

            System.out.print("Niz nakon ubacivanja klijenta: ");

            for(int el: ubacuje_na_k(rBU, ubacuje_na_pocetak(rBUP, ubacuje_na_kraj(rBUK, niz)), k)) System.out.printf("%d ", el);

            System.out.println();

            System.out.println("Niz nakon odlaska klijenta: ");

            for(int el: izbacuje_prvog(ubacuje_na_k(rBU, ubacuje_na_pocetak(rBUP, ubacuje_na_kraj(rBUK, niz)), k))) System.out.printf("%d ", el);

            System.out.println();

            System.out.println("Niz nakon odlaska poslednjeg klijenta: ");

            for(int el: izbacuje_poslednjeg(izbacuje_prvog(ubacuje_na_k(rBU, ubacuje_na_pocetak(rBUP, ubacuje_na_kraj(rBUK, niz)), k)))) System.out.printf("%d ", el);

            System.out.println();

            System.out.println("Unesite redni broj klijenta koji je napustio red: ");

            int rB=Integer.parseInt(sc.nextLine());

            System.out.println("Niz nakon odlaska klijenta: ");

            for(int el: izbacuje_na_k(izbacuje_poslednjeg(izbacuje_prvog(ubacuje_na_k(rBU, ubacuje_na_pocetak(rBUP, ubacuje_na_kraj(rBUK, niz)), k))), rB)) System.out.printf("%d ", el);


        }



    }
}
