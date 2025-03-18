import java.util.Scanner;

public class Zadatak_01_03_51_d {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite broj n: ");

        int n=Integer.parseInt(sc.nextLine());

        for(int i=0; i<n; i++){

            for(int j=1; j<=n-i; j++) System.out.print(" ");

            for(int k=n-i; k<=n; k++) System.out.print("*");

            System.out.println();
        }
    }
}
