import java.util.Scanner;

public class Zadatak_01_03_51_c {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite broj n: ");

        int n=Integer.parseInt(sc.nextLine());

        for(int i=0; i<n; i++){

            for(int j=1; j<i+1; j++) System.out.print(" ");

            for(int j=i+1; j<=n; j++) System.out.print("*");

            System.out.println();

        }
    }
}
