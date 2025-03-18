import java.util.Scanner;

public class Zadatak_02_01_27 {

    public static void spoji(int a[], int b[], int n, int c[]){

        for(int i=0; i<n; i++){

            c[i]=b[i];
        }

        for(int i=n; i<2*n; i++){

            c[i]=a[i-n];
        }

        System.out.println("Rezultujuci niz:");

        for(int el: c) System.out.printf("%d ", el);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite dimenziju nizova: ");

        int n = Integer.parseInt(sc.nextLine());

        if (n <= 0 || n > 100) System.out.println("Greska: neispravan unos.");

        else {

            System.out.print("Unesite elemente niza a: ");

            String tekstA = sc.nextLine();

            String[] elementiA = tekstA.split(" ");

            int[] nizA = new int[n];

            for (int i = 0; i < n; i++) {

                nizA[i] = Integer.parseInt(elementiA[i]);
            }

            System.out.print("Unesite elemente niza b: ");

            String tekstB = sc.nextLine();

            String[] elementiB = tekstB.split(" ");

            int[] nizB = new int[n];

            for (int i = 0; i < n; i++) {

                nizB[i] = Integer.parseInt(elementiB[i]);
            }

            int[] nizC = new int[2 * n];

            spoji(nizA, nizB, n, nizC);
        }

    }
}
