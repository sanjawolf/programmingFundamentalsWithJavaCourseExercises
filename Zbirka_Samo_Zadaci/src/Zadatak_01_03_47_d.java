import java.util.Scanner;

public class Zadatak_01_03_47_d {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite broj n: ");

        int n=Integer.parseInt(sc.nextLine());

        for(int i=0; i<=n-1; i++){

            for(int j=0; j<n-i; j++){

                System.out.printf("(%d,%d) ", i, j);
            }

            System.out.println();
        }
    }
}
