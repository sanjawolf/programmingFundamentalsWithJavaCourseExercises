import java.util.Scanner;

public class Zadatak_01_03_51_b {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite broj n: ");

        int n=Integer.parseInt(sc.nextLine());

        for(int i=1; i<=n; i++){

            for(int j=1; j<=i; j++) System.out.print("*");

            System.out.println();

        }
    }
}
