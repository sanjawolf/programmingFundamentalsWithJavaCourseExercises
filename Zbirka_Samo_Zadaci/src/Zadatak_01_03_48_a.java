import java.util.Scanner;

public class Zadatak_01_03_48_a {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite broj n: ");

        int n=Integer.parseInt(sc.nextLine());

        for(int i=1; i<=n; i++) System.out.print("*");

        System.out.println();

        for(int j=1; j<=n-2; j++){

            System.out.print("*");

              for (int k=1; k<=n-2; k++){

                  System.out.print(" ");
              }

              System.out.print("*");

              System.out.println();
        }

        for(int i=1; i<=n; i++) System.out.print("*");
    }
}
