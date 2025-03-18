import java.util.Scanner;

public class Zadatak_01_03_52_b {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite broj n: ");

        int n=Integer.parseInt(sc.nextLine());

        for(int i=n; i>=1; i--){

            for(int j=1; j<=n-i; j++) System.out.print(" ");

            for(int j=1; j<=2*(i-1)+1; j++) System.out.print("*");

            System.out.println();
        }
    }
}
