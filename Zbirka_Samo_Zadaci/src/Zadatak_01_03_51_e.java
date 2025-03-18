import java.util.Scanner;

public class Zadatak_01_03_51_e {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite broj n: ");

        int n=Integer.parseInt(sc.nextLine());

        for(int i=1; i<=n; i++){

            for(int j=1; j<=i; j++){

                System.out.print("*");
            }

            System.out.println();
        }

        for(int i=0; i<n; i++){

            for(int j=i+1; j<=n-1; j++){

                System.out.print("*");
            }

            System.out.println();
        }
    }
}
