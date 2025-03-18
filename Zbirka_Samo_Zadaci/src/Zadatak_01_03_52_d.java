import java.util.Scanner;

public class Zadatak_01_03_52_d {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite broj n: ");

        int n=Integer.parseInt(sc.nextLine());

        // Iscrtavanje ruba
        for (int i = 0; i < n; i++) {
            // Iscrtavanje razmaka
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Iscrtavanje zvezdica za trenutni red
            if (i == 0) {
                // Iscrtavanje prvog reda trougla
                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("*");
                }
            }

            else if(i == n - 1) {
                // Iscrtavanje poslednjeg reda trougla
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                    System.out.print(" ");
                }
            }

            else {
                // Iscrtavanje ostalih redova trougla
                System.out.print("*");
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            // Prelazak u novi red
            System.out.println();
        }

//        for(int i=1; i<=n-1; i++){
//
//            for(int j=1; j<=n-i; j++) System.out.print(" ");
//
//            System.out.print("*");
//
//            for(int j=1; j<2*(i-1)+1; j++) System.out.print(" ");
//
//            if(i>1) System.out.print("*");
//
//            System.out.println();
//
//        }
//
//        for(int i=1; i<=n; i++){
//
//            System.out.print("*");
//            System.out.print(" ");
//        }
    }
}
